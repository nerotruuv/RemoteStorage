import javax.swing.*;
import java.awt.*;

/**
 * Created by Raber on 6/6/2017.
 */
public class BiljettenKiezen extends JPanel {
    private JLabel kiesbrieven;
    private JLabel background;
    private JButton biljet10;
    private JButton biljet20;
    private JButton biljet50;

    public BiljettenKiezen(){
        setLayout(null);

        kiesbrieven = new JLabel();
        kiesbrieven.setHorizontalAlignment(SwingConstants.CENTER);
        kiesbrieven.setForeground(Color.white);
        kiesbrieven.setFont(new Font("Tahoma", Font.BOLD, 60));
        kiesbrieven.setText("Kies welke biljetten u wilt");
        kiesbrieven.setBounds(12, 150, 1890, 100);
        this.add(kiesbrieven);

        biljet10 = new JButton("10 euro biljet");
        biljet10.setBounds(300, 463, 326,74);
        this.add(biljet10);

        biljet20 = new JButton("20 euro biljet");
        biljet20.setBounds(300, 557, 326,74);
        this.add(biljet20);

        biljet50 = new JButton("50 euro biljet");
        biljet50.setBounds(300, 651, 326, 74);
        this.add(biljet50);

        background = new JLabel();
        background.setBounds(0, 0, 1920, 1080);
        this.add(background);
        ImageIcon imgThisImg = new ImageIcon("C:/Users/Raber/Documents/Project-4/background/background.jpg");

        background.setIcon(imgThisImg);

        this.setVisible(true);
        
    }

    public void InputPopup(){
        JOptionPane.showMessageDialog(this,
                "Ingevoerde bedrag is incorrect, probeer opnieuw.",
                "Foute Input",
                JOptionPane.PLAIN_MESSAGE);
    }

    public void BiljettePopup(){
        JOptionPane.showMessageDialog(this,
                "Ingevoerde aantal biljetten is niet aanwezig.",
                "Invoer Incorrect",
                JOptionPane.PLAIN_MESSAGE);
    }
    public void SaldoPopup(){
        JOptionPane.showMessageDialog(this,
                "Ingevoerde bedrag overschreid .",
                "Foute input",
                JOptionPane.PLAIN_MESSAGE);
    }
}
