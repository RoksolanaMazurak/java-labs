package com.transport.without_engine.impl;

import com.transport.without_engine.WithoutEngine;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor

public class Carriage extends WithoutEngine {
    private String num_of_horses;
    private String coachman;

    public Carriage(String name, String weight, String length, int travel_price, String type_of_city_transport,
                    String pedal_exist, String cabin, String num_of_horses, String coachman) {
        super(name, weight, length, travel_price, type_of_city_transport, pedal_exist, cabin);
        this.num_of_horses = num_of_horses;
        this.coachman = coachman;
    }

    @Override
    public String toString() { //function returns information about taxi
        return "Name of transport: " + getName() + "," + " price of ticket: " + getTravel_price() + ","
                + " weight: " + getWeight() + "," + " type of city transport: " + getType_of_city_transport() + ","
                + " length: " + getLength() + "," + " existence of pedals: " + getPedal_exist() + "," + " cabin: " + getCabin()
                + "," + " number of horses: " + num_of_horses + "," + " coachman: " + coachman + ".";
    }

    public void Ride() {
        System.out.println("Riding the carriage!");
    }
    public void Go() {
        System.out.println("The carriage is going!");
    }
}

