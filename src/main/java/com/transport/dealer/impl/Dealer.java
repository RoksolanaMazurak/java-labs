package com.transport.dealer.impl;

import com.transport.CityTransport;
import com.transport.dealer.IDealer;

import java.util.*;

public class Dealer implements IDealer {
    private Map<Integer, Object> map = new HashMap<>();

    @Override
    public List<CityTransport> findByWeight (String weight, List<CityTransport> cityTransports) {
        List<CityTransport> result = new LinkedList<>();

        for (CityTransport transport : cityTransports) {
            if (transport.getWeight().equals(weight)) {
                result.add(transport);
            }
        }
        return result;
    }

    @Override
    public List<CityTransport> findByLength (String length, List<CityTransport> cityTransports) {
        List<CityTransport> result = new LinkedList<>();

        for (CityTransport transport : cityTransports) {
            if (transport.getLength().equals(length)) {
                result.add(transport);
            }
        }
        return result;
    }

    @Override
    public List<CityTransport> sorted(List list, boolean reversed) {
        if (reversed) {
            Comparator priceComparator_reversed = Comparator.comparing(CityTransport::getTravel_price).reversed();
            list.sort(priceComparator_reversed);
        }
        else {
            Comparator priceComparator = Comparator.comparing(CityTransport::getTravel_price);
            list.sort(priceComparator);
    } return list;
}


}



