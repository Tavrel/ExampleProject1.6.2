public class Cat {
    private int weight;
    private String name;

    public Cat(int weight, String name) {
        this(name);
        this.weight = weight;
    }

    public Cat(String name) {
        this.name = name;
        this.weight = 10;
    }

    public Cat(){
        this(5, "adrh");



    }

}

class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(2, "barsic");
        Cat cat2 = new Cat("murka");
        Cat cat3 = new Cat();
    }
}