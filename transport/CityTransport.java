package com.transport;

public class CityTransport implements ICityTransport {
    protected String weight;
    protected String name;
    protected String ticket_price;
    protected String type_of_city_transport;
    protected String length;

    public CityTransport() {
        this.name = "unknown";
        this.ticket_price = "0";
        this.weight= "0";
        this.type_of_city_transport = "unknown";
        this.length = "0";
    }

    public CityTransport(String name, String price, String weight, String type_of_city_transport, String length) {
        this.name = name;
        this.ticket_price = price;
        this.weight = weight;
        this.type_of_city_transport = type_of_city_transport;
        this.length = length;
    }
    public void Go() {
        System.out.println("The transport is going!");
    };
}

