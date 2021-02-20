package per.pao.example.compound.mvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DJView implements ActionListener, BeatObserver, BPMObserver {

    BeatModelInterface model;
    ControllerInterface controller;

    JFrame viewFrame;
    JPanel viewPanel;
    BeatBar beatBar;
    JLabel bpmOutputLabel;

    JFrame controlFrame;
    JPanel controlPanel;
    JLabel bpmLabel;
    JTextField bpmTextField;
    JButton setBpmButton;
    JButton increaseBPMButton;
    JButton decreaseBPMButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;

    public DJView(ControllerInterface controller, BeatModelInterface model) {
        this.controller = controller;
        this.model = model;
        model.registerObserver((BeatObserver) this);
        model.registerObserver((BPMObserver) this);
    }

    public void createView() {
        this.viewPanel = new JPanel(new GridLayout(1, 2));
        this.viewFrame = new JFrame("View");
        this.viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.viewFrame.setSize(new Dimension(100, 80));
        this.bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
        this.beatBar = new BeatBar();
        this.beatBar.setValue(0);
        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        bpmPanel.add(this.beatBar);
        bpmPanel.add(this.bpmOutputLabel);
        this.viewPanel.add(bpmPanel);
        this.viewFrame.getContentPane().add(this.viewPanel, BorderLayout.CENTER);
        this.viewFrame.pack();
        this.viewFrame.setVisible(true);
    }

    public void createControls() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        this.controlFrame = new JFrame("Control");
        this.controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.controlFrame.setSize(new Dimension(100, 80));

        this.controlPanel = new JPanel(new GridLayout(1, 2));

        this.menuBar = new JMenuBar();
        this.menu = new JMenu("DJ Control");

        this.startMenuItem = new JMenuItem("Start");
        this.menu.add(this.startMenuItem);
        this.startMenuItem.addActionListener(e -> this.controller.start());

        this.stopMenuItem = new JMenuItem("Stop");
        this.menu.add(this.stopMenuItem);
        this.stopMenuItem.addActionListener(e -> this.controller.stop());

        JMenuItem exit = new JMenuItem("Quit");
        exit.addActionListener(e -> System.exit(0));
        this.menu.add(exit);
        this.menuBar.add(menu);
        this.controlFrame.setJMenuBar(menuBar);

        this.bpmTextField = new JTextField(2);
        this.bpmLabel = new JLabel("Enter BPM:", SwingConstants.RIGHT);
        this.setBpmButton = new JButton("Set");
        this.setBpmButton.setSize(new Dimension(10, 40));
        this.increaseBPMButton = new JButton(">>");
        this.decreaseBPMButton = new JButton("<<");
        this.setBpmButton.addActionListener(this);
        this.increaseBPMButton.addActionListener(this);
        this.decreaseBPMButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(this.decreaseBPMButton);
        buttonPanel.add(this.increaseBPMButton);

        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        enterPanel.add(this.bpmLabel);
        enterPanel.add(this.bpmTextField);
        JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(this.setBpmButton);
        insideControlPanel.add(buttonPanel);
        this.controlPanel.add(insideControlPanel);

        this.bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        this.bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        this.controlFrame.getRootPane().setDefaultButton(this.setBpmButton);
        this.controlFrame.getContentPane().add(this.controlPanel, BorderLayout.CENTER);

        this.controlFrame.pack();
        this.controlFrame.setVisible(true);

    }

    public void enableStopMenuItem() {
        this.stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem() {
        this.stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        this.startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem() {
        this.startMenuItem.setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.setBpmButton) {
            controller.setBPM(Integer.parseInt(this.bpmTextField.getText()));
        } else if (e.getSource() == this.increaseBPMButton) {
            controller.increaseBPM();
        } else if (e.getSource() == this.decreaseBPMButton) {
            controller.decreaseBPM();
        }
    }

    @Override
    public void updateBPM() {
        if (this.model.getBPM() == 0) {
            bpmOutputLabel.setText("offline");
        } else {
            bpmOutputLabel.setText("Current BPM: " + this.model.getBPM());
        }
    }

    @Override
    public void updateBeat() {
        beatBar.setValue(100);
    }
}
