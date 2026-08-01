public class MonteCarloSimulation {
    public int runTrials(int numPoints) {
        int hits = 0;
        for (int i = 0; i < numPoints; i++) {
            Point p = new PointGenerator().generatePoint();
            if (new CircleChecker().isInsideCircle(p)) {
                hits++;
            }
        }
        return hits;
    }

    public double estimatePi(int hits, int total) {
        return (double) hits / total * 4;
    }
}
