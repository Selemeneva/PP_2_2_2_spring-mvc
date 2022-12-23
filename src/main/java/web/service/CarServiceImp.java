package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Audi", "black", 8));
        carList.add(new Car("Mercedes", "grey", 220));
        carList.add(new Car("Lexus", "red", 350));
        carList.add(new Car("BMW", "white", 540));
        carList.add(new Car("Lada", "green", 2101));
    }

    @Override
    public List<Car> getCar(Integer count) {
        if (count == null || count > 4) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}