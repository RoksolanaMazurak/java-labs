package com.transport.motor_transport.impl;
import com.transport.CityTransport;

public class Bus extends CityTransport {
    final String TYPE_TRANSPORT = "bus";
    private String type_of_bus;
    private int num_of_floors;

    public Bus() {}

    public Bus(String name, String weight, String length, int travel_price,String type_of_city_transport, String motor,
               String type_of_bus, int num_of_floors) {
        super(name, weight, length, travel_price, type_of_city_transport);
        this.type_of_bus = type_of_bus;
        this.num_of_floors = num_of_floors;
    }

    @Override
    public String toString() {
        return "Name of transport: " + getName()  + "," + " weight: " + getWeight() + "," + " length: " + getLength()
                + "," + "travel price: " + getTravel_price() + "," + " type of bus: " + type_of_bus + ","
                + " number of floors: " + num_of_floors;
    }
    public void Drive() {
        System.out.println("Driving the " + TYPE_TRANSPORT + "!");
    }
    public void Go() {
        System.out.println("The " + TYPE_TRANSPORT + " is going!");
    }
}
