import javax.swing.*;
import java.awt.*;

/**
 * Created by Raber on 6/6/2017.
 */
public class EigenBedragInvoer extends JPanel {
    private JLabel invoerBedrag;
    private JTextArea eigenbedrag;
    private JButton bevestig;
    private JLabel background;
    private JButton mainMenu;
    private JButton saldo;
    private JButton breekaf;
    public EigenBedragInvoer(){
        this.setLayout(null);

        invoerBedrag = new JLabel();
        invoerBedrag.setHorizontalAlignment(SwingConstants.CENTER);
        invoerBedrag.setFont(new Font("Tahoma", Font.BOLD, 51));
        invoerBedrag.setText("Voer uw bedrag in. Let op beperkt tot tientallen!");
        invoerBedrag.setForeground(Color.WHITE);
        invoerBedrag.setBounds(12, 189, 1890, 232);
        this.add(invoerBedrag);

        eigenbedrag = new JTextArea();
        eigenbedrag.setFont(new Font("Tahoma", Font.BOLD, 99));
        eigenbedrag.setBounds(829, 440, 250, 109);
        this.add(eigenbedrag);

        bevestig = new JButton("Bevestig");
        bevestig.setBounds(792, 557, 326, 74);
        this.add(bevestig);

        saldo = new JButton("Saldo");
        saldo.setBounds(1300, 463, 326, 74);
        this.add(saldo);

        mainMenu = new JButton("Terug naar menu");
        mainMenu.setBounds(1300, 557, 326, 74);
        this.add(mainMenu);

        breekaf = new JButton("Afbreken");
        breekaf.setBounds(1300, 651, 326, 74);
        this.add(breekaf);

        background = new JLabel();
        background.setBounds(0, 0, 1920, 1080);
        this.add(background);
        ImageIcon imgThisImg = new ImageIcon("C:/Users/Raber/Documents/Project-4/background/background.jpg");

        background.setIcon(imgThisImg);

        this.setVisible(true);



    }
}
