package com.company;
import java.sql.SQLOutput;
import java.util.*;

class Main {
    static Scanner input =  new Scanner(System.in);
    LinkedList<Cruise> cruiseHolidays = new LinkedList<Cruise>();
    LinkedList<Abroad> internationalHolidays = new LinkedList<Abroad>();
    LinkedList<UkBased> domesticHolidays = new LinkedList<UkBased>();

    public static void main(String[] args) {
        //(cabin, depPort, retPort, ppn, numPeople, price, startDate, endDate, numNights )
        Main n = new Main();
        n.menu();



    }
    //this is the menu that the program will show and ask the user to select what they want to do.
    public void menu() {
        int menuchoices = 0;

        System.out.println("-----------------------------------------");
        System.out.println("Welcome to the Travel Agents Booking System");
        System.out.println("---------------------------");
        System.out.println(" (1) Booking a Cruise");
        System.out.println(" (2) Booking a UK based holiday");
        System.out.println(" (3) Booking a holiday abroad");
        System.out.println(" (4) Closing the system");
        System.out.println("-----------------------------------------");
        System.out.println(" ");
        System.out.println("Please select the option you would like to use: ");
        menuchoices = input.nextInt();

        switch (menuchoices) {
            case 1:
                newCruise();
            case 2:
                newDomestic();
            case 3:
                newInternational();
            case 4:
                System.out.println("Thank you for using this system.");
                System.exit(1);
            default:
                menu();
        }
    }

    public void newCruise () {
        String C ;
        String DP;
        String RP;
        int PN;
        int NP;
        int P;
        String SD;
        String ED;
        int N;
        System.out.println("(1) Add New Data");
        System.out.println("(2) View The Data");
        System.out.println("(3) Return");
        int userInput = input.nextInt();
        input.nextLine();
        while (true){
            switch (userInput) {
                case 1:
                    System.out.println("Please input the following information");
                    System.out.println("Cabin Type");
                    C = input.nextLine();
                    System.out.println("Departure Time");
                    DP = input.nextLine();
                    System.out.println("Return Date");
                    RP = input.nextLine();
                    System.out.println("Number of People");
                    NP = input.nextInt();
                    input.nextLine();
                    System.out.println("Total Price");
                    P = input.nextInt();
                    input.nextLine();
                    System.out.println("The Start Date DD/MM/YYYY");
                    SD = input.nextLine();
                    System.out.println("The End Date DD/MM/YYYY");
                    ED = input.nextLine();
                    System.out.println("The Total Nights of the stay");
                    N = input.nextInt();
                    input.nextLine();
                    PN = P/N;

                    //Cruise(String c, String dp, String rp, int pn, int np, int p, String sd, String ed, int night)
                    cruiseHolidays.add(new Cruise(

                    DP,
                    C,
                    RP,
                    PN,
                    NP,
                    P,
                    SD,
                    ED,
                    N));
                    newCruise();
                case 2:
                    System.out.print(cruiseHolidays.size());
                    System.out.println(cruiseHolidays.toString());
                    newCruise();
                case 3:
                    System.out.println("You Have Chosen to go back");
                    menu();
                default:
                    System.out.println("incorrect input");
                    newCruise();
            }
        }
    }
    public void newDomestic () {
        String C;
        String DP;
        String RP;
        int PN;
        int NP;
        int P;
        String SD;
        String ED;
        int N;
        System.out.println("(1) Add New Data");
        System.out.println("(2) View The Data");
        System.out.println("(3) Return");
        int userInput = input.nextInt();
        input.nextLine();
        while (true) {
            switch (userInput) {
                case 1:
                    System.out.println("Please input the following information");
                    System.out.println("Cabin Type");
                    C = input.nextLine();
                    System.out.println("Number of People");
                    NP = input.nextInt();
                    input.nextLine();
                    System.out.println("Total Price");
                    P = input.nextInt();
                    input.nextLine();
                    System.out.println("The Start Date DD/MM/YYYY");
                    SD = input.nextLine();
                    System.out.println("The End Date DD/MM/YYYY");
                    ED = input.nextLine();
                    System.out.println("The Total Nights of the stay");
                    N = input.nextInt();
                    input.nextLine();
                    PN = P / N;

                    //UkBased(String a, int pn, int np, int p, String sd, String ed, int night)
                    domesticHolidays.add(new UkBased(

                            C,
                            PN,
                            NP,
                            P,
                            SD,
                            ED,
                            N));
                    newCruise();
                case 2:
                    System.out.print(domesticHolidays.size());
                    System.out.println(domesticHolidays.toString());
                    newDomestic();
                case 3:
                    System.out.println("You Have Chosen to go back");
                    menu();
                default:
                    System.out.println("incorrect input");
                    newCruise();

            }
        }
    }
        public void newInternational () {
            String C;
            String DP;
            String RP;
            int PN;
            int NP;
            int P;
            String SD;
            String ED;
            int N;
            System.out.println("(1) Add New Data");
            System.out.println("(2) View The Data");
            System.out.println("(3) Return");
            int userInput = input.nextInt();
            input.nextLine();
            while (true) {
                switch (userInput) {
                    case 1:
                        System.out.println("Please input the following information");
                        System.out.println("Cabin Type");
                        C = input.nextLine();
                        System.out.println("Number of People");
                        NP = input.nextInt();
                        input.nextLine();
                        System.out.println("Total Price");
                        P = input.nextInt();
                        input.nextLine();
                        System.out.println("The Start Date DD/MM/YYYY");
                        SD = input.nextLine();
                        System.out.println("The End Date DD/MM/YYYY");
                        ED = input.nextLine();
                        System.out.println("The Total Nights of the stay");
                        N = input.nextInt();
                        input.nextLine();
                        PN = P / N;

                        //UkBased(String a, int pn, int np, int p, String sd, String ed, int night)
                        internationalHolidays.add(new Abroad(

                                C,
                                PN,
                                NP,
                                P,
                                SD,
                                ED,
                                N));
                        newCruise();
                    case 2:
                        System.out.print(internationalHolidays.size());
                        System.out.println(internationalHolidays.toString());
                        newInternational();
                    case 3:
                        System.out.println("You Have Chosen to go back");
                        menu();
                    default:
                        System.out.println("incorrect input");
                        newInternational();

                }
            }
        }
    }

