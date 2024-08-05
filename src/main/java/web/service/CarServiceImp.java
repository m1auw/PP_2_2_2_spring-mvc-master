package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars = new ArrayList<>();

    public CarServiceImp() {
        cars.add(new Car("Toyota", 2020, "Black"));
        cars.add(new Car("Honda", 2019, "White"));
        cars.add(new Car("Ford", 2016, "Yellow"));
        cars.add(new Car("Nissan", 2021, "Purple"));
        cars.add(new Car("Chevrolet", 2018, "Red"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 0 || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

}
