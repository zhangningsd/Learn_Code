import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    private MyPanel myPanel = null;
    public static void main(String[ ] args) {
        new DrawCircle();

    }

    public DrawCircle() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.CYAN);
        g.fillRect(10, 10, 20, 150);
        g.fillRect(30, 35, 50, 100);
        g.fillRect(80, 10, 20, 150);
        g.fillRect(54, 10, 2, 50);
        g.fillOval(30, 60, 50, 50);
        g.setColor(Color.BLACK);
        g.drawLine(10, 10, 30, 10);
        g.drawLine(30, 10, 30, 160);
        g.drawLine(10, 10, 10, 160);
        g.drawLine(10, 160, 30, 160);


    }


}
