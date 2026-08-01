
import javax.swing.Timer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final int MAX_POINTS = 10_000_000;
    private static int numPoints;
    private static PointGenerator generator = new PointGenerator();
    private static CircleChecker checker = new CircleChecker();
    private static int hits;
    private static int pointsDrawn;
    private static SimulationWindow window;

    public static void main(String[] args) {
        numPoints = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            while (numPoints <= 0) {
                System.out.print("Enter number of points to simulate (max " + MAX_POINTS + "): ");
                try {
                    numPoints = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid whole number.");
                    scanner.nextLine();
                    numPoints = 0;
                    continue;
                }

                if (numPoints <= 0) {
                    System.out.println("Please enter a positive number of points.");
                } else if (numPoints > MAX_POINTS) {
                    System.out.println("Too many points requested. Using the maximum allowed value of " + MAX_POINTS + ".");
                    numPoints = MAX_POINTS;
                }
            }
        }

        window = new SimulationWindow();
        window.setVisible(true);

        window.getRunAgainButton().addActionListener(e -> startSimulation());

        startSimulation();
    }

    private static void startSimulation() {
        window.getPanel().clearPoints();
        hits = 0;
        pointsDrawn = 0;
        window.getEstimateLabel().setText("Estimated pi: --");

        int pointsPerTick = Math.max(1, numPoints / 500);

        Timer timer = new Timer(10, null);
        timer.addActionListener(e -> {
            for (int i = 0; i < pointsPerTick && pointsDrawn < numPoints; i++) {
                Point p = generator.generatePoint();
                window.getPanel().addPoint(p);
                if (checker.isInsideCircle(p)) {
                    hits++;
                }
                pointsDrawn++;
            }

            window.getPanel().repaint();

            double piEstimate = 4.0 * hits / pointsDrawn;
            window.getEstimateLabel().setText(String.format("Estimated pi: %.5f", piEstimate));

            if (pointsDrawn >= numPoints) {
                ((Timer) e.getSource()).stop();
            }
        });
        timer.start();
    }
}