import java.util.ArrayList;
import java.util.List;

public class PowerPoint {
    private List<Shape> shapes = new ArrayList<>();
    
    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }
}
