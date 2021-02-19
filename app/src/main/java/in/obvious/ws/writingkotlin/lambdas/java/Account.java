package in.obvious.ws.writingkotlin.lambdas.java;

import java.time.LocalDate;
import java.util.Objects;

public class Account {

    public final long id;

    public final long balance;

    public final LocalDate accountCreationDate;

    public Account(long id, long balance, LocalDate accountCreationDate) {
        this.id = id;
        this.balance = balance;
        this.accountCreationDate = accountCreationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                balance == account.balance &&
                Objects.equals(accountCreationDate, account.accountCreationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, accountCreationDate);
    }
}
