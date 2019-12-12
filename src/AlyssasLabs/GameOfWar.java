package AlyssasLabs;
import java.util.*;
import java.lang.*;

public class GameOfWar {

        public static void main(String args[]){

            System.out.printf("Lets play a game of war.\n");
            System.out.printf("Type 1 to begin or 0 to exit.\n");
            Scanner keyboard = new Scanner(System.in);

            int initial = keyboard.nextInt();

            if (initial > 1){
                System.out.printf("Invalid input.\n");
                System.exit(-1);
            }

            if (initial == 0){
                System.exit(-1);
            }

            else {
                System.out.printf("Okay, lets play!\n");
                System.out.printf("\n");
            }
            System.out.printf("Here is a deck of 52 cards -> []:\n");

            int deck[] = new int[52];

            deck[0] = 2; //0-12 = hearts
            deck[1] = 3;
            deck[2] = 4;
            deck[3] = 5;
            deck[4] = 6;
            deck[5] = 7;
            deck[6] = 8;
            deck[7] = 9;
            deck[8] = 10;
            deck[9] = 11; //jack of hearts
            deck[10] = 12; //queen of hearts
            deck[11] = 13; //king of hearts
            deck[12] = 14; //ace of hearts

            deck[13] = 2; //13-25 = spades
            deck[14] = 3;
            deck[15] = 4;
            deck[16] = 5;
            deck[17] = 6;
            deck[18] = 7;
            deck[19] = 8;
            deck[20] = 9;
            deck[21] = 10;
            deck[22] = 11; //jack of spades
            deck[23] = 12; //queen of spades
            deck[24] = 13; //king of spades
            deck[25] = 14; //ace of spades

            deck[26] = 2; //0-12 = diamonds
            deck[27] = 3;
            deck[28] = 4;
            deck[29] = 5;
            deck[30] = 6;
            deck[31] = 7;
            deck[32] = 8;
            deck[33] = 9;
            deck[34] = 10;
            deck[35] = 11; //jack of diamonds
            deck[36] = 12; //queen of diamonds
            deck[37] = 13; //king of diamonds
            deck[38] = 14; //ace of diamonds

            deck[39] = 2; //39-51 = clubs
            deck[40] = 3;
            deck[41] = 4;
            deck[42] = 5;
            deck[43] = 6;
            deck[44] = 7;
            deck[45] = 8;
            deck[46] = 9;
            deck[47] = 10;
            deck[48] = 11; //jack of clubs
            deck[49] = 12; //queen of clubs
            deck[50] = 13; //king of clubs
            deck[51] = 14; //ace of clubs

            System.out.printf("First, lets shuffle it into 2 decks of 26.\n");

            Random rangen = new Random(); //Random number generator
            for (int i=0; i < deck.length; i++) { //shuffles the deck
                int randomPosition = rangen.nextInt(deck.length);
                int temp = deck[i];
                deck[i] = deck[randomPosition];
                deck[randomPosition] = temp;
            }

            int[] batman = new int[26]; //initializes 1st player's deck
            int[] superman = new int[26]; //initializes 2nd player's deck

            System.arraycopy(deck, 0, batman, 0, batman.length); //takes 26 cards and puts into batman's deck.
            System.arraycopy(deck, batman.length, superman, 0, superman.length);//takes the other 26 and puts into superman's deck.
            System.out.printf(".\n");
            System.out.printf(".\n");
            System.out.printf("Here's your deck. --> [?]\n");
            System.out.printf(".\n");
            System.out.printf(".\n");
            System.out.printf("Here's your opponent's deck. --> [?]\n");
            System.out.printf(".\n");
            System.out.printf(".\n");
            System.out.printf("Okay, lets begin!\n");
            System.out.printf("\n");
            System.out.printf("\n");
            System.out.printf("Type 1 to flip your cards.\n");
            System.out.printf("Which ever player holds all the cards by the end wins.\n");
            int q = keyboard.nextInt();
            if (q == 1){
                System.out.printf("Lets see...\n");
            }
            if (q != 1){
                System.out.printf("That wasn't one....\n");
                int q2 = keyboard.nextInt();
                if (q != 1) {
                    System.exit(-1);
                }
            }
            List<Integer> batmanList = new ArrayList<Integer>();//converts array1 into arraylist1
            for (int i = 0; i < batman.length; i++)
            {
                batmanList.add(batman[i]);
            }
            System.out.println(batmanList);
            List<Integer> supermanList = new ArrayList<Integer>();//converts array2 into arraylist2
            for (int i = 0; i < superman.length; i++)
            {
                supermanList.add(superman[i]);
            }
            System.out.println(supermanList);


            for (int i = 0; i < batmanList.size(); i++){
                if (batmanList.get(i) < supermanList.get(i)){
                    System.out.printf("Player 1: %d\n", batmanList.get(i));
                    System.out.printf("Player 2: %d\n", supermanList.get(i));
                    System.out.printf("Player 2 wins round!\n");
                    supermanList.add(batmanList.get(i));
                    batmanList.remove(batmanList.get(i));
                }
                if (batmanList.get(i) < supermanList.get(i)){
                    System.out.printf("Player 1: %d\n", batmanList.get(i));
                    System.out.printf("Player 2: %d\n", supermanList.get(i));
                    System.out.printf("Player 1 wins round!\n");
                    batmanList.add(supermanList.get(i));
                    supermanList.remove(supermanList.get(i));
                }
                if (batmanList.get(i) == supermanList.get(i)){
                    System.out.printf("Player 1: %d\n", batmanList.get(i));
                    System.out.printf("Player 2: %d\n", supermanList.get(i));
                    System.out.printf("It's a tie, cards return to your deck.\n");
                }
            }
            if (batmanList.isEmpty() || supermanList.isEmpty()){
                if (batmanList.isEmpty()) {
                    System.out.printf("Player 2 WINS THE GAME!!!!!!\n");
                }
                if (supermanList.isEmpty()) {
                    System.out.printf("Player 1 WINS THE GAME!!!!!!\n");
                }
            }


            System.out.println(batmanList);

            System.out.println(supermanList);

            System.out.printf("\n");
            System.out.printf("\n");
        }
    }

