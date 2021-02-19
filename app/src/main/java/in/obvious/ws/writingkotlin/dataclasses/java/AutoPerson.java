package in.obvious.ws.writingkotlin.dataclasses.java;

import com.google.auto.value.AutoValue;

import java.time.LocalDate;


@AutoValue
public abstract class AutoPerson {

    static AutoPerson create(long id, String name, LocalDate dateOfBirth, String emailAddress) {
        return new AutoValue_AutoPerson(id, name, dateOfBirth, emailAddress);
    }

    abstract long id();

    abstract String name();

    abstract LocalDate dateOfBirth();

    abstract String emailAddress();
}
