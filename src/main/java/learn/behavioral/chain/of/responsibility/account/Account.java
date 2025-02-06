package learn.behavioral.chain.of.responsibility.account;

/**
 * @author anthonylee
 */
public abstract class Account {
    protected Account successor;
    protected String name;
    protected int balance;

    public void setNext(Account account) {
        this.successor = account;
    }

    public void pay(int amountToPay) {
        if (canPay(amountToPay)) {
            System.out.println("使用 " + name + " 支付 " + amountToPay + "！");
        } else if (successor != null) {
            System.out.println("無法使用 " + name + " 支付。繼續中...");
            successor.pay(amountToPay);
        } else {
            System.out.println("沒有帳戶額度足夠");
        }
    }

    private boolean canPay(int amount) {
        return balance >= amount;
    }
}
