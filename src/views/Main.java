package views;

import com.sun.source.tree.WhileLoopTree;
import controller.ManageHotel;
import model.Hotel;
import model.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Hotel> hotelList = ManageHotel.hotelList;

    public static void main(String[] args) {
        ManageHotel manageHotel =  new ManageHotel();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("");
            System.out.println("1: Add new person!");
            System.out.println("2: Display person!");
            System.out.println("3: Delete information person!");
            System.out.println("4: Charge guest room!");
            System.out.println("5: To exit!");
            String line= sc.nextLine();

            switch (line){
                case "1":
                    manageHotel.enterInformation(hotelList);
                    break;
                case "2":
                    for (Hotel list:hotelList
                    ) {
                        System.out.println(list.toString());
                    }
                    break;
                case "3":
                    manageHotel.deleteNumOfDay(hotelList);
                    break;
                case "4":
                    System.out.println("Bill: " + manageHotel.payMoney());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
