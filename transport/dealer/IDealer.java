package com.transport.dealer;

import com.transport.CityTransport;

import java.util.List;

public interface IDealer {
    List<CityTransport> findByWeight(String weight, List<CityTransport> cityTransports);
    List<CityTransport> findByLength(String length, List<CityTransport> cityTransports);
    List<CityTransport> sorted(List list, boolean reversed);

}

