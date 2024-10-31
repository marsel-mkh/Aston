package Homework1_Aeroflot.model;
/**
 * Просто Класс Самолета
 **/
public class Airplane {
    private  String model;
    private  int planeSize;//вместительность
    private  int flightRange;//дальность полета

    public Airplane(String model, int planeSize, int flightRange) {
        this.model = model;
        this.planeSize = planeSize;
        this.flightRange = flightRange;
    }

    public String getModel() {
        return model;
    }

    public int getPlaneSize() {
        return planeSize;
    }

    public int getFlightRange() {
        return flightRange;
    }
}
