class Bank{
    private double bal=1000;
    private String username ="rayees";
    public double getwal(String username){
        if(this.username.equals(username)){
            return bal;
        }
        else
            return 0.0;
    }
}
public class datahiding {
    public static void main(String args[]){
        Bank acc=new Bank();
        System.out.println(acc.getwal("rayees"));
    }
    
}
