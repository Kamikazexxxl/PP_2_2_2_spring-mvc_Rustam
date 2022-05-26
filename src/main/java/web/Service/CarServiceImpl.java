package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    private List<Car> carList = new ArrayList <Car>();

    @Override
    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();
    }

    public CarServiceImpl() {
        carList.add(new Car("BMW", 10000, 200));
        carList.add(new Car("Lada", 4000, 80));
        carList.add(new Car("Mercedes", 12000, 250));
        carList.add(new Car("Reno", 7000, 100));
        carList.add(new Car("Mazda", 9000, 150));
    }
}
