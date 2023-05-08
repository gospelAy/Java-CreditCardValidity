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


    public void withdraw(int amount) {
        if (amount > balance){
            System.out.println("Withdrawal amount exceeded account balance");
        }

        balance = balance - amount;
    }
}
