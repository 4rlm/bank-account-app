package bankaccountapp;

public class Savings extends Account {
  // List properties specific to Savings account
  int safetyDepositBoxID;
  int safetyDepositBoxKey;

  // Constructor to initlialize settings for Savings properties
  public Savings(String name) {
    super(name);
    System.out.println("NEW SAVINGS ACCOUNT");
  }

  // List any methods specific to Savings account
}
