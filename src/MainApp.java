import javax.swing.*;
import java.awt.*;

public class MainApp {

    public static int WIDTH = 1000;
    public static int HEIGHT = 600;

    public static void main(String[] args) {



        JFrame frame = new JFrame("Sandin Chat");
        JLabel label = new JLabel();


        label.setVisible(true);
        label.setText("Welcome to Sandin Chat");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setAlignmentY(Component.CENTER_ALIGNMENT);

        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);


        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
