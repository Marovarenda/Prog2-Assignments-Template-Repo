//mohamed kamal
//20216446
public class BankAccount {
    public double balance;
    public String username;
    public String bankname;
    public final String country="Egypt";
    static int NumOfUsers = 0;
    static int NumOfcalls = 0;
    
    public BankAccount(){
        balance=0;
        username=null;
        bankname=null;
        NumOfUsers++;
        System.out.println("Account Created");
    }
    
    public BankAccount(double b,String uN,String bN){
        balance=b;
        username=uN;
        bankname=bN;
        NumOfUsers++;
        System.out.println("account created");
    }
    
    public void Deposite(double b){
        balance+=b;
        NumOfcalls++;
        System.out.println("Balance after deposite is ="+ balance );
    }
    
    public void Withdraw(double b){
        if(balance>=b){
            balance-=b;
            NumOfcalls++;
            System.out.println("Balance after Withdraw is ="+ balance );
        }
        else{
            System.out.println("You cant withdraw");
        }
    }
    
    public static int getNumOfUsers() {
        return NumOfUsers;
    }

    public static int getNumOfCalls() {
        return NumOfcalls;
    }
    public static void main(String[] args) {
        BankAccount acc1 =new BankAccount();
        BankAccount acc2 =new BankAccount(500000,"mohamed kamal","CIB");
        acc2.Deposite(3000);
        acc2.Withdraw(2000);
        System.out.println("Current balance= " + acc2.balance);
        System.out.println("Number of users in the system= " + BankAccount.getNumOfUsers());
        System.out.println("Number of Deposite() calls= " + BankAccount.getNumOfCalls());
        System.out.println("Number of Withdraw() calls= " + BankAccount.getNumOfCalls());
    }
}