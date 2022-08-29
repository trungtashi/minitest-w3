package controller;

import model.Hotel;
import model.NumOfDay;
import model.Person;
import storage.ReadAndWrite;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ManageHotel {
    public static List<Hotel> hotelList = ReadAndWrite.readFile();

    public void enterInformation(List<Hotel> hotelList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of days: ");
        int numberOfDay = sc.nextInt();
        System.out.println("Enter type room: ");
        String typeRoom = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter price room: ");
        double roomPrice = sc.nextDouble();
        System.out.println("Enter name person: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter date of birth: ");
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Enter day: ");
        int day = sc.nextInt();
        sc.nextLine();
        LocalDate date = LocalDate.of(year,month,day);
        System.out.println("Enter identityCard");
        String id = sc.nextLine();
        Person person = new Person(numberOfDay, typeRoom,roomPrice,name,date,id);
        hotelList.add(person);
        ReadAndWrite.writeFile(hotelList);

    }
    public  void deleteNumOfDay(List<Hotel> hotelList){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the idCard to remove!");
        String id = sc.nextLine();
        for (int i = 0; i < hotelList.size(); i++) {
            if (hotelList.get(i) instanceof Person) {
                if (hotelList.get(i).getId().equals(id))
                    hotelList.remove(hotelList.get(i));
                ReadAndWrite.writeFile(hotelList);
            } else {
                System.out.println("Not Found Id:");
            }
        }
    }
    public double payMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id card of you");
        String id = sc.nextLine();
        double priceRoom = 0;
        for (int i = 0; i < hotelList.size(); i++) {
            if(hotelList.get(i) instanceof NumOfDay){
                if(hotelList.get(i).getId().equals(id)){
                    priceRoom = ((NumOfDay) hotelList.get(i)).payMoney();
                }
            }
        }
        return priceRoom;
    }
}
