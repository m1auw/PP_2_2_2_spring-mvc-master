package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;


@Controller
public class CarController {
    private final CarServiceImp carServiceImp;

    @Autowired
    private CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = carServiceImp.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
