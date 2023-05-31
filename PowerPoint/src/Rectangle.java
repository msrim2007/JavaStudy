public class Rectangle extends Shape {
    public int x1;
    public int y1;

    public Rectangle(int x, int y, int x1, int y1) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public void draw() {
        System.out.println(this.x + ":" + this.y + ":" + this.x1 + ":" + this.y1 + " 사각형");
    }
}
