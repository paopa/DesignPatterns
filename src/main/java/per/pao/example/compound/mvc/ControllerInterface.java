package per.pao.example.compound.mvc;

public interface ControllerInterface {
    void start();

    void stop();

    void increaseBPM();

    void decreaseBPM();

    void setBPM(int bpm);

    class BeatController implements ControllerInterface {

        BeatModelInterface model;
        DJView view;

        public BeatController(BeatModelInterface model) {
            this.model = model;
            this.view = new DJView(this, model);
            this.view.createView();
            this.view.createControls();
            this.view.disableStopMenuItem();
            this.view.enableStartMenuItem();
            model.initialize();
        }

        @Override
        public void start() {
            this.model.on();
            this.view.disableStartMenuItem();
            this.view.enableStopMenuItem();
        }

        @Override
        public void stop() {
            this.model.off();
            this.view.disableStopMenuItem();
            this.view.enableStartMenuItem();
        }

        @Override
        public void increaseBPM() {
            this.model.setBPM(this.model.getBPM() + 1);
        }

        @Override
        public void decreaseBPM() {
            this.model.setBPM(this.model.getBPM() - 1);
        }

        @Override
        public void setBPM(int bpm) {
            this.model.setBPM(bpm);
        }
    }
}
