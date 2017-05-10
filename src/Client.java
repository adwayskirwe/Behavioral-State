
public class Client {
    public static void main(String[]args){
        BankContext context=new BankContext();
        //bankcontext is an object.This object show diff behavior in diff context so we create object for each state.

        StateInterface state=context.initialState();
        state.setContext(context);

        state.deposit(7000);
        state=context.getState();

        state.setContext(context);
        state.withdraw(5000);

        state=context.getState();
        state.setContext(context);

        state.deposit(20000);
        state=context.getState();

        state.setContext(context);
        state.withdraw(1);

    }
}
