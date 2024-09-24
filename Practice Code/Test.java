
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        frame.setSize(350, 250);
        JLabel label = new JLabel("Test", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
