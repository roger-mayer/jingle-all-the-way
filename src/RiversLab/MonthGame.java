package RiversLab;
import java.util.HashMap;
import java.util.Scanner;
public class MonthGame {
    public static HashMap<String, String> months = new HashMap<String, String>();
    public static String[] allMonths = new String[12];
    public static String getMonth(){
        while (true) {
            int randIn = (int) (Math.random() * 12);
            String temp = allMonths[randIn];
            if (!temp.equals("")){
                allMonths[randIn] = "";
                return temp;
            }
        }
    }
    public static Scanner sc = new Scanner(System.in);
    public static byte remaining = 0;
    public static byte score = 0;
    public static void main(String[] args) {
        boolean continueGame = true;
        while (continueGame) {
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
            remaining = 12;
            while (true) {
                String input;
                String selected = getMonth();
                System.out.printf("How many days does %s have?\n", selected);
                input = sc.nextLine();
                if (input.equals(months.get(selected))) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.printf("Incorrect, the right answer was %s!\n", months.get(selected));
                }
                remaining--;
                if (remaining <= 0) {
                    System.out.printf("You got %s out of 12 correct!\n", score);
                    System.out.println("Would you like to play again? (y or n)");
                    input = sc.nextLine();
                    if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
                        break;
                    } else {
                        continueGame = false;
                        break;
                    }
                }
            }
        }
    }
}