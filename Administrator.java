
/**
 * class Adminstrator - Met deze klasse kan je personeel en wagens beheren.
 * 
 * @author Ward Vercruyssen
 * @version versie 1.2
 */
import java.util.ArrayList;

public class Administrator
{
    private ArrayList<Personeelslid> personeel;
    private ArrayList<Wagen> wagens;
    
    
    /**
     * De constructor maakt nieuwe (veranderlijke collecties) van personeel en wagens.
     */
    public Administrator()
    {
        personeel = new ArrayList<>();
        wagens = new ArrayList<>();
    }
    
    /**
     * Hier kan je Personeelsleden toevoegen.
     * @param l een bestaand personeelslid
     */
    public void toevoegenPersoneelslid(Personeelslid l)
    {
       personeel.add(l);
    }
    
    /**
     * Hier kan je wagens toevoegen.
     * @param w een bestaande wagen
     */
    public void toevoegenWagen(Wagen w)
    {
        wagens.add(w);
    }
    
    /**
     * Retourneerd een collectie (ArrayList) van personeelsleden
     * die een minimim aantal jaar al in dienst zijn.
     * @param aj minimum aantal jaar
     */
    public ArrayList<Personeelslid> lijstPersoneelInDienst( int aj)
    {
       ArrayList<Personeelslid> pers = new ArrayList<>();
       
       for (Personeelslid a : personeel) {
           if (a.aantalDienstjaren() >= aj) {
               pers.add(a);
            } 
        }
        return pers;
    }
    
    /**
     * Geeft een collectie (ArrayList) weer van wagens die meer dan
     * een meegegeven verbuik, verbruiken.
     * @param atll verbruik waarmee vergeleken wordt
     */
    public ArrayList<Wagen> lijstWagensVerbruikMeer( double atll)
    {
        ArrayList<Wagen> waggie = new ArrayList<>();
        
        for (Wagen b : wagens) {
            if (b.verbruikper100Km() > atll) {
                waggie.add(b);
            }
        }
        return waggie;
    }
    
    /**
     * Retourneerd de (double) gemiddelde afstand van de wagens van
     * de personeelsleden met een bepaalde categorie.
     * @param c categorie van het personeelslid
     */
    public double gemiddeldAfgelegdeAfstandVanCategorie(Categorie c)
    {
        double gemiddeldeAfstand = 0.0;
        
        ArrayList<Personeelslid> persMetCat = new ArrayList<>();
        for (Personeelslid d : personeel) {
           if (d.getCategorie().equals(c)) {
               persMetCat.add(d);
            }
        }
        
        int counter = 0;
        double som = 0;
        //pers.getNummerplaat.equals(wag.getNummerplaat())
        for (Personeelslid e : persMetCat) {
            for (Wagen f : wagens) {
                
                if (e.getNummerPlaat().equals(f.getNummerplaat())) {
                    counter++;
                    som += (double) f.afgelegdeAfstand();
                }

            }
        }
        gemiddeldeAfstand = som / counter;
        
        return gemiddeldeAfstand;
   }
}
