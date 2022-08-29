package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Person extends Hotel implements NumOfDay, Serializable {
    private String name;
    private LocalDate dateOfBirth;
    private String id;

    public Person(String name, LocalDate dateOfBirth, String id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }
    public Person(int numberOfDay, String typeRoom, Double roomPrice, String name, LocalDate dateOfBirth, String id) {
        super(numberOfDay,typeRoom,roomPrice);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = " + name  +
                ", dateOfBirth = " + dateOfBirth +
                ", identityCard = " + id +
                '}';
    }

    @Override
    public double payMoney() {
        double calculator = getNumbersOfDay()*getRoomPrice();
        return calculator;
    }
}
