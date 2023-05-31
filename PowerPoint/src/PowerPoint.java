import java.util.ArrayList;
import java.util.List;

public class PowerPoint {
    private List<Draw> draws = new ArrayList<>();
    
    public void draw() {
        for (Draw draw : draws) {
            draw.draw();
        }
    }

    public void add(Draw draw) {
        draws.add(draw);
    }
}