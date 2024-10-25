package app;

import app.modules.Car;
import app.modules.Employees;

public class HomeTask12 {
    public static void main(String[] arg) {
        Employees employees = new Employees(
            "John li",
            "dantist",
            "test@test.com",
            "0984343444",
            43
        );

        System.out.println(employees);

        Car car = new Car();
        car.start();
    }
}
