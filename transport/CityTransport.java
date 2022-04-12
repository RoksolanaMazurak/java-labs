package com.transport;

public abstract class CityTransport {
    private String name;
    private String weight;
    private String length;
    private int travel_price;
    private String type_of_city_transport;

    public String getType_of_city_transport() {
        return type_of_city_transport;
    }

    public void setType_of_city_transport(String type_of_city_transport) {
        this.type_of_city_transport = type_of_city_transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name;}

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getTravel_price() {
        return travel_price;
    }

    public void setTravel_price(int travel_price) {
        this.travel_price = travel_price;
    }

    public CityTransport() {
        this.name = "unknown";
        this.weight= "0";
        this.length = "0";
        this.travel_price = 0;
        this.type_of_city_transport = "unknown";
    }

    public CityTransport(String name, String weight, String length, int travel_price, String type_of_city_transport) {
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.travel_price = travel_price;
        this.type_of_city_transport = type_of_city_transport;

    }
    public void Go() {
        System.out.println("The transport is going!");
    };
}
