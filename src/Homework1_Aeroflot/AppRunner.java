package Homework1_Aeroflot;

import Homework1_Aeroflot.logic.*;
import Homework1_Aeroflot.model.*;
import Homework1_Aeroflot.model.CrewMembers.*;

//Система Аэрофлот. Администратор формирует летную Бригаду (пилоты, штурман, радист, стюардессы) на Рейс.
// Каждый Рейс выполняется Самолетом с определенной вместимостью и дальностью полета.
// Рейс может быть отменен из-за погодных условий в Аэропорту отлета или назначения.
// Аэропорт назначения может быть изменен в полете из-за технических неисправностей,
// о которых сообщил командир
public class AppRunner {
    public static void main(String[] args) {
        Airport port = new Airport("Москва");
        Airport port2 = new Airport("Казань-1");
        Airport port3 = new Airport("Питер");

        Airplane Boeng = new Airplane("Boeng-737",300,1500);
        Flight fl1 = new Flight(15,port,port2,Boeng);
        fl1.addCrewMemberds(new Pilot("John Snow", 01));
        fl1.addCrewMemberds(new CoPilot("Sansa Stark", 02));
        fl1.addCrewMemberds(new Navigator("Igrit",03));

        FlightManager fm = new FlightManager();
        fm.addFlight(fl1);
        fm.changeDestinationAirport(15,port3);
        fm.cancelFlight(15);
    }

}