
/**
 * class Personeelslid - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie 1 )
 */

import java.util.Calendar;
public class Personeelslid
{
    private String naamenVoornaam;
    private String geboorteDatum;
    private int inDienst; //jaar van in dienst komen
    private Categorie cat; // categorie waartoe het personeelslid behoort
    private String nummerplaat;
    private int huidigJaar;
    private int leeftijd;
    private int geboorteJaar;
    private int dienstJaren;
    
    public Personeelslid(String nev, String geb, int inD, Categorie c, String nPlaat)
    {
        naamenVoornaam = nev;
        geboorteDatum = geb;
        inDienst = inD;
        cat = c;
        nummerplaat = nPlaat;
        huidigJaar = Calendar.getInstance().get(Calendar.YEAR);
    }
    
    public Categorie getCategorie()
    {
        return cat;
    }
    public String getNummerPlaat()
    {
        return nummerplaat;
    }
    
    public int bepaalLeeftijd()
    {
        
        leeftijd = huidigJaar - getGeboortejaar();
        return leeftijd;
    }
    
    private int getGeboortejaar()
    {
        String[] splitDatum = geboorteDatum.split("-");
        
        geboorteJaar = Integer.parseInt(splitDatum[2]);
        return geboorteJaar;
    }
    
    public int aantalDienstjaren()
    {
        dienstJaren = huidigJaar - inDienst;
        return dienstJaren;
    }
    
    public String toString() {
        String text = naamenVoornaam + "\n";
        text += "Leeftijd: " + bepaalLeeftijd() + "\n";
        text += "Behoort tot het " + "\n" ;
        if (getNummerPlaat() != null) {
            text += "en heeft een dienstwagen met nummerplaat: " + getNummerPlaat() + "\n" ; 
        } else {
            text += "heeft geen dienstwagen\n";
        }
        return text;
    }
}
