package learn.behavioral.chain.of.responsibility;

import learn.behavioral.chain.of.responsibility.account.Bank;
import learn.behavioral.chain.of.responsibility.account.Bitcoin;
import learn.behavioral.chain.of.responsibility.account.Paypal;

/**
 * @author anthonylee
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Bank bank = new Bank(100);
        Paypal paypal = new Paypal(200);
        Bitcoin bitcoin = new Bitcoin(300);

        bank.setNext(paypal);
        paypal.setNext(bitcoin);

        bank.pay(259);
    }
}
