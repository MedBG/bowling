
import bowling.Bowling;

public class BowlingTest {

    public static void main(String args[]){

        /* Strike Score */
        Bowling strike = new Bowling();

        for (int i = 0; i < 12; i++) {
            strike.roll(10);
            System.out.print("X ");
        }

        System.out.println("\n Strike Score: "+strike.score());
        /* Strike Score */


        /* Miss Score */

        Bowling miss = new Bowling();

        for (int i = 0; i < 10; i++) {
            miss.roll(9);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("9- ");
        }
        System.out.println("\n Miss Score: "+miss.score());
        /* Miss Score */

        /* Spare Score */

        Bowling spare = new Bowling();

        for (int i = 0; i < 21; i++) {
            spare.roll(5);
        }
        for (int i = 0; i < 11; i++) {
            System.out.print("5/ ");
        }
        System.out.println("\n Spare Score: "+spare.score());
        /* Spare Score */
    }

}