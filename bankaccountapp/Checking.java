package bankaccountapp;

public class Checking extends Account {
  // List properties specific to a checking account
  int debitCardNumber;
  int debitCardPIN;

  // Constructor to initialize checking account properties
  public Checking(String name, String sSN, double initDeposit) {
    super(name, sSN, initDeposit);
    System.out.println("NEW CHECKING ACCOUNT");
  }

  // List methods specific to checking account

}
