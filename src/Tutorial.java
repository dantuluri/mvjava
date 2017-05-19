import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tutorial extends JFrame
{
       JPanel panelo = new JPanel();
       JLabel labelo = new JLabel();
       JTextField textFieldo = new JTextField(20
       );
       JButton buttono = new JButton("Enter");

       public Tutorial()
       {
              setTitle("Tutorial");
              setVisible(true);
              setSize(400, 200);
              setDefaultCloseOperation(EXIT_ON_CLOSE);

              panelo.add(textFieldo);


              textFieldo.addActionListener(new ActionListener()
              {
                     public void actionPerformed(ActionEvent e)
                     {
                           String input = textFieldo.getText();
                           labelo.setText(input);
                     }
              });

              panelo.add(buttono);
              buttono.addActionListener(new ActionListener()
              {
                      public void actionPerformed(ActionEvent e)
                      {
                             String input = textFieldo.getText();
                             labelo.setText(input);
                      }
              });

              panelo.add(labelo);
              add(panelo);

       }

       public static void main(String[] args)
       {
             Tutorial t = new Tutorial();
       }
}
