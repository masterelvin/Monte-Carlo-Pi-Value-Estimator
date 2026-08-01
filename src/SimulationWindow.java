import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class SimulationWindow extends JFrame {
    private SimulationPanel panel;
    private JLabel estimateLabel;
    private JButton runAgainButton;

    public SimulationWindow() {
        setTitle("Monte Carlo Pi Estimator");
        setSize(600, 680);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new SimulationPanel();
        estimateLabel = new JLabel("Estimated pi: --");
        runAgainButton = new JButton("Run Again");

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(estimateLabel);
        bottomPanel.add(runAgainButton);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    public SimulationPanel getPanel() {
        return panel;
    }

    public JLabel getEstimateLabel() {
        return estimateLabel;
    }

    public JButton getRunAgainButton() {
        return runAgainButton;
    }
}