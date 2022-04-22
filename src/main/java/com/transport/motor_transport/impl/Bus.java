package com.transport.motor_transport.impl;
import com.transport.CityTransport;
import com.transport.motor_transport.MotorTransport;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Bus extends MotorTransport {
    private String type_of_bus;
    private int num_of_floors;

    public Bus(String name, String weight, String length, int travel_price, String type_of_city_transport, String motor,
               String transmission, String type_of_bus, int num_of_floors) {
        super(name, weight, length, travel_price, type_of_city_transport, motor, transmission);
        this.type_of_bus = type_of_bus;
        this.num_of_floors = num_of_floors;
    }

    @Override
    public String toString() {
        return "Name of transport: " + getName()  + "," + " weight: " + getWeight() + "," + " length: " + getLength()
                + "," + " travel price: " + getTravel_price() + "," + " type of city transport: " +
                getType_of_city_transport() + "," + " motor: " + getMotor() + " type of bus: " + type_of_bus + "," +
                " number of floors: " + num_of_floors;
    }
    public void Drive() {
        System.out.println("Driving the bus!");
    }
    public void Go() {
        System.out.println("The bus is going!");
    }
}
