//mohamed kamal
//20216446
package banksystem;
public class BankSystem {
    public static void main(String[] args) {
        employee emp = new employee("mohamed",20,'M',5000,"B.tech");
        emp.Greet();
        emp.PrintData();
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());
        
        customer cus = new customer("mohamed",20,'M',20216446,"cairo");
        cus.PrintData();
        
        BankAccount myaccount = new BankAccount(5000);
        System.out.println("Balance: " + myaccount.getBalance());
        myaccount.setBalance(2000);
        System.out.println("Balance: " + myaccount.getBalance());
        myaccount.setBalance(5000,10);
        System.out.println("Balance: " + myaccount.getBalance());
    }
    
}
