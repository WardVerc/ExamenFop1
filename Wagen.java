
/**
 * class Wagen - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie 1)
 */

public class Wagen
{
    private int kilometerJaarbegin; //kilometerstand bij het jaarbegin
    private int kilometerstand;     // huidige kilometerstand
    private double aantalLiter;     // aantal liter tot dusver getankt
    private String typeWagen;
    private String nummerplaat;
    private double verbruik;
    
    public Wagen(int kjb,String type, String np)
    {
        kilometerJaarbegin = kjb;
        kilometerstand = kjb; 
        aantalLiter = 0;
        typeWagen = type;
        nummerplaat = np;
    }
    
    public void setKilometerStand(int k)
    {
        kilometerstand = k;
    }
    
    public String getNummerplaat()
    {
        return nummerplaat;
    }
    
    public int afgelegdeAfstand()
    {
       return kilometerstand-kilometerJaarbegin;
    }
    
    
    public double verbruikper100Km()
    {
        verbruik = (double) (aantalLiter/afgelegdeAfstand()) * 100;
        return verbruik;
    }
    
    public double getankt( double al)
    {
        aantalLiter += al;
        return aantalLiter;
    }
    
    public String toString() {
        String text = typeWagen + "\t" 
        + getNummerplaat() + "\t"
        + "Reeds verbruikt: " + aantalLiter + "\t"
        + "Afgelegde afstand: " + afgelegdeAfstand() + "\n";
        return text;
    }
}
