package com.bridgelabz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class HotelReservationSystem {

    ArrayList<HotelReservation> listOfHotel = new ArrayList<HotelReservation>();
    public boolean addHotel(String hotelName,int rates, int rating)
    {
        HotelReservation hotel=new HotelReservation(hotelName,rates,rating);
        listOfHotel.add(hotel);
        System.out.println(listOfHotel.isEmpty());
        if(listOfHotel.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
