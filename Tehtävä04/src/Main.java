public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClockTimer kello = new ClockTimer();
        DigitalClock digikello = new DigitalClock(kello);
        
        kello.asetaTunti(5);
        kello.asetaminuutti(30);
        kello.asetaSekunti(25);
        
        digikello.aloita(kello);

    }
    
}
