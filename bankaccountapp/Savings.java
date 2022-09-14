package bankaccountapp;

public class Savings extends Account {
  // List properties specific to Savings account
  int safetyDepositBoxID;
  int safetyDepositBoxKey;

  // Constructor to initlialize settings for Savings properties
  public Savings(String name, String sSN, double initDeposit) {
    super(name, sSN, initDeposit);
    System.out.println("NEW SAVINGS ACCOUNT");
  }

  // List any methods specific to Savings account
}
