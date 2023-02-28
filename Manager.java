import java.util.ArrayList;

public class Manager {

    private ArrayList<Automat> automaten = new ArrayList<Automat>();

    private USBOptoRel32 module;

    public void addAutomat(Automat automat) {
        automaten.add(automat);
    }

    private void cycle() {

        int input = module.digitalIn();

        System.out.println(Integer.toBinaryString(input));

        // int result = 0;

        // for (Automat automat : automaten) {
        //     result |= automat.transition(input & automat.getInputMask()) & automat.getOutputMask();
        // }

        // Integer.toBinaryString(result);

        /*module.digitalOut(automaten.stream().reduce(
                0,
                (accu, automat) -> {
                    return accu | automat.transition(input & automat.getInputMask()) & automat.getOutputMask();
                },
                (a, b) -> a | b));*/
    }

    public void start() {
        while (true) {
            cycle();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
