package checkers;

import entities.Car;

public class CarMarkChecker implements Checker<Car> {

    public boolean check(Car car, Object object) {
        if (car.getMark().equals(object)){
            return true;
        } else return false;
    }

}
