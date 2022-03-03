import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class RecordPurchase extends JFrame {

    private JPanel PurchasePanel;
    private JButton ReturnButton;

    public RecordPurchase(String recordPurchase){
        super(recordPurchase);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(PurchasePanel);
        this.pack();
        ReturnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomePage wp = new WelcomePage("My Budget App");
                wp.setVisible(true);
                wp.setSize(700,550);
                wp.setResizable(true);
                close();
            }
        });
    }
    public static void main(String[] args){
        JFrame recordPurchase = new RecordPurchase("My Budget App");
        recordPurchase.setVisible(true);
        recordPurchase.setSize(700,550);
        recordPurchase.setResizable(false);

    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}
