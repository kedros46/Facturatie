package be.facturatie.instellingen;

import be.facturatie.Debiteur.Debiteur;
import org.springframework.stereotype.Component;

/**
 * @author Brech
 */
@Component
public class Instellingen {
    private int currentFactuurNumber;
    private Debiteur debitor;
    private String invoiceSavePath;

    //<editor-fold desc="getters/setters"> 
    public int getCurrentFactuurNumber() {
        return currentFactuurNumber;
    }

    public void setCurrentFactuurNumber(int currentFactuurNumber) {
        this.currentFactuurNumber = currentFactuurNumber;
    }

    public Debiteur getDebitor() {
        return debitor;
    }

    public void setDebitor(Debiteur debitor) {
        this.debitor = debitor;
    }

    public String getInvoiceSavePath() {
        return invoiceSavePath;
    }

    public void setInvoiceSavePath(String invoiceSavePath) {
        this.invoiceSavePath = invoiceSavePath;
    }
    //</editor-fold>
    
}
