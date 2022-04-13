package com.transport;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public abstract class CityTransport {
    private String name;
    private String weight;
    private String length;
    private int travel_price;
    private String type_of_city_transport;

    public void Go() {
        System.out.println("The transport is going!");
    };
}
