import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Raber on 23-5-2017.
 */
public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PinProces pinproces = new PinProces();
                  //  pinproces.start();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

    }
}

