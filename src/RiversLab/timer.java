package RiversLab;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.time.LocalTime;
import java.time.LocalDate;
public class timer {
    public static String addZero(Integer n, Integer test){
        if (n < test){
            return "0";
        }
        return "";
    }
    public static String showTime(Integer time){
        String tempSec = "" + (time % 60);
        String tempMin = "" + (time / 60);
        return addZero(Integer.parseInt(tempMin), 10) + tempMin + ":" + addZero(Integer.parseInt(tempSec), 10) + tempSec;
    }
    public static Path events = Paths.get("events.txt");
    public static void checkForEvents() {
        if (!Files.exists(events)) {
            System.out.println("File does not exist!");
            try {
                Files.createFile(events);
                System.out.println("Making file!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String formatToEvent(String n){
        String first = n.substring(0,n.indexOf("|"));
        String last = n.substring(n.indexOf("|") + 1);
        return "Date: " + first + "  Event: " + last;
    }
    public static String formatToString(Event n){
        return (n.eventDate+"|"+n.eventName);
    }
    public static void updateEvents(List<String> n) {
        try {
            Files.writeString(events, "");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String item : n) {
            try {
                Files.writeString(events, item+"\n", StandardOpenOption.APPEND); //
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean go = true;
        while (go) {
            System.out.print("Menu:\n" +
                    "0: Exit\n" +
                    "1: Show current time\n" +
                    "2: Show current date\n" +
                    "3: Start a timer\n" +
                    "4: Events & calender\n");
            System.out.println("Enter an option:");
            String userIn = sc.nextLine();
            switch (userIn){
                case "0": {
                    go = false;
                    break;
                }
                case "1": {
                    LocalTime temp = LocalTime.now();
                    System.out.println(temp.toString().substring(0, 5));
                    break;
                }
                case "2":{
                    LocalDate temp = LocalDate.now();
                    System.out.println(temp.toString());
                    break;
                }
                case "3":{
                    int time = 0;
                    while (true){
                        System.out.println("Enter amount of seconds:");
                        String input = sc.nextLine();
                        try {
                            time = Integer.parseInt(input);
                            break;
                        } catch (Exception e){
                            System.out.println("Invalid input");
                        }
                    }
                    try {
                        while (time > 0) {
                            System.out.println(showTime(time));
                            Thread.sleep(1000);
                            time--;
                        }
                        System.out.println("Timer done!");
                    } catch (Exception e) {
                        System.out.println("Error");
                    }
                    break;
                }
                case "4":{
                    boolean calGo = true;
                    checkForEvents();
                    List<String> allEvents = new ArrayList<>();
                    try {
                        allEvents = Files.readAllLines(events);
                    } catch (Exception e){
                        System.out.println("error");
                    }
                    while (calGo){
                        System.out.println("Calender:\n" +
                                "0: Back to main menu\n" +
                                "1: See events this month\n" +
                                "2: See all events\n" +
                                "3: Edit events calender\n");
                        System.out.println("Enter an option:");
                        String calIn = sc.nextLine();
                        switch (calIn){
                            case "0":{
                                calGo = false;
                                break;
                            }
                            case "1":{
                                for (int i = 0; i < allEvents.size(); i++) {
                                    if (allEvents.get(i).substring(0,2).equals(LocalDate.now().toString().substring(5,7))) {
                                        System.out.println(formatToEvent(allEvents.get(i)));
                                    }
                                }
                                break;
                            }
                            case "2":{
                                try {
                                    for (String it : allEvents) {
                                        System.out.println(formatToEvent(it));
                                    }
                                } catch (Exception e){
                                    System.out.println("Error");
                                }
                                break;
                            }
                            case "3":{
                                System.out.println("\nEdit Events:\n" +
                                        "0: Back\n" +
                                        "00: Delete an item\n" +
                                        "000: Add a new event\n" +
                                        "Or select an existing event to change details:");
                                for (int i = 0; i < allEvents.size(); i++) {
                                    System.out.println(" "+(i + 1)+": "+formatToEvent(allEvents.get(i)));
                                }
                                Scanner scan = new Scanner(System.in);
                                String input = scan.nextLine();
                                switch (input){
                                    case "0":{
                                        break;
                                    }
                                    case "00":{
                                        System.out.println("Enter an item number to delete");
                                        while (true) {
                                            try {
                                                input = scan.nextLine();
                                                allEvents.remove(Integer.parseInt(input) - 1);
                                                break;
                                            } catch (Exception e){
                                                System.out.println("Invalid input");
                                            }
                                        }
                                        break;
                                    }
                                    case "000":{
                                        System.out.println("Enter date: ");
                                        String nDate = sc.nextLine();
                                        System.out.println("Enter name/description");
                                        String nEvent = sc.nextLine();
                                        Event temp = new Event(nEvent, nDate);
                                        allEvents.add(formatToString(temp));
                                        break;
                                    }
                                    default:{
                                        System.out.println(allEvents.size());
                                        if (Integer.parseInt(input) <= allEvents.size() & Integer.parseInt(input) > 0){
                                            System.out.println("editing " + formatToEvent(allEvents.get(Integer.parseInt(input) - 1)));
                                            System.out.println("Enter new date: ");
                                            String nDate = sc.nextLine();
                                            System.out.println("Enter new name/description");
                                            String nEvent = sc.nextLine();
                                            Event temp = new Event(nEvent, nDate);
                                            List<String> firstPart = new ArrayList<>(allEvents.subList(0, Integer.parseInt(input) - 1));
                                            List<String> lastPart = new ArrayList<>(allEvents.subList(Integer.parseInt(input) - 1, allEvents.size() - 1));
                                            firstPart.add(formatToString(temp));
                                            firstPart.addAll(lastPart);
                                            allEvents = firstPart;
                                            break;
                                        } else {
                                            System.out.println("Invalid input");
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                            default:{
                                System.out.println("Invalid input");
                                break;
                            }
                        }
                        updateEvents(allEvents);
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid input main menu");
                    break;
                }
            }
        }
    }
}