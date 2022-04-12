package com.transport.without_engine;

import com.transport.CityTransport;

public abstract class WithoutEngine extends CityTransport {
    private String pedal_exist ;
    private String cabin;

    public String getPedal_exist() {
        return pedal_exist;
    }

    public void setPedal_exist(String pedal_exist) {
        this.pedal_exist = pedal_exist;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public WithoutEngine() {}

    public WithoutEngine(String name, String weight, String length, int travel_price, String type_of_city_transport,
                         String pedal_exist, String cabin) {
        super(name, weight, length, travel_price, type_of_city_transport);
        this.pedal_exist = pedal_exist;
        this.cabin = cabin;
    }
    public abstract void Ride();
}