class Booking{

    int ppn; //price per person per night
    int numPeople;
    int price; //= ppn * numPeople * numnights
    String startDate;
    String endDate;
    int numNights;

    Booking()
    {
        ppn = 0;
        numPeople = 0;
        price = 0;
        startDate = "";
        endDate = "";
        numNights = 0;
    }
    //(ppn, numPeople, price, startDate, endDate, numNights )
    Booking(int pn, int np, int p, String sd, String ed, int night)
    {
        ppn = pn;
        numPeople = np;
        price = p;
        startDate = sd;
        endDate = ed;
        numNights = night;
    }

    int getPPN () { return ppn; }

    void setPPN(int n) { ppn=n; }
}

class Cruise extends Booking{

    String depPort;
    String retPort;
    String cabin; //internal or seaView

    Cruise()
    {
        super();
        depPort = "";
        retPort = "";
        cabin = "";
    }
    //(cabin, depPort, retPort, ppn, numPeople, price, startDate, endDate, numNights )
    Cruise(String c, String dp, String rp, int pn, int np, int p, String sd, String ed, int night)
    {
        super(pn, np, p, sd, ed, night);
        cabin = c;
        depPort = dp;
        retPort = rp;
    }
    @Override//allows the data to be displayed as plain text
    public String toString() {
        return  "\n Cruise Booking \n" +
                "\n Cabin Type: " + depPort + "\n" +
                "\n Departure Port: " + retPort + "\n" +
                "\n Return Port: " + cabin + "\n" +
                "\n Price Per Night: " + ppn + "\n" +
                "\n Number of People: " + numPeople + "\n" +
                "\n Number of Nights: " + numNights + "\n" +
                "\n Start Date: " + startDate + "\n" +
                "\n End Date: " + endDate + "\n" +
                "\n Total Price: " + price + "\n" +
                "\n=============================\n";
    }

}

class Abroad extends Booking{

    String accom; //property or room

    Abroad()
    {
        super();
        accom = "";
    }
    //(accom, ppn, numPeople, price, startDate, endDate, numNights )
    Abroad(String a, int pn, int np, int p, String sd, String ed, int night)
    {
        super(pn, np, p, sd, ed, night);
        accom =a;

    }
    @Override//allows the data to be displayed as plain text
    public String toString() {
        return  "\n Abroad Booking \n" +
                "\n Cabin Type: " + accom + "\n" +
                "\n Price Per Night: " + ppn + "\n" +
                "\n Number of People: " + numPeople + "\n" +
                "\n Number of Nights: " + numNights + "\n" +
                "\n Start Date: " + startDate + "\n" +
                "\n End Date: " + endDate + "\n" +
                "\n Total Price: " + price + "\n" +
                "\n=============================\n";
    }


}

class UkBased extends Booking{

    String accom; //property or room

    UkBased()
    {
        super();
        accom = "";
    }
    //(accom, ppn, numPeople, price, startDate, endDate, numNights )
    UkBased(String a, int pn, int np, int p, String sd, String ed, int night)
    {
        super(pn, np, p, sd, ed, night);
        accom =a;

    }
    @Override//allows the data to be displayed as plain text
    public String toString() {
        return  "\n UK Holiday Booking \n" +
                "\n Cabin Type: " + accom + "\n" +
                "\n Price Per Night: " + ppn + "\n" +
                "\n Number of People: " + numPeople + "\n" +
                "\n Number of Nights: " + numNights + "\n" +
                "\n Start Date: " + startDate + "\n" +
                "\n End Date: " + endDate + "\n" +
                "\n Total Price: " + price + "\n" +
                "\n=============================\n";
    }

}




