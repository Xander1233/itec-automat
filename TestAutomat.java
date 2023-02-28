public class TestAutomat extends Automat {

    private int counter = 0;

    TestAutomat() {
        super(0b11100, 0b11100);
    }

    @Override
    public int transition(int input) {
        return 0b11111;
    }

    @Override
    public boolean isFinished() {
        return counter++ > 10;
    }
}
