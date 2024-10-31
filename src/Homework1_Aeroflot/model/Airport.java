package Homework1_Aeroflot.model;

/**
 * Просто класс Аэропорта
 */
public class Airport {
    private final String portName;
//можно привязать координаты с карты для вычисления длины полета между аэропортами

    public Airport(String portName) {
        this.portName = portName;
    }

    public String getPortName() {
        return portName;
    }
}
