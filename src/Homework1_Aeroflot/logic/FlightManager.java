package Homework1_Aeroflot.logic;

import Homework1_Aeroflot.model.*;

import java.util.ArrayList;
import java.util.List;
/**
 * FlightManager управляет коллекцией рейсов
 * FlightManager отменяет рейс по каким либо причинам
 * FlightManager изменяет место назначения по каким либо причинам
 * **/
public class FlightManager {
        List<Flight> flights = new ArrayList<>();

    public FlightManager() {
        this.flights = new ArrayList<>();
    }
    public void addFlight(Flight flight){
        flights.add(flight);
    }
    public void cancelFlight(int flightID){
        //можно сделать доп условия для отмены рейса(привязать погодные данные и тд)
        for(Flight flight : flights){

            if (flight.getFlightID() == flightID ) {
                flight.cancelFlight();
                System.out.println("Рейс " + flightID + " отменен");
            }
            else{
                System.out.println("Рейс не найден");
            }
        }
    }
    public void changeDestinationAirport(int flightID,Airport newDestinationAirport){
        //можно добавить доп условия для изменения аэропорта назначения. Например дозаправка.
        for(Flight flight : flights){

            if(flight.getFlightID() == flightID){

                flight.chandgeDestinationAirport(newDestinationAirport);
                System.out.println("Аэропорт назначения измененен на " + newDestinationAirport.getPortName());
            }
            else{
                System.out.println("Рейс не найден");
            }
        }
    }

}
