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

    //labels components
    JLabel userNameLabel;
    JLabel userIdLable;
    JLabel pinLabel;
    JLabel addressLabel;

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
    JButton logingButton ;

    //Adding radio buttons
    JRadioButton savingAccountRb;
    JRadioButton currentAccoutRb;

    AtmMenu()
    {
        super("WELCOME TO MIU BANKING APP");
        //Initializing the labels
        userIdLable = new JLabel("User ID:");
        userNameLabel = new JLabel("User Name:");
        addressLabel = new JLabel("Address");
        pinLabel = new JLabel("Your Pin");
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
        logingButton = new JButton("Login");

        //Initializing Radio buttons
        savingAccountRb = new JRadioButton("Saving account");
       // savingAccountRb.setVisible(false);
        currentAccoutRb = new JRadioButton("currentAccount");
       // currentAccoutRb.setVisible(false);

        //Initializing the borders
        transactionBorder = BorderFactory.createLineBorder(Color.red,15);

        //Initializing the pannels
        panelA = new JPanel();
        panelB = new JPanel();
        panelC = new JPanel();

        userAddress.setText("Please enter your address");
        //userAddress.setVisible(false);
        userName.setColumns(15);
        userName.setText("Please enter your name");


        //userName.setVisible(false);

        userId.setText("Please enter your id");
        userId.setBounds(100,125,200,25);
        userName.setBounds(100,100,200,25);
        userIdLable.setBounds(10,125,200,20);
        userNameLabel.setBounds(10,100,200,20);
        logingButton.setBounds(10,200, 100,30);
        creatAccountButton.setBounds(200,200,200,30);
        userPinCode.setColumns(15);
        userPinCode.setText("Your pin");
        userPinCode.setColumns(15);
        //Adding text fiels to pannels
        add(userName);
        add(userIdLable);
        add(userNameLabel);
        add(userId);
        add(logingButton);
        add(creatAccountButton);
        panelA.add(userAddress);

        //Adding items to pannel B
        creatAccountButton.addActionListener(this::actionPerformed);

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
        /*currentAccoutRb.setVisible(true);
        savingAccountRb.setVisible(true);
        userName.setVisible(true);
        userAddress.setVisible(true);
        checkBanlanceButton.setVisible(false);
        widrawCashButton.setVisible(false);
        makeDepositButton.setVisible(false);
        creatAccountButton.setText("Click to create account");*/
    }
}
