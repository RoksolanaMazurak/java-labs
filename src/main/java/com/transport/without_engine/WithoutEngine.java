package com.transport.without_engine;

import com.transport.CityTransport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public abstract class WithoutEngine extends CityTransport {
    private String pedal_exist ;
    private String cabin;

    public WithoutEngine(String name, String weight, String length, int travel_price, String type_of_city_transport,
                         String pedal_exist, String cabin) {
        super(name, weight, length, travel_price, type_of_city_transport);
        this.pedal_exist = pedal_exist;
        this.cabin = cabin;
    }

    public abstract void Ride();
}

