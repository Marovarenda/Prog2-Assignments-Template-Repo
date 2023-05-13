//Mohamed kamal
//20216446
package banksystem;
public final class BankAccount {
    private double balance;
    
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if(balance<0 || balance>1000000)
            return;
        balance+=balance;
    }
    public void setBalance(double balance , double Tax_percent){
        setBalance(balance - (balance * (Tax_percent/100) ) );
    }
}
