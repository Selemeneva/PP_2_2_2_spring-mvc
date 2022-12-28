package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Audi", "black", 8));
        carList.add(new Car("Mercedes", "grey", 220));
        carList.add(new Car("Lexus", "red", 350));
        carList.add(new Car("BMW", "white", 540));
        carList.add(new Car("Lada", "green", 2101));

    }

    @Override
    public List<Car> getCar(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
