package RiversLab;

import java.util.HashMap;
import java.util.Scanner;

public class MonthGame {
    public static HashMap<String, String> months = new HashMap<String, String>();
    public static String[] allMonths = new String[12];
    public static String getMonth(){
        return allMonths[(int) (Math.random() * 12)];
    }
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        months.put("January", "31");
        months.put("February", "28");
        months.put("March", "31");
        months.put("April", "30");
        months.put("May", "31");
        months.put("June", "30");
        months.put("July", "31");
        months.put("August", "31");
        months.put("September", "30");
        months.put("October", "31");
        months.put("November", "30");
        months.put("December", "31");
        allMonths[0] = "January";
        allMonths[1] = "February";
        allMonths[2] = "March";
        allMonths[3] = "April";
        allMonths[4] = "May";
        allMonths[5] = "June";
        allMonths[6] = "July";
        allMonths[7] = "August";
        allMonths[8] = "September";
        allMonths[9] = "October";
        allMonths[10] = "November";
        allMonths[11] = "December";
        while (true){
            Byte input;
            String selected = getMonth();
            System.out.printf("How many days does %s have?\n", selected);
            while (true) {
                try {
                    input = sc.nextByte();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input");
                }
            }
            if (input.toString().equals(months.get(selected))){
                System.out.println("Correct!");
            } else {
                System.out.printf("Incorrect, the right answer was %s!\n", months.get(selected));
            }
        }
    }
}
