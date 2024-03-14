package bank;

 public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();  
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);  
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(2000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.setWithdraw(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setWithdraw(2000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setWithdraw(100);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterest());
  }
 }