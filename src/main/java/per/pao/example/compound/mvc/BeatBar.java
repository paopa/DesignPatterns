package per.pao.example.compound.mvc;

import javax.swing.*;
import java.io.Serial;
import java.io.Serializable;

public class BeatBar extends JProgressBar implements Runnable, Serializable {
    @Serial
    private static final long serialVersionUID = -7241817890547884571L;
    Thread thread = new Thread(this);

    public BeatBar() {
        setMaximum(100);
        thread.start();
    }

    @Override
    public void run() {
        for (; ; ) {
            int value = getValue();
            setValue((int) (value * 0.75));
            repaint();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
