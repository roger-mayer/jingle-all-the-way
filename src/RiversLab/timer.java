package RiversLab;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class timer {
    //For the actual timer
    public static String addZero(Integer n, Integer test){
        if (n < test){
            return "0";
        }
        return "";
    }
    //For the actual timer
    public static String showTime(Integer time){
        String tempSec = "" + (time % 60);
        String tempMin = "" + (time / 60);
        return addZero(Integer.parseInt(tempMin), 10) + tempMin + ":" + addZero(Integer.parseInt(tempSec), 10) + tempSec;
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
                    System.out.println("==========================================================");
                    System.out.println("                     WIP(not working)                     ");
                    System.out.println("==========================================================");
                    boolean calGo = true;
                    while (calGo){
                        System.out.println("Calender:\n" +
                                "0: Back to main menu\n" +
                                "1: See next 30 days\n" +
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
                                System.out.println("1");
                                break;
                            }
                            case "2":{
                                System.out.println("2");
                                break;
                            }
                            case "3":{
                                System.out.println("3");
                                break;
                            }
                            default:{
                                System.out.println("Invalid input");
                                break;
                            }
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
    }
}