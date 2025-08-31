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


    AtmMenu()
    {
        super("WELCOME TO MIU BANKING APP");
        userId = new JFormattedTextField();

        userPinCode = new JFormattedTextField();

        userName = new JTextField();
        userAddress = new JTextField();

        creatAccountButton = new JButton("Create Accout");
        checkBanlanceButton = new JButton("AccountBalance");
        makeDepositButton = new JButton("Make Deposite");
        widrawCashButton = new JButton("Widraw Cash");


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

    }
}
