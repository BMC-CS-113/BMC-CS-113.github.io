// Adam Poliak
// 03/21/2023
// A class to represent a Bank Account

public class BankAccount {

  private String name; 
  private double balance;

  /**
   * empty constructor 
   */
  public BankAccount() {
     name = "";
     balance = 1.0;
  }

  // value constructor
  /**
   * @param name - name of new account
   * @param balance - starting balance
   */
  public BankAccount(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }
 
 
  /**
   * @return the BankAccount's name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the BankAccount's balance
   */
  public double getBalance() {
    return balance;
  }

  /**
   * @param accountName - update the name of the Bank Account
   */
  public void setName(String accountName) {
    name = accountName;
  } 

  public String toString() {
    return name + " has " + balance + " in their account";
  }

  /**
   * @param moreMoney - amount to add to the balance
   * @return - the new updated balance after the deposit
   */
  public double deposit(double moreMoney) {
    balance += moreMoney;
    return balance; 
  }


  /**
   * Withdraw money form an account
  * @param how much money to withdraw
  * @retrun the new updated balance after the withdrawal
  */
  public double withdraw(double amountToWithdraw) {
    balance -= amountToWithdraw;
    return balance;
  }

  /**
   * Transfer money from a sender to a recipient
   * @param sender - the BankAccount to withdraw from
   * @param recipient - the BankAccount to deposit
   * @param amount - the amount to transfer
   * @return - boolean indicating if the transfer was successful
   */
  public static boolean transfer(BankAccount sender,
                          BankAccount recipient, 
                          double amount) {
    return sender.transferTo(recipient, amount);
  }

  /**
   * Helper instance method for transfering money to an account
   * @param recipient - the BankAccount receiveing the money
   * @param amount - the amount of to transfer
   * @return boolean indicating if the transfer was successful
   *        false if the current Bankaccount does not have enough funds
   */
  private boolean transferTo(BankAccount recipient, double amount) {
    // subtract from the balance
    if (amount > balance) {
      System.out.printf("%f is too much money to trsansfer\n", amount);
      return false;
    } 
    balance -= amount;
    //add money to thje recepient
    recipient.deposit(amount); // depost the money into the receipient
    return true;
  }

  public static void main(String[] args) {
    BankAccount emptyAccount = new BankAccount();
    System.out.println(emptyAccount);
    emptyAccount.setName("MySlushFund");
    System.out.println(emptyAccount);

    emptyAccount.deposit(1000);
    emptyAccount.withdraw(10);

    BankAccount tuitionAccount = new BankAccount("tuition", 60000.0);
    System.out.println("This is the account for tuition");
    System.out.println(tuitionAccount);

   System.out.println("Transfering money 1");
   System.out.println(emptyAccount);
   System.out.println(emptyAccount.transferTo(tuitionAccount, 10));
   System.out.println(emptyAccount);

   System.out.println("Transfering money 2");
   System.out.println(tuitionAccount);
   System.out.println(tuitionAccount.transferTo(emptyAccount, 10));
   System.out.println(tuitionAccount);


   System.out.println("Transfering money 3");
   System.out.println(transfer(emptyAccount, tuitionAccount, 100000));
  }

}












