
/**
 * PlaySol will contain the methods and information we need to run
 * a successful solitaire simulation.
 *
 * @author (Dante Paterna)
 * @version (3/15/2022)
 */
public class PlaySol
{
    private Deck deck;
    private SolPile pile1;
    private SolPile pile2;
    private SolPile pile3;
    private SolPile pile4;
    private SolPile pile5;
    private SolPile pile6;
    private SolPile pile7;
    
    /**
     * Intializes the deck and each pile used for the game.
     */
    public PlaySol()
    {
        deck = new Deck();
        pile1 = new SolPile();
        pile2 = new SolPile();
        pile3 = new SolPile();
        pile4 = new SolPile();
        pile5 = new SolPile();
        pile6 = new SolPile();
        pile7 = new SolPile();
    }
    
    /**
     * Runs a simulation of a solitaire game.
     */
    public void playGame()
    {
        SolPile piles[] = {pile1, pile2, pile3, pile4, pile5, pile6, pile7};
        for(int i = 0; i < 7; i++)
        {
            for(int j = i; j < 7; j++)
            {
                piles[j].addCard(deck.deal());
            }
        }
        for(int i = 0; i < 7; i++)
        {
            System.out.println(piles[i]);
        }
    }
}
