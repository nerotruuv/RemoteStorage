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
        setSize(1920, 1080);
        setResizable(false);
        setVisible(true);
    }

    public void PasPopup(){
        JOptionPane.showMessageDialog(this,
                "Ongeldige pas ingevoert.",
                "ERROR",
                JOptionPane.PLAIN_MESSAGE);
    }

    public void InlogPopup(){
        JOptionPane.showMessageDialog(this,
                "Aantal inlog pogingen overschreden.",
                ">:3",
                JOptionPane.PLAIN_MESSAGE);
    }

    public void PinPopup(){
        JOptionPane.showMessageDialog(this,
                "Incorrecte pincode.",
                "",
                JOptionPane.PLAIN_MESSAGE);
    }

}
