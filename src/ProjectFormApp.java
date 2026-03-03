import javax.swing.*;
import java.awt.*;

public class ProjectFormApp {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Software Project Registration Form");

        frame.setSize(500, 450);

        ProjectFormPanel panel = new ProjectFormPanel();

        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}