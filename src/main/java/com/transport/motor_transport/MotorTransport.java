package com.transport.motor_transport;

import com.transport.CityTransport;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor

public abstract class MotorTransport extends CityTransport {
    private String motor;
    private String transmission;

    public MotorTransport(String name, String weight, String length, int travel_price, String type_of_city_transport,
                          String motor, String transmission) {
        super(name, weight, length, travel_price, type_of_city_transport);
        this.motor = motor;
        this.transmission = transmission;
    }
    public abstract void Drive();
}
