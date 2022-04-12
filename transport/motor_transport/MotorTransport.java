package com.transport.motor_transport;

import com.transport.CityTransport;

public class MotorTransport extends CityTransport {
    protected String motor;
    protected String transmission;

    public MotorTransport() {}

    public MotorTransport(String name, String ticket_price, String weight, String type_of_city_transport, String length,
               String motor, String transmission) {
        super(name, ticket_price, weight, type_of_city_transport, length);
        this.motor = motor;
        this.transmission = transmission;
    }
    public void Drive() {
        System.out.println("Driving the motor transport!");
    };
}
