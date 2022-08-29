package model;

import java.io.Serializable;

public abstract  class  Hotel implements Serializable {
    private int numbersOfDay;
    private String typeOfRoom;
    private double roomPrice;

    public Hotel() {
    }

    public Hotel(int numbersOfDay, String typeOfRoom, double roomPrice) {
        this.numbersOfDay = numbersOfDay;
        this.typeOfRoom = typeOfRoom;
        this.roomPrice = roomPrice;
    }

    public int getNumbersOfDay() {
        return numbersOfDay;
    }

    public void setNumbersOfDay(int numbersOfDay) {
        this.numbersOfDay = numbersOfDay;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }
    public abstract  String getId();
    @Override
    public String toString() {
        return "Hotel{" +
                "numbersOfDay=" + numbersOfDay +
                ", typeOfRoom='" + typeOfRoom + '\'' +
                ", roomPrice=" + roomPrice +
                '}';
    }

}
