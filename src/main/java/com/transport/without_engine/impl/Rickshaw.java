package com.transport.without_engine.impl;
import com.transport.CityTransport;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Rickshaw extends CityTransport {
    private String type_of_rickshaw;
    private String visor;

    public Rickshaw(String name, String weight, String length, int travel_price, String type_of_city_transport,
                    String type_of_rickshaw, String visor) {
        super(name, weight, length, travel_price, type_of_city_transport);
        this.type_of_rickshaw = type_of_rickshaw;
        this.visor = visor;
    }

    @Override
    public String toString() {
        return "Name of transport: " + getName() + "," + " weight: " + getWeight() + ","
                + " length: " + getLength()  + "," + " travel price: " + getTravel_price() + ","
                + " type of rickshaw: " + type_of_rickshaw + "," + " visor: " + visor;
    }

    public void Ride() {
        System.out.println("Riding the rickshaw!");
    }
    public void Go() {
        System.out.println("The rickshaw is going!");
    }
}
