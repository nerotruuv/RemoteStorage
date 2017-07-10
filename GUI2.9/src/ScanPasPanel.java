import javax.swing.*;
import java.awt.*;

/**
 * Created by Raber on 6/5/2017.
 */
public class ScanPasPanel extends JPanel{

    private JLabel beginscherm;
    private JLabel background;
    private JLabel welkom;

    private JButton okButton;

    public ScanPasPanel(){
        setLayout(null);

        beginscherm = new JLabel();
        beginscherm.setHorizontalAlignment(SwingConstants.CENTER);
        beginscherm.setForeground(Color.white);
        beginscherm.setFont(new Font("Tahoma", Font.BOLD, 51));
        beginscherm.setText("Houd uw pinpas voor de scanner");
        beginscherm.setBounds(12, 400, 1890, 100);
        this.add(beginscherm);

        welkom = new JLabel();
        welkom.setHorizontalAlignment(SwingConstants.CENTER);
        welkom.setForeground(Color.white);
        welkom.setFont(new Font("Tahoma", Font.BOLD, 60));
        welkom.setText("Welkom bij The Grand Exchange");
        welkom.setBounds(12, 150, 1890, 100);
        this.add(welkom);

        okButton = new JButton("OK");
        okButton.setBounds(787, 500, 326, 74);
        this.add(okButton);

        background = new JLabel();
        background.setBounds(0, 0, 1920, 1080);
        this.add(background);
        ImageIcon imgThisImg = new ImageIcon("C:/Users/Raber/Documents/Project-4/background/background.jpg");
        background.setIcon(imgThisImg);

        setVisible(true);
    }

    public JButton getOkButton() {
        return okButton;
    }

    public void setOkButton(JButton okButton) {
        this.okButton = okButton;
    }
}
