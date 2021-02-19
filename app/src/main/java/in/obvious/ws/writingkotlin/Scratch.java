package in.obvious.ws.writingkotlin;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import in.obvious.ws.writingkotlin.lambdas.java.Account;

public class Scratch {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void scratch() {
        final ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account(1, 5000, LocalDate.parse("1990-01-01")));
        accounts.add(new Account(2, 10000, LocalDate.parse("1970-05-03")));

        // Sort by balance
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return (int)(o1.balance - o2.balance);
            }
        });

        // Sort by creation date
        Collections.sort(accounts, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.accountCreationDate.compareTo(o2.accountCreationDate);
            }
        });
    }
}
