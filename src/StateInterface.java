
public interface StateInterface {
    public void setContext(BankContext con);
    public void deposit(int money);
    public void withdraw(int money);
    public String stateName();
}
//The functions which cause change in state will be defined here