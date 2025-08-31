import java.util.HashMap;

public class ATM {
    //The table contain list of account created and their corresponding Pin codes
    private HashMap<Account, Integer> accountLists;

    ATM()
    {
        accountLists = new HashMap<>();
    }
}
