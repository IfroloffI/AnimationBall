public class Animator extends Thread {
    private final Canvas canvas;

    public Animator(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void run() {
        float deltaX = 1.f;
        float deltaY = 0.5f;
        while (true) {
            try {
                if (canvas.getBallX() > canvas.getWindowX() - canvas.getBallSize() || canvas.getBallX() < 0) {
                    deltaX *= -1;
                }
                if (canvas.getBallY() > canvas.getWindowY() - canvas.getBallSize() || canvas.getBallY() < 0) {
                    deltaY *= -1;
                }
                float x = canvas.getBallX() + deltaX;
                float y = canvas.getBallY() + deltaY;
                BallObserver.fireBallEvent(new BallEvent(x, y));
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
