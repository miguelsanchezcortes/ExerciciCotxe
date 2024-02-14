package Exercici2.Cotxe.src;
import org.cotxe.model.Cotxe;

public class App {
    public static void main(String[] args) {
        Cotxe cotxe = new Cotxe();
        cotxe.getMatricula();
        cotxe.getId();
        cotxe.getSeients();
        cotxe.getCombustible();
        cotxe.getFinestra();
        cotxe.getVolant();
        cotxe.getPedals();
        cotxe.getRodes();

        Pedal p = cotxe.getPedals();
        Fre f = (Fre) p;
        f.trepitxar();
        System.out.println(cotxe);
    }
}
