import javax.swing.*;
import java.awt.*;

// https://vk.cc/chPRoa

public class Main {
    public static void main(String[] args) {
        int wndWidth = 600;
        int wndHeight = 600;
        JFrame wnd = new JFrame("The Ball");
        BallObserver.addListener(new BallPositionListener());
        Canvas canvas = Canvas.getInstance();
        Animator animator = new Animator(canvas);
        animator.start();
        wnd.setLayout(new BorderLayout());
        wnd.add(canvas, BorderLayout.CENTER);
        wnd.setSize(wndWidth, wndHeight);
        wnd.setResizable(false);
        wnd.setLocation(300, 300);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setVisible(true);
    }
}