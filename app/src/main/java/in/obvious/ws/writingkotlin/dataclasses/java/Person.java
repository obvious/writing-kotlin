package in.obvious.ws.writingkotlin.dataclasses.java;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    final long id;

    final String name;

    final LocalDate dateOfBirth;

    final String emailAddress;

    Person(long id, String name, LocalDate dateOfBirth, String emailAddress) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                name.equals(person.name) &&
                dateOfBirth.equals(person.dateOfBirth) &&
                emailAddress.equals(person.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateOfBirth, emailAddress);
    }
}
