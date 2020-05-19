package teinehomework;

import java.time.ZonedDateTime;

public interface Person {

    String getFirstName();
    ZonedDateTime getDateOfBirth();
    Long getAge();
    void sayHello();

}
