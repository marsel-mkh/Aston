package Homework1_Aeroflot.model;

/**
 * Абстрактный класс члена экипажа
 */
public  abstract class CrewMember {
    private final int ID;
    private String Name;

    public CrewMember(int ID, String name) {
        this.ID = ID;
        Name = name;
    }

}
