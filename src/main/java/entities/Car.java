package entities;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Car {

    private String mark;
    private LocalDate bought;
    private int years;
    public int id;
    public static int count=0;

    public LocalDate getBought() {

        return bought;
    }

    public String getMark() {

        return this.mark;
    }

    public int getYear() {

        return this.years;
    }

    public Car(String mark, LocalDate bought) {

        this.mark = mark;
        this.bought = bought;
        years = Years.yearsBetween(this.bought, new LocalDate()).getYears();
        this.years = years;
        id = ++count;
    }
}



