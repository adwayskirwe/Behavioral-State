
public class LowBalanceState implements StateInterface {
    public BankContext context;
    int balance;
    @Override
    public void setContext(BankContext con) {
        context=con;
        context.setState(this);
    }

    @Override
    public String stateName() {
        return "Low Balance State";
    }

    @Override
    public void deposit(int money) {
        System.out.println(this.stateName());
        System.out.println("Depositing money...");
        balance=context.getBalance();

        balance=balance+money;
        context.setBalance(balance);
        System.out.println("Balance is :"+balance);
        if(balance>1000 && balance<10000){
            context.setState(new AvgBalanceState());
        }
        else if(balance>10000){
            context.setState(new HighBalanceState());
        }
    }

    @Override
    public void withdraw(int money) {
        System.out.println(this.stateName());
        System.out.println("Withdrawing money");
        balance=context.getBalance();
        balance=balance-money;
        context.setBalance(balance);
        System.out.println("Balance is :"+balance);
        if(balance>1000 && balance<10000){
            context.setState(new AvgBalanceState());
        }
        else if(balance>10000){
            context.setState(new HighBalanceState());
        }
    }
}
