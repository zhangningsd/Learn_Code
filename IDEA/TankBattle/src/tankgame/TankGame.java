package tankgame;

import org.omg.PortableServer.THREAD_POLICY_ID;

import javax.swing.*;
import java.awt.*;

public class TankGame extends JFrame {
    MyPanel myPanel = null;

    public static void main(String[] args) {
        new TankGame();
    }

    public TankGame() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000, 1000);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
