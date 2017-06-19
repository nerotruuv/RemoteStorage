import javax.swing.*;
import java.awt.*;

/**
 * Created by Raber on 6/6/2017.
 */
public class MainMenuPanel extends JPanel {
    private JButton breekaf;
    private JButton snelpin10;
    private JButton snelpin20;
    private JButton snelpin50;
    private JButton saldoOpvragen;
    private JButton bedragInvoeren;
    
    private JLabel welkom;
    private JLabel maakKeuze;
    private JLabel background;
    
    public MainMenuPanel(){
        this.setLayout(null);

        welkom = new JLabel();
        welkom.setHorizontalAlignment(SwingConstants.CENTER);
        welkom.setForeground(Color.white);
        welkom.setFont(new Font("Tahoma", Font.BOLD, 60));
        welkom.setText("Welkom");
        welkom.setBounds(12, 150, 1890, 100);
        this.add(welkom);

        maakKeuze = new JLabel();
        maakKeuze.setHorizontalAlignment(SwingConstants.CENTER);
        maakKeuze.setForeground(Color.white);
        maakKeuze.setFont(new Font("Tahoma", Font.BOLD, 51));
        maakKeuze.setText("Maak uw keuze");
        maakKeuze.setBounds(12, 300, 1890, 100);
        this.add(maakKeuze);


        saldoOpvragen = new JButton("Saldo");
        saldoOpvragen.setBounds(1300, 463, 326, 74);
        this.add(saldoOpvragen);

        bedragInvoeren = new JButton("Eigen bedrag");
        bedragInvoeren.setBounds(1300, 557, 326, 74);
        this.add(bedragInvoeren);

        breekaf = new JButton("Afbreken");
        breekaf.setBounds(1300, 651, 326, 74);
        this.add(breekaf);

        snelpin10 = new JButton("10 euros");
        snelpin10.setBounds(300, 463, 326,74);
        this.add(snelpin10);

        snelpin20 = new JButton("20 euro");
        snelpin20.setBounds(300, 557, 326,74);
        this.add(snelpin20);

        snelpin50 = new JButton("50 euro");
        snelpin50.setBounds(300, 651, 326, 74);
        this.add(snelpin50);

        background = new JLabel();
        background.setBounds(0, 0, 1920, 1080);
        this.add(background);
        ImageIcon imgThisImg = new ImageIcon("C:/Users/Raber/Documents/Project-4/background/background.jpg");

        background.setIcon(imgThisImg);

        this.setVisible(true);
    }
}
