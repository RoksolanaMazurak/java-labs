package com.transport.motor_transport.impl;

import com.transport.CityTransport;
import com.transport.motor_transport.MotorTransport;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString

public class Taxi extends MotorTransport {
        private String car_model;
        private String existence_of_taximeter;

    public Taxi(String name, String weight, String length, int travel_price, String type_of_city_transport, String motor,
                String transmission, String car_model, String existence_of_taximeter) {
        super(name, weight, length, travel_price, type_of_city_transport, motor, transmission);
        this.car_model = car_model;
        this.existence_of_taximeter = existence_of_taximeter;
    }

    @Override
    public String toString() {
        return "Name of transport: " + getName() + "," + " weight: " + getWeight() + ","
                + " length: " + getLength() + "," + " travel price: " + getTravel_price() + "," + " car model: " + car_model + ","
                + " existence of taximeter: " + existence_of_taximeter;
    }

        public void Drive() {
            System.out.println("Driving the taxi!");
        }
        public void Go() {
            System.out.println("The taxi is going!");
        }
}
