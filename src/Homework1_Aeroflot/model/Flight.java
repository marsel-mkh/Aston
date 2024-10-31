package Homework1_Aeroflot.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс полета с основными данными
 * Имеет такие методы как отмена рейса и изменение аэропорта назначения.
 */
//Можно добавить метод для вычисления расстояния между портами и учитывать дозаправки
public class Flight {
    private final int flightID;
    private Airport departureAirport;
    private Airport destinationAirport;
    private Airplane plane;
    private List<CrewMember> crewMembers;
    private boolean isCanseled;// отменен ли рейс

    public Flight(int flightID, Airport departureAirport,
                  Airport destinationAirport, Airplane plane) {
        this.flightID = flightID;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.plane = plane;
        this.isCanseled = false;

        this.crewMembers = new ArrayList<>();
    }

    public void cancelFlight(){
        isCanseled = true;//рейс отменен
    }

    public void addCrewMemberds(CrewMember member){// добавление экипажа
        crewMembers.add(member);
    }
    public void chandgeDestinationAirport(Airport newDestinationAirport){//изменение аэропорта назначения
        destinationAirport = newDestinationAirport;
    }

    public int getFlightID() {
        return flightID;
    }
}
