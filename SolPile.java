import java.util.*;
/**
 * Write a description of class SolPile here.
 *
 * @author (Dante Paterna)
 * @version (3/9/2022)
 */
public class SolPile
{
    private ArrayList<Card> solpile;
    private int currentCardIndex; //the index of the top card

    /**
     * Constructor for objects of class SolPile
     */
    public SolPile()
    {
        solpile = new ArrayList<Card>();
        currentCardIndex = -1;
    }
    
    /**
     * Adds a card to the collection and increments the current card
     * index
     * 
     * @param   c   the card to be added
     */
    public void addCard(Card c)
    {
        solpile.add(c);
        currentCardIndex++;
    }
    
    /**
     * Returns the top card of the pile and decrements the current card
     * counter
     * 
     * @return  the top card of the pile
     */
    public Card removeCard()
    {
        if(currentCardIndex == -1)
        {
            System.out.println("ERROR: Pile is empty.");
            return new Card("EMPTY", 0);
        }
        Card c = solpile.get(currentCardIndex);
        solpile.remove(currentCardIndex);
        currentCardIndex--;
        return c;
    }
    
    /**
     * Returns the information of the top card
     * 
     * @return  the top card's toString value
     */
    public String toString()
    {
        if(currentCardIndex == -1)
        {
            return "ERROR: Pile is empty.";
        }
        return solpile.get(currentCardIndex).toString() + " - # of Cards: " + (currentCardIndex+1);
    }
}
