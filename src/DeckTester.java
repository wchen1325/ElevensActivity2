/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] ranks = {"jack", "queen", "king"};
        String[] suits =  {"spade", "heart","diamond","club"};
        int[] pointValues = {10,11,12};

        Deck d = new Deck(ranks, suits, pointValues);

        System.out.println(d);
        System.out.println(d.deal());



        String[] ranks2 = {"woof", "meow", "nyan", "oink", "poo", "boopu"};
        String[] suits2 =  {"spade", "heart","diamond","club"};
        int[] pointValues2 = {12,13,14,99,44,33};

        Deck d2 = new Deck(ranks2, suits2, pointValues2);

        System.out.println(d2);
        System.out.println(d.deal());


    }
}

