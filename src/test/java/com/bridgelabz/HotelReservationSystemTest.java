package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationSystemTest {

    HotelReservationSystem hotels = new HotelReservationSystem();

    @Test
    public void checkedGivenHotelNameandRateAreAdded_True()
    {
        boolean result = hotels.addHotel("Lakewood",110,4);
        Assertions.assertTrue(result);
    }
}

