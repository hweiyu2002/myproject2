package hweiyu.com.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //Constructor, constant value
        Ticket ticket = new Ticket(
                Ticket.TAIPEI_STATION
                Ticket.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(1:Taipei, 2:Taichung, 3:Kaohsiung)");
        int startStation = Integer.parseInt(scanner.next());
        switch (choice) {
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Your destination station? (1:Taipei, 2:Taichung, 3:Kaohsiung)");
        choice = Integer.parseInt(scanner.next());
        station destination = null;
        switch (choice) {
            case 1:
                destination = Station.TAIPEI_STATION;
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Which?");
    }
}