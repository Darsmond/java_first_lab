package checkers;

import entities.Car;
import org.joda.time.LocalDate;

public class CarBoughtChecker implements Checker<Car> {

    public boolean check(Car car, Object object){

        LocalDate require = new LocalDate(object);
        if(car.getBought().toDate().compareTo((require.toDate()))==0) {
           return true;
        } else return false;
    }
}

