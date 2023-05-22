package HelloUniverse.Increase;

public class Increase {
    private int num;

    Increase(int num) {
        this.num = num;
    }

    public int postIncrease() {
        int tmp = this.num;
        this.num += 1;
        return tmp;
    }

    public int preIncrease() {
        this.num += 1;
        return this.num;
    }

    @Override
    public String toString() {
        return this.num + "";
    }
}