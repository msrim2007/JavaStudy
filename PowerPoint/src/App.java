public class App {
    public static void main(String[] args) {
        PowerPoint ppt = new PowerPoint();

        ppt.add(new Rectangle(1, 1, 2, 2));
        ppt.add(new Rectangle(11, 11, 22, 22));
        ppt.add(new Line(3, 3, 4, 4));
        ppt.add(new Triangle(5, 5, 6, 6, 7, 7));

        ppt.draw();
    }
}