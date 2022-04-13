package com.transport.dealer.impl;

import com.transport.CityTransport;
import com.transport.dealer.IDealer;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Setter
@Getter

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
        if (reversed == true) {
            Comparator priceComparator_reversed = Comparator.comparing(CityTransport::getTravel_price).reversed();
            list.sort(priceComparator_reversed);

        }
        else {
            Comparator priceComparator = Comparator.comparing(CityTransport::getTravel_price);
            list.sort(priceComparator);
    } return list;
}


}

   /*
    public float compareTo(CityTransport transport) {
        return (this.travel_price - transort.travel_price);


    }*/



