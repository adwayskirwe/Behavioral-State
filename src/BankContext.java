
public class BankContext {
    int balance=0;
    public StateInterface state;

    public void setState(StateInterface s){
        state=s;
    }
    public StateInterface initialState(){
        return new LowBalanceState();
    }

    public StateInterface getState(){
        return state;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int b){
        balance=b;
    }
}
