public class Point extends Shape{
    public Point(int x, int y) {
        super(x, y);
    }

    public void draw() {
        System.out.println(this.x + ":" + this.y + " 점");
    }
}