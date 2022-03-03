import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class WelcomePage extends JFrame{
    private JPanel MainPanel;
    private JLabel WelcomeLabel;
    private JButton InfoButton;
    private JButton RecordPurchaseButton;
    private JButton PurchaseHistoryButton;
    private JButton CheckAmountButton;
    private JButton EnterPanel;
    private JButton Analytics;

    public WelcomePage(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(MainPanel);
        this.pack();

        InfoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GeneralInfo gi = new GeneralInfo("General Information");
                gi.setVisible(true);
                gi.setSize(700,550);
                gi.setResizable(false);
                close();
            }
        });
        EnterPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EnterNewIncome eni = new EnterNewIncome("Enter New Income");
                eni.setVisible(true);
                eni.setSize(700,550);
                eni.setResizable(false);
                close();
            }
        });
        CheckAmountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CheckOutYourEnvelopes coye = new CheckOutYourEnvelopes("Check out your envelopes");
                coye.setVisible(true);
                coye.setSize(700,550);
                coye.setResizable(false);
                close();
            }
        });
        RecordPurchaseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RecordPurchase rp = new RecordPurchase(" Record Purchase");
                rp.setVisible(true);
                rp.setSize(700,550);
                rp.setResizable(false);
                close();
            }
        });
        PurchaseHistoryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PurchaseHistory ph = new PurchaseHistory(" Purchase History");
                ph.setVisible(true);
                ph.setSize(700,550);
                ph.setResizable(false);
                close();
            }
        });
        Analytics.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Analytics analytics = new Analytics("Analytics");
                analytics.setVisible(true);
                analytics.setSize(700,550);
                analytics.setResizable(false);
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
}}
