import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   private  Account myAccount;
    public static <Account> void main(String[] args) {

        AtmMenu frameA = new AtmMenu();
        frameA.setSize(600,300);
        frameA.setVisible(true);
        frameA.setLayout(new FlowLayout());
        frameA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}