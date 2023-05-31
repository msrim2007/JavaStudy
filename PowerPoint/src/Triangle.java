public class Triangle extends Shape {
    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Triangle(int x, int y, int x1, int y1, int x2, int y2) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw() {
        System.out.println(this.x + ":" + this.y + ":" + this.x1 + ":" + this.y1 + ":" + this.x2 + ":" + this.y2 + " 삼각형");
    }
}