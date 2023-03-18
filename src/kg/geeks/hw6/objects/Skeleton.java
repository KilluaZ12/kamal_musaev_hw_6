package kg.geeks.hw6.objects;

public class Skeleton extends Boss {

    private int countOfArrows;
    public Skeleton(int health, int damage, int countOfArrows) {
        super(health, damage);
        this.countOfArrows = countOfArrows;
    }

    public int getCountOfArrows() {
        return countOfArrows;
    }

    public void setCountOfArrows(int countOfArrows) {
        this.countOfArrows = countOfArrows;
    }

    public String printInfo() {
        return super.printInfo() + ", Count of arrows: " + this.countOfArrows;
    }
}
