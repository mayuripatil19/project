import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class STUDENTMA {
    private JTextField txtStname;
    private JTextField txtRl;
    private JTextField txtDM;
    private JTextField txtCM;
    private JTextField txtSM;
    private JTextField txtMM;
    private JTextField txtPM;
    private JTextField txtTM;
    private JTextField txtAVG;
    private JTextField txtGRADE;
    private JButton CALButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("STUDENTMA");
        frame.setContentPane(new STUDENTMA().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public STUDENTMA() {
        CALButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int DBMSmarks,CGmarks,M3marks,SEmarks,PAmarks,TOTAL;
                double avg;
                DBMSmarks=Integer.parseInt(txtDM.getText());
                CGmarks=Integer.parseInt(txtCM.getText());
                PAmarks=Integer.parseInt(txtPM.getText());
                SEmarks=Integer.parseInt(txtSM.getText());
                M3marks=Integer.parseInt(txtMM.getText());

                TOTAL=DBMSmarks+CGmarks+M3marks+SEmarks+PAmarks;

                txtTM.setText(String.valueOf(TOTAL));

                avg=TOTAL/5;
                txtAVG.setText(String.valueOf(avg));
                if(avg>50){
                    txtGRADE.setText("PASS");
                }
                else
                {
                    txtGRADE.setText("Fail");
                }

            }
        });
    }
}
