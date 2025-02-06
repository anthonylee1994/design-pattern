package learn.behavioral.chain.of.responsibility.account;

/**
 * @author anthonylee
 */
public class Bitcoin extends Account {
    public Bitcoin(int balance) {
        this.name = "比特幣";
        this.balance = balance;
    }
}
