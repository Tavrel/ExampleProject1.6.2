public class Dog {
    private final double originWeight;
    private double weight;

    public Dog() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Dog(double weight) {
        this.weight = weight;
        this.originWeight = weight;
    }

    public void woof() {
        weight = weight - 1;
        System.out.println("woof");
    }

    public void feed(Double amount) { // объявляем публичный метод фид, которому даём параметры. Принимай переменные типа дабл, называем их амаунд
        weight = weight + amount;
    }
    public void feed() { // объявляем публичный метод фид, которому даём параметры. Принимай переменные типа дабл, называем их амаунд
        weight = weight + 100;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public void pee() {
        weight = weight - 10;
        System.out.println("Clean it, man!");
    }

    public double getWeight() {
        return weight;
    }
}

