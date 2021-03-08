

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * test class PersoneelslidTest - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class PersoneelslidTest
{
    private Personeelslid personee1;

    /**
     * Constructor voor test class PersoneelslidTest
     */
    public PersoneelslidTest()
    {
    }

    /**
     * Opzetten van de test fixture.
     *
     * Aanroep voor elke test case method.
     */
    @Before
    public void setUp()
    {
        personee1 = new Personeelslid("Ward Vercruyssen", "19-03-1994", 2018, Categorie.TOP, "1TSE253");
    }

    /**
     * Verwijderen van de test fixture.
     *
     * Aanroep na elke test case method.
     */
    @After
    public void tearDown()
    {
    }
}
