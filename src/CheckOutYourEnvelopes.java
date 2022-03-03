import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class CheckOutYourEnvelopes extends JFrame {


    private JPanel MainPanelEnvelopes;
    private JButton ReturnButton;

    public CheckOutYourEnvelopes(String checkOutYourEnvelopes){
        super(checkOutYourEnvelopes);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(MainPanelEnvelopes);
        this.pack();

        ReturnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                WelcomePage wp = new WelcomePage("My Budget App");
                wp.setVisible(true);
                wp.setSize(700,550);
                wp.setResizable(true);

                close();
            }
        });
    }
    public static void main(String[] args){
        JFrame CheckOutYourEnvelopes = new CheckOutYourEnvelopes("Check out your envelopes");
        CheckOutYourEnvelopes.setVisible(true);

    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

}
