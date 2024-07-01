public class BallPositionListener implements BallListener {
    @Override
    public void onPositionChanged(BallEvent event) {
        Canvas.getInstance().setPos(event.getX(), event.getY());
        System.out.println("Hello!");
    }
}
