import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class SimulationPanel extends JPanel {
    private List<Point> points = new ArrayList<>();
    private CircleChecker checker = new CircleChecker();

    public void addPoint(Point p) {
        points.add(p);
    }

    public void clearPoints() {
        points.clear();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(50, 50, 400, 400);
        g.drawOval(50, 50, 400, 400);

        for (Point p : points) {
            int pixelX = (int) (50 + (p.x + 1) / 2 * 400);
            int pixelY = (int) (50 + (1 - p.y) / 2 * 400);

            if (checker.isInsideCircle(p)) {
                g.setColor(Color.GREEN);
            } else {
                g.setColor(Color.RED);
            }
            g.fillOval(pixelX, pixelY, 4, 4);
        }
    }
}