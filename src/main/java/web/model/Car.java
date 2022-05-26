package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private int price;
    private int horsepower;

    public Car() {
    }

    public Car(String model, int price, int horsepower) {
        this.model = model;
        this.price = price;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && horsepower == car.horsepower && model.equals(car.model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price= $" + price +
                ", horsepower=" + horsepower +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price, horsepower);
    }
}
