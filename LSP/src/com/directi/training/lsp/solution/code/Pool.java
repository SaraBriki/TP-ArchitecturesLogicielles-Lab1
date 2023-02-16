public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn();
        donaldDuck.quack();
        electricDuck.quack();
        donaldDuck.swim();
        electricDuck.swim();
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
