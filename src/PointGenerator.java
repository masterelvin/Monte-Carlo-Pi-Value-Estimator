public class PointGenerator {
    public Point generatePoint() {
        double x = (Math.random() * 2) - 1;
        double y = (Math.random() * 2) - 1;
        return new Point(x, y);
    }
}