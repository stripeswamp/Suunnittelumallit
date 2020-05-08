/**
 *
 * @author stripeswamp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Tämä on vikkelän myyjän PC-hinnoitteluohjelma, hinnat annetaan lennossa ja asiakas voi tinkiä matkan varrella
        // otetaan ensin kotelo
        Kotelo PC = new Kotelo(350);
        
        //lisätään koteloon virtalähde
        PC.lisääOsa(new Virtalähde(50));
        
        // otetaan emolevy ja lisätään siihen osia
        Emolevy emo = new Emolevy(120);
        emo.lisääOsa(new Muistipiiri(105));
        emo.lisääOsa(new Näytönohjain(330));
        emo.lisääOsa(new Prosessori(250));
        emo.lisääOsa(new Verkkokortti(110));
        
        // lisätään lopuksi juuri kasattu emolevy osaksi koteloa
        PC.lisääOsa(emo);
        
        // kysytään vielä lopuksi mikä on kokonaisuuden hinta
        System.out.println("Hinnaksi tuli " + PC.getHinta());
    }
    
}
