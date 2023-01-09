public class Account {
    private double balance;
    private String name;

    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;

    }
    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public int withdraw(int amount,int balance) {
        if (amount > balance){
            System.out.println("Withdrawal amount exceeded account balance");
        }
        balance = balance - amount;
        return balance;
    }
}
