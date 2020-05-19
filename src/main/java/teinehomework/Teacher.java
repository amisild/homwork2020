package teinehomework;

import java.time.ZonedDateTime;

public class Teacher extends PersonImpl {

    //constructor
    public Teacher(String nimi, String personId, ZonedDateTime birthdate, String kursus, String studentId) {
        super(nimi, personId, birthdate, kursus, studentId);
    }

    //override
    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Hello, " + getFirstName());
    }

}
