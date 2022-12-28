package web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Car {


    private String model;
    private String color;
    private int series;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Car (String model, String color, int series) {
        this.series = series;
        this.model = model;
        this.color = color;
    }


    public Car() {

    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + series +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
