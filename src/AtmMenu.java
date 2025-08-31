import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtmMenu extends JFrame implements ActionListener {
//Components on the User Interface
    JTextField userName;
    JTextField userAddress;
    JTextField userId;
    JTextField userPinCode;
    Border transactionBorder;
    Border createAccoutBorder;

    JPanel panelA;
    JPanel panelB;
    JPanel panelC;

    //Buttos for user operations
    JButton creatAccountButton;
    JButton checkBanlanceButton;
    JButton makeDepositButton;
    JButton widrawCashButton;

    //Adding radio buttons
    JRadioButton savingAccountRb;
    JRadioButton currentAccoutRb;

    AtmMenu()
    {
        super("WELCOME TO MIU BANKING APP");
        //text Fields
        userId = new JFormattedTextField();
        userPinCode = new JFormattedTextField();
        userName = new JTextField();
        //userAddress.setVisible(false);
        userAddress = new JTextField();
        //userAddress.setVisible(false);
        //Buttons
        creatAccountButton = new JButton("Create Accout");
        checkBanlanceButton = new JButton("CheckBalance");
        makeDepositButton = new JButton("Make Deposite");
        widrawCashButton = new JButton("Widraw Cash");

        //Initializing Radio buttons
        savingAccountRb = new JRadioButton("Saving account");
        savingAccountRb.setVisible(false);
        currentAccoutRb = new JRadioButton("currentAccount");
        currentAccoutRb.setVisible(false);

        //Initializing the borders
        transactionBorder = BorderFactory.createLineBorder(Color.red,15);

        //Initializing the pannels
        panelA = new JPanel();
        panelB = new JPanel();
        panelC = new JPanel();

        userAddress.setColumns(15);
        userAddress.setText("Your address");
        userAddress.setVisible(false);
        userName.setColumns(15);
        userName.setText("Your name");
        userName.setVisible(false);
        userId.setColumns(15);
        userId.setText("Your id");
        userPinCode.setColumns(15);
        userPinCode.setText("Your pin");
        userPinCode.setColumns(15);
        //Adding text fiels to pannels
        panelA.add(userName);
        panelA.add(userAddress);

        //Adding items to pannel B
        creatAccountButton.addActionListener(this::actionPerformed);
        panelB.add(creatAccountButton);
        panelB.add(savingAccountRb);
        panelB.add(currentAccoutRb);
        //addint the buttons
        panelC.add(checkBanlanceButton);
        panelC.add(makeDepositButton);
        panelC.add(widrawCashButton);

        //Adding radio buttons to the frame

        add(panelA);
        add(panelB);
        add(panelC);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentAccoutRb.setVisible(true);
        savingAccountRb.setVisible(true);
        userName.setVisible(true);
        userAddress.setVisible(true);
        checkBanlanceButton.setVisible(false);
        widrawCashButton.setVisible(false);
        makeDepositButton.setVisible(false);
        creatAccountButton.setText("Click to create account");
    }
}
