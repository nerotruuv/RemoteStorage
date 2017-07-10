import javax.swing.*;
import java.awt.*;

/**
 * Created by Raber on 6/6/2017.
 */
public class SaldoInfo extends JPanel {
    private JButton breakaf;
    private JButton eigenBedrag;
    private JButton mainMenu;

    private JButton snelpin10;
    private JButton snelpin20;
    private JButton snelpin50;
    
    private JLabel saldo;
    private JLabel uwsaldois;
    private JLabel background;

    public SaldoInfo(){
        this.setLayout(null);
        
        uwsaldois = new JLabel();
        uwsaldois.setHorizontalAlignment(SwingConstants.CENTER);
        uwsaldois.setForeground(Color.white);
        uwsaldois.setFont(new Font("Tahoma", Font.BOLD, 60));
        uwsaldois.setText("Uw saldo");
        uwsaldois.setBounds(12, 150, 1890, 100);
        this.add(uwsaldois);

        saldo = new JLabel();
        saldo.setHorizontalAlignment(SwingConstants.CENTER);
        saldo.setForeground(Color.white);
        saldo.setFont(new Font("Tahoma", Font.BOLD, 51));
        saldo.setText("300 Euro");
        saldo.setBounds(12, 300, 1890, 100);
        this.add(saldo);
s
        eigenBedrag = new JButton("Eigen bedrag ");
        eigenBedrag.setBounds(1300, 463, 326, 74);
        this.add(eigenBedrag);

        mainMenu = new JButton("Terug naar menu");
        mainMenu.setBounds(1300, 557, 326, 74);
        this.add(mainMenu);

        breakaf = new JButton("Afbreken");
        breakaf.setBounds(1300, 651, 326, 74);
        this.add(breakaf);

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

    public JLabel getSaldo() {
        return saldo;
    }
}
