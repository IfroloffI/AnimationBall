import java.util.ArrayList;

public abstract class BallObserver {

    private static ArrayList<BallListener> listeners = null;

    private static class ObserveThread extends Thread {
        private BallEvent event;

        public ObserveThread(BallEvent event) {
            super();
            this.event = event;
            this.start();
        }

        @Override
        public void run() {
            for (BallListener listener : getListeners())
                listener.onPositionChanged(event);
        }
    }

    private static ArrayList<BallListener> getListeners() {
        if (listeners == null)
            listeners = new ArrayList<>();
        return listeners;
    }

    public static void addListener(BallListener listener) {
        getListeners().add(listener);
    }

    public static void removeListener(BallListener listener) {
        getListeners().remove(listener);
    }

    public static void fireBallEvent(BallEvent event) {
        new ObserveThread(event);
    }

}
