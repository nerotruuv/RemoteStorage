import javax.swing.*;
import java.awt.*;

/**
 * Created by Raber on 6/5/2017.
 */
public class MainFrame extends JFrame {
    public MainFrame(){
        setTitle("THE GRAND EXCHANGE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(1920, 1080);
        setResizable(false);
        setVisible(true);
    }





}
