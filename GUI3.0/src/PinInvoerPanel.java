import javax.swing.*;
import java.awt.*;

/**
 * Created by Raber on 6/5/2017.
 */

public class PinInvoerPanel extends JPanel {
    private JLabel pinInvoer;
    private JPasswordField passwordField;
    private JButton okButton;
    private JButton breekaf;
    private JLabel background;

    public PinInvoerPanel(){
        setLayout(null);

        pinInvoer = new JLabel();
        pinInvoer.setHorizontalAlignment(SwingConstants.CENTER);
        pinInvoer.setForeground(Color.white);
        pinInvoer.setFont(new Font("Tahoma", Font.BOLD, 51));
        pinInvoer.setText("Voer uw pincode in");
        pinInvoer.setBounds(12, 189, 1890, 232);
        this.add(pinInvoer);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 99));
        passwordField.setBounds(835, 463, 194, 109);
        this.add(passwordField);

        okButton = new JButton("OK");
        okButton.setBounds(1300, 463, 326, 74);
        this.add(okButton);

        breekaf = new JButton("Afbreken");
        breekaf.setBounds(1300, 557, 326, 74);
        this.add(breekaf);

        background = new JLabel();
        background.setBounds(0, 0, 1920, 1080);
        this.add(background);
        ImageIcon imgThisImg = new ImageIcon("C:/Users/Raber/Documents/Project-4/background/background.jpg");

        background.setIcon(imgThisImg);

        this.setVisible(true);

    }

    public JButton getOkButton() {
        return okButton;
    }

    public JButton getBreekaf() {
        return breekaf;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JLabel getPinInvoer() {
        return pinInvoer;
    }

    public void PinPopup(){
        JOptionPane.showMessageDialog(this,
                "Incorrecte pincode.",
                "",
                JOptionPane.PLAIN_MESSAGE);
    }

    public void InlogPopup(){
        JOptionPane.showMessageDialog(this,
                "Aantal inlog pogingen overschreden.",
                ">:3",
                JOptionPane.PLAIN_MESSAGE);
    }

    public void PasPopup(){
        JOptionPane.showMessageDialog(this,
                "Ongeldige pas ingevoert.",
                "ERROR",
                JOptionPane.PLAIN_MESSAGE);
    }



}
