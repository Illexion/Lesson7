public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке: " + food + " еды.");
    }

    public void setFood(int food) {  // это же и есть метод для добавления еды в тарелку... ну или можно сделать food +=n. но логичнее если мы повеливаем кормом полность и в + и в -
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public Boolean decreaseFood(int n) {
        if (food > n) {
            food -= n;
            return true;
        } else {
            System.out.println("Мало еды для котея"); //голос тарелки
        }
        return false;
    }
}
