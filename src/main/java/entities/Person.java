package entities;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Person {

    private String name;
    private LocalDate birthday;
    private int age;
    public int id;
    public static int count = 0;

    public int getId() {

        return id;
    }

   // static int count = 0;


    public String getName() {

        return this.name;
    }

    public LocalDate getBirthday() {

        return this.birthday;
    }

    public int getAge() {

        return this.age;
    }

    public Person(String name, LocalDate birthday) {

        this.name = name;
        this.birthday = birthday;
        age = Years.yearsBetween(this.birthday, new LocalDate()).getYears();
        this.age = age;
        id = ++count;
    }
}

