import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class GeneralInfo extends JFrame {

    private JPanel GeneralInfoPanel;
    private JLabel WelcomeField;
    private JButton CloseButton;

    public GeneralInfo(String general_information){
            super(general_information);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setContentPane(GeneralInfoPanel);
            this.pack();


        CloseButton.addActionListener(new ActionListener() {
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
            JFrame generalInfo = new GeneralInfo("General Information");
            generalInfo.setVisible(true);

        }
        public void close(){
            WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        }
    }

