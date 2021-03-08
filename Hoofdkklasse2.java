
/**
 * class Hoofdkklasse2 - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie 1)
 */
import java.util.ArrayList;
public class Hoofdkklasse2
{
    public static void main(String[] args)
    {
        //maak een aantal wagens
        Wagen w1 = new Wagen(2380,"Volkswagen-Golf","1-AAA-111");
        Wagen w2 = new Wagen(80,"Volkswagen-Passat","1-YZP-678");
        Wagen w3 = new Wagen(380,"Volkswagen-Scoda","1-BRT-334");
        Wagen w4 = new Wagen(4000,"Volkswagen-Tiguan","1-RYZ-546");
        Wagen w5 = new Wagen(245,"Volkswagen-Polo","1-PTT-998");
        Wagen[] wagenTabel = {w1,w2,w3,w4,w5};
        //maak een aantal personeelsleden
        Personeelslid p1 = new Personeelslid("Johan Devos","17-12-1966",1999,Categorie.ADMIN,"1-AAA-111");
        Personeelslid p2 = new Personeelslid("Veerle Staes","8-2-1977",1992,Categorie.TOP,"1-RYZ-546");
        Personeelslid p3 = new Personeelslid("Charlotte Vannieuwenhove","1-3-1969",1997,Categorie.ADMIN,null);
        Personeelslid p4 = new Personeelslid("Anja Cortebeek","25-08-1991",2011,Categorie.ADMIN,"1-PTT-998");
        Personeelslid p5 = new Personeelslid("Fien Moerbeek","17-1-1981",2005,Categorie.RESEARCH,"1-YZP-678");
        Personeelslid p6 = new Personeelslid("Bart DeHaas","7-12-1968",1992,Categorie.MIDDEN,null);
        Personeelslid p7 = new Personeelslid("Jens Dewaele","22-5-1990",2010,Categorie.ADMIN,"1-BRT-334");
        Personeelslid[] personeelslidTabel = {p1,p2,p3,p4,p5,p6,p7};
        // voeg wagens en personeelsleden toe aan het adminstrator object
        Administrator admin = new Administrator();
        for(Wagen w : wagenTabel) admin.toevoegenWagen(w);
        for(Personeelslid p : personeelslidTabel) admin.toevoegenPersoneelslid(p);
        // laat wagens rijden en tanken
        w1.setKilometerStand(2700);
        w1.getankt(25.6);
        w1.setKilometerStand(3500);
        w1.getankt(64.8);
        w2.setKilometerStand(480);
        w2.getankt(20.6);
        w2.setKilometerStand(1210);
        w2.getankt(42.8);
        w2.setKilometerStand(1708);
        w2.getankt(27.6);
        w2.setKilometerStand(2300);
        w2.getankt(30.8);
        w3.setKilometerStand(690);
        w3.getankt(24.0);
        w3.setKilometerStand(1290);
        w3.getankt(51.8);
        w4.setKilometerStand(4300);
        w4.getankt(22.6);
        w4.setKilometerStand(4800);
        w4.getankt(34.8);
        w5.setKilometerStand(745);
        w5.getankt(24.6);
        w5.setKilometerStand(1345);
        w5.getankt(30.8);
        w5.setKilometerStand(1745);
        w5.getankt(22.6);
        w5.setKilometerStand(2345);
        w5.getankt(32.8);
        w5.setKilometerStand(3145);
        w5.getankt(44.2);
        // voer de methoden uit
        ArrayList<Personeelslid> lijst = new ArrayList<>();
        lijst = admin.lijstPersoneelInDienst(15);
        
        System.out.println("====Lijst van Personeelsleden langer in dienst dan 15 jaar====\n");
        for (Personeelslid pers : lijst) {
            System.out.println(pers);
        }
        
        ArrayList<Wagen> lijstWagens = new ArrayList<>();
        lijstWagens = admin.lijstWagensVerbruikMeer(8);
        
        System.out.println("====Lijst van Wagens die meer verbruiken dan 8 liter/100km====");
        for (Wagen wag : lijstWagens) {
            System.out.println(wag);
        }
    }   
}
