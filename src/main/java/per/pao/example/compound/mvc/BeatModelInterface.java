package per.pao.example.compound.mvc;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);

    class BeatModel implements BeatModelInterface, MetaEventListener {

        Sequencer sequencer;
        private final List<BeatObserver> beatObservers = new ArrayList();
        private final List<BPMObserver> bpmObservers = new ArrayList();
        private int bpm = 90;
        private Sequence sequence;
        private Track track;

        @Override
        public void meta(MetaMessage meta) {
            if (meta.getType() == 47) {
                beatEvent();
                sequencer.start();
                setBPM(getBPM());
            }
        }

        @Override
        public void initialize() {
            setUpMidi();
            buildTrackAndStart();
        }

        private void buildTrackAndStart() {
            int[] trackList = {35, 0, 46, 0};
            sequence.deleteTrack(null);
            track = sequence.createTrack();
            makeTracks(trackList);
            track.add(makeEvent(192, 9, 1, 0, 4));
            try {
                sequencer.setSequence(sequence);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
            ShortMessage message = new ShortMessage();
            try {
                message.setMessage(comd, chan, one, two);
            } catch (InvalidMidiDataException e) {
                e.printStackTrace();
            }
            return new MidiEvent(message, tick);
        }

        private void makeTracks(int[] list) {
            int i = 0;
            for (int key : list) {
                if (key != 0) {
                    this.track.add(makeEvent(144, 9, key, 100, i));
                    this.track.add(makeEvent(128, 9, key, 100, i + 1));
                }
                i++;
            }
        }

        private void setUpMidi() {
            try {
                sequencer = MidiSystem.getSequencer();
                sequencer.open();
                sequencer.addMetaEventListener(this);
                sequence = new Sequence(Sequence.PPQ, 4);
                track = sequence.createTrack();
                sequencer.setTempoInBPM(getBPM());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void on() {
            sequencer.start();
            setBPM(90);
        }

        @Override
        public void off() {
            setBPM(0);
            sequencer.stop();
        }

        @Override
        public void setBPM(int bpm) {
            this.bpm = bpm;
            sequencer.setTempoInBPM(getBPM());
            notifyBPMObservers();
        }

        @Override
        public int getBPM() {
            return this.bpm;
        }

        void beatEvent() {
            notifyBeatObservers();
        }

        @Override
        public void registerObserver(BeatObserver o) {
            this.beatObservers.add(o);
        }

        @Override
        public void removeObserver(BeatObserver o) {
            this.beatObservers.remove(o);
        }

        private void notifyBeatObservers() {
            beatObservers.forEach(BeatObserver::updateBeat);
        }

        @Override
        public void registerObserver(BPMObserver o) {
            this.bpmObservers.add(o);
        }

        @Override
        public void removeObserver(BPMObserver o) {
            this.bpmObservers.remove(o);
        }

        private void notifyBPMObservers() {
            bpmObservers.forEach(BPMObserver::updateBPM);
        }
    }
}
