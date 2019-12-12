//Given a string and two indices
//print a substring consisting of all characters in the inclusive range from
//You'll find the String class' substring method helpful in completing this challenge.
import java.util.Scanner;

public class SubstringRoger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.next();
        str = str.trim();
        System.out.println("Enter a starting index");
        int start = in.nextInt();
        System.out.println("Enter a ending index");
        int end = in.nextInt();

        System.out.println(str.substring(start,end));
    }
}
