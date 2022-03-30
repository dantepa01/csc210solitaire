import java.util.ArrayList;
/**
*   A skeleton for class Deck
*   maintains an ArrayList of 52 cards
*   deal() returns "top" card.
*   Outputs error message and returns a "blank" card when desck is exhausted
*
*   @author     (Dante Paterna)
*   @version    (3/9/2022)
*/
public class Deck
{
    private ArrayList<Card> deck;   //need to store the cards
    private int currentCardIndex;   //need to know which card we will deal from "top" of deck
    
    public Deck()     // constructor fills an array of Cards
    {
        
        String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new ArrayList<Card>();    
        currentCardIndex  = 0;       //  first Card dealt is from position zero, then 1, then 2 etc...

        // populate deck with Card objects
        for ( int count = 0; count < 52; count++ ) 
            deck.add( new Card( suits[ count / 13 ], 1 +count % 13  ));
            
       java.util.Collections.shuffle(deck);    //uses a very handy method from the Collections class!
    } 
	
    //   1.  if currentCardIndex too big, output error, return "blank" card
    //
    //   2.  must "advance" to next card:  we will use POSTFIX++ to do this
    //             example:     number++  uses cuurent value of number, then adds one
    /**
     * Returns the next card object in the deck. if current card index
     * is too large, returns an empty card
     * 
     * @return  next card in deck
     */
    public Card deal()
    {
        //1. check currentCardIndex too big
    	//       -- output error message
    	//       -- return new Card("EMPTY", "EMPTY");  
        if(currentCardIndex >= deck.size())
        {
            System.out.println("ERROR: Current card index is too large");
            return new Card("EMPTY", 0);
        }
        //2.  one-liner: return the current card, using postfix to set currentCardIndex for next card
        return deck.get(currentCardIndex++);
    }
}
