public class Task1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Rocket", 4);
        Cat cat1 = new Cat("Comet", 6);
        Cat cat2 = new Cat("Stone", 5);
        Cat cat3 = new Cat("Abadon", 666);
        Plate plate = new Plate(16);
        plate.info();

        cat.eat(plate);
        cat1.eat(plate);
        cat2.eat(plate);
        cat3.eat(plate);

        plate.info();

        cat.info();
        cat1.info();
        cat2.info();
        cat3.info();

    }
}
