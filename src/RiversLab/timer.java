package RiversLab;
import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int time = 0;
            while (true){
                System.out.println("Enter timer:");
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
        }
    }
}