package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;
import web.model.Car;


import java.util.List;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> carList = carService.getCarList(count == null ? 0 : count);
        model.addAttribute(carList);
        return "cars";
    }
}