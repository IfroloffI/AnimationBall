import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    private static Canvas instance = null;

    public static Canvas getInstance() {
        if (instance == null)
            instance = new Canvas();
        return instance;
    }

    private float ballX;
    private float ballY;
    private int ballSize;
    private final int WindowX = 600;
    private final int WindowY = 600;

    private Canvas() {
        super(true);
        ballX = 100;
        ballY = 100;
        ballSize = 50;
    }

    public int getBallSize() {
        return ballSize;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillOval(Math.round(ballX), Math.round(ballY), ballSize, ballSize);
    }

    public void setPos(float x, float y) {
        this.ballX = x;
        this.ballY = y;
        repaint();
    }

    public float getBallX() {
        return ballX;
    }

    public float getBallY() {
        return ballY;
    }

    public int getWindowY() {
        return WindowY;
    }

    public int getWindowX() {
        return WindowX;
    }
}
