import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class PurchaseHistory extends JFrame {
    private JPanel PurchaseHistoryPanel;
    private JButton ReturnButton;
    private JTextArea textArea1;

    public PurchaseHistory (String purchaseHistory){
        super(purchaseHistory);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(PurchaseHistoryPanel);
        this.pack();
        ReturnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WelcomePage wp = new WelcomePage("My Budget App");
                wp.setVisible(true);
                wp.setSize(700,550);
                wp.setResizable(false);
                close();
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new WelcomePage("My Budget App");
        frame.setVisible(true);
        frame.setSize(700,550);
        frame.setResizable(false);

    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}
