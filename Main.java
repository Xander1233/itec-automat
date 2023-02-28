public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.addAutomat(new TestAutomat());

        manager.start();
    }
}
