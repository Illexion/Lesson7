public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Boolean eat(Plate plate) {
        System.out.println("_________________________________________");
        System.out.println("Кот " + name + " пытается поесть...");
        satiety = plate.decreaseFood(appetite);
        if (satiety){
            System.out.println( "Успешно!");
        } else {
            System.out.println("Еды не хватило, режим ненависти активирован");
        }
        return satiety;

    }

    public int getAppetite() {
        return appetite;
    }

    public void info(){
        System.out.println("Кот " + name + ", Аппетит " + appetite + ", Сытость: " + satiety);
    }
}
