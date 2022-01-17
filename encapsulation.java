class Account {
    private double balance;

    public double getBalance(){
        // validation
        return this.balance;
    }

    public void setBalance(double bal){
        // validation
        this.balance = bal;
        // implementation
    }
}
public class encapsulation {
    public static void main(String ...args){
        Account acc = new Account();
        System.out.println(acc.getBalance());
        acc.setBalance(10000);
        System.out.println(acc.getBalance());
        
    }
}