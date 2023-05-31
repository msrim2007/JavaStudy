import java.util.ArrayList;
import java.util.List;

public class PowerPoint {
    private List<Rectangle> rectangles = new ArrayList<>();
    private List<Line> lines = new ArrayList<>();
    
    public void draw() {
        for(Rectangle rectangle : rectangles) {
            rectangle.draw();
        }

        for(Line line : lines) {
            line.draw();
        }
    }

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public void add(Line line) {
        lines.add(line);
    }
}
