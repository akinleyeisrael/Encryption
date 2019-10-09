import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gui {

    //Encryption program in java by israel Akinleye
    private static JTextField textfield;   //global variable for textfield
    public static String in; //globall variable for input by user

    public static void main(String[] args) {
        encryptProgram();
    }  //main method


    private static void encryptProgram(){
        System.out.println("Encryption Gui projects");

        JFrame frame = new JFrame("Encryption");  //frame for the game

        JButton button = new JButton("Encrypt");
        button.setBounds(100, 100, 140, 40);   // position for button

        Random rand = new Random();
        int beeb = rand.nextInt(1000) + 10;   //for four random numbers
        JLabel labelCheck = new JLabel("Nothing Entered yet");
        labelCheck.setForeground(Color.RED);   // for error
        labelCheck.setBounds(390,15,200,100);



        button.addActionListener(new ActionListener() {   //button for encryption
            @Override
            public void actionPerformed(ActionEvent e) {

                String check = e.getActionCommand();
                 in = textfield.getText();

                if (check.equals("Encrypt")) {

                    labelCheck.setText(in);
                    textfield.setText("Encrypted");
                    System.out.print("Encrypt:");
                    for(int i = 0; i<in.length(); i++){
                        int out = (int) in.charAt(i) + 3;   //algorithm for game
                        char letter = (char) out;    //try to convert to string
                        System.out.print(out);
                    }
                    System.out.println("\n");
                }

            }
        });

        JButton button1 = new JButton("Decrypt");   //button for the game
        button1.setBounds(380, 100, 140, 40);

        button1.addActionListener(new ActionListener() {    //button for decryption
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"now to start decrypting");
                String check2 = actionEvent.getActionCommand();    //get the command inputed by user

                if(check2.equals("Decrypt")){
                    String input2 = textfield.getText(); //word gotten

                    labelCheck.setText("Decrypted");   //set the label so thath user can see the encrypted number
                    textfield.setText("Decrypted");
                    System.out.print("Decrypted :");
                    for(int  i = 0; i<input2.length(); i++){
                        int output = (int) input2.charAt(i) -3;    //algorithm for decyption
                        System.out.print(output);

                    }
                    System.out.println("\n");   //prin  new line
                 System.out.println(in);

                }
            }
        });

        JLabel label = new JLabel("Enter Word :");
        label.setBounds(160, 15, 200, 100);

        textfield = new JTextField();    //texfield for input
        textfield.setBounds(242, 50, 130, 30);

        frame.setSize(700, 400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(button1);
        frame.add(textfield);
        frame.add(label);
        frame.add(labelCheck);

    }
}
