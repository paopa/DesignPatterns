package per.pao.example.compound.mvc;

public class Application {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModelInterface.BeatModel();
        ControllerInterface controller = new ControllerInterface.BeatController(model);
    }
}
