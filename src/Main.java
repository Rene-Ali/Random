import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Willkommen zur Lottoziehung von heute");

        Random random = new Random();

        int x = random.nextInt(46);
        int y = random.nextInt(46);
        int z = random.nextInt(46);
        int a = random.nextInt(46);
        int b = random.nextInt(46);
        int d = random.nextInt(46);
        int c = random.nextInt(46);

        JOptionPane.showMessageDialog(null, x + " " + y + " " + z + " " + a + " " + b + " " + d + " Zusatzzahl:  " + c);

    }
}