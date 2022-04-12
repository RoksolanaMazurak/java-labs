package com.transport.without_engine.impl;

import com.transport.without_engine.WithoutEngine;

public class Carriage extends WithoutEngine {
    final String TYPE_TRANSPORT = "carriage";
    private int num_of_horses;
    private String coachman;

    public Carriage() {};

    public Carriage(String name, String ticket_price, String weight, String type_of_city_transport, String length,
                    String pedal_exist, String cabin, int num_of_horses, String coachman) {
        super(name, ticket_price, weight, type_of_city_transport, length, pedal_exist, cabin);
        this.num_of_horses = num_of_horses;
        this.coachman = coachman;
    }

    @Override
    public String toString() { //function returns information about taxi
        return "Name of transport: " + name + "," + " price of ticket: " + ticket_price + "," + " weight: " + weight + ","
                + " type of city transport: " + type_of_city_transport + "," + " length: " + length + ","
                + " existence of pedals: " + pedal_exist + "," + " cabin: " + cabin + "," +
                " number of horses: " + num_of_horses + "," + " coachman: " + coachman + ".";
    }
    public void Ride() {
        System.out.println("Riding the " + TYPE_TRANSPORT + "!");
    }
    public void Go() {
        System.out.println("The " + TYPE_TRANSPORT + " is going!");
    }
}
