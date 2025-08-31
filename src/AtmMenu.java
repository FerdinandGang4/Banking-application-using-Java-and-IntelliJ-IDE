import javax.swing.*;

public class AtmMenu extends JFrame {
//Components on the User Interface
    JTextField userName;
    JTextField userAddress;
    JTextField userId;
    JTextField userPinCode;
    JPanel panelA;

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
        userAddress = new JTextField();
        //Buttons
        creatAccountButton = new JButton("Create Accout");
        checkBanlanceButton = new JButton("AccountBalance");
        makeDepositButton = new JButton("Make Deposite");
        widrawCashButton = new JButton("Widraw Cash");

        //Initializing Radio buttons
        savingAccountRb = new JRadioButton("Saving account");
        currentAccoutRb = new JRadioButton("currentAccount");
        //adding the text fields to the pannel
        panelA = new JPanel();
        userAddress.setColumns(15);
        userAddress.setText("Your address");
        userName.setColumns(15);
        userName.setText("Your name");
        userId.setColumns(15);
        userId.setText("Your id");
        userPinCode.setColumns(15);
        userPinCode.setText("Your pin");
        userPinCode.setColumns(15);
        //Adding text fiels to pannels
        panelA.add(userName);
        panelA.add(userId);
        panelA.add(userPinCode);
        panelA.add(userAddress);
        add(panelA);
        //addint the buttons
        add(creatAccountButton);
        add(checkBanlanceButton);
        add(widrawCashButton);
        add(makeDepositButton);
        //Adding radio buttons to the frame
        add(savingAccountRb);
        add(currentAccoutRb);

    }
}
