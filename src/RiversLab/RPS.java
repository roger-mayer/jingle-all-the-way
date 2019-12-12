package RiversLab;
import java.util.Scanner;

public class RPS {
    public static byte scorePlayer = 0;
    public static byte scoreCPU = 0;
    public static choice playerChoice;
    public static choice CPU;

    public static void play(){
        if (playerChoice.obj != CPU.obj) {
            switch (playerChoice.obj) {
                case 1: {
                    if (CPU.obj == 2) {
                        scoreCPU++;
                    } else if (CPU.obj == 3) {
                        scorePlayer++;
                    }
                    break;
                }
                case 2: {
                    if (CPU.obj == 3) {
                        scoreCPU++;
                    } else if (CPU.obj == 1) {
                        scorePlayer++;
                    }
                    break;
                }
                case 3: {
                    if (CPU.obj == 1) {
                        scoreCPU++;
                    } else if (CPU.obj == 2) {
                        scorePlayer++;
                    }
                    break;
                }
            }
        } else {
            System.out.println("Tie!");
        }
    }
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a choice:\n1: Rock\n2: Paper\n3: Scissors");
            do {
                try {
                    playerChoice = new choice(scanner.nextByte());
                    break;
                } catch (Exception e){
                    System.out.println("Enter a number between 1-3");
                }
            } while (true);

            CPU = new choice((byte)0);

            System.out.println("You chose " + playerChoice.display + " the computer chose " + CPU.display);

            play();

            System.out.println("" + scorePlayer + " - " + scoreCPU);
        }
    }
}