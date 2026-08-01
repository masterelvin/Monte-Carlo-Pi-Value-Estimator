public class CircleChecker {
    public boolean isInsideCircle(Point p) {
        return (p.x * p.x + p.y * p.y) <= 1;
    }
}