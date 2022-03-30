/**
 * Contains information on an individual card
 *
 * @author (Dante Paterna)
 * @version (3/9/2022)
 */
public class Card
{
    private String suit;
    private int value;
    
    /**
     * Constructor for objects of class Card
     * 
     * @param   s       the suit of the card
     * @param   val     the value of the card
     */
    public Card(String s, int val)
    {
        suit = s;
        value = val;
    }
    
    /**
     * Returns the suit of the card
     * 
     * @return  the suit
     */
    public String getSuit()
    {
        return suit;
    }
    
    /**
     * Returns the value of the card
     * 
     * @return  the value
     */
    public int getValue()
    {
        return value;
    }
    
    /**
     * Returns the String that represents the card object
     * 
     * @return  string information of card
     */
    public String toString()
    {
        if(value == 1)
        {
            return "Ace of " + suit;
        }
        else if(value == 11)
        {
            return "Jack of " + suit;
        }
        else if(value == 12)
        {
            return "Queen of " + suit;
        }
        else if(value == 13)
        {
            return "King of " + suit;
        }
        return value + " of " + suit;
    }
}
