import javax.swing.plaf.PanelUI;

public class Account {
    //private fields
     private String userName;
     private int userID;
     private int pinCode;
     private  String	userAddress;


    //getters
    public int getUserID(String userName)
    {
        return  this.userID;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserName() {
        return userName;
    }

    //setters
   public  void  setPinCode(int code)
   {
       this.pinCode = code;
   }
    public void setUserName(String name)
    {
        this.userName = name;
    }
    public void setUserID(int id)
    {
        this.userName = name;
    }
    public void setUserAddress(String address)
    {
        this.userAddress= address;
    }

    //constructor
    public  Account(int id, String name)
    {
        this.userID = id;
        this.userName = name;
    }

    //account functionalities

}
