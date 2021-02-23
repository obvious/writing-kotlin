package in.obvious.ws.writingkotlin.lambdas.java;

import java.util.ArrayList;

public class Bank {

    private final ArrayList<Account> accounts;

    private final OnAccountAddedListener accountAddedListener;

    public Bank(ArrayList<Account> accounts, OnAccountAddedListener accountAddedListener) {
        this.accounts = accounts;
        this.accountAddedListener = accountAddedListener;
    }

    public void addAccount(Account account) {
        accounts.add(account);

    }

    interface OnAccountAddedListener {
        void onAccountAdded(Account account);
    }
}
