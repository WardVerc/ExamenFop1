

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * test class WagenTest - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class WagenTest
{
    private Wagen wagen1;

    

    

    /**
     * Constructor voor test class WagenTest
     */
    public WagenTest()
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
        wagen1 = new Wagen(20000, "Volkswagen Golf GTI", "1WPO654");
        wagen1.setKilometerStand(25000);
        wagen1.getankt(500);
        wagen1.verbruikper100Km();
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

    @Test
    public void testVerbruik()
    {
        assertEquals(10, wagen1.verbruikper100Km(), 0.1);
    }
}

