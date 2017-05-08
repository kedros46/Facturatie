
package be.facturatie.Factuur;

import be.facturatie.Debiteur.Debiteur;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Brech
 */
@Component
public class Factuur {
    private Debiteur debitor;
    private Debiteur debiteur;
    private Date startdate;
    private int factuurNumber;
    private int btw;
    private List<Item> items;
    
    
    //<editor-fold desc="getters/setters">
    public Debiteur getDebitor() {
        return debitor;
    }

    public void setDebitor(Debiteur debitor) {
        this.debitor = debitor;
    }

    public Debiteur getDebiteur() {
        return debiteur;
    }

    public void setDebiteur(Debiteur debiteur) {
        this.debiteur = debiteur;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public int getFactuurNumber() {
        return factuurNumber;
    }

    public void setFactuurNumber(int factuurNumber) {
        this.factuurNumber = factuurNumber;
    }

    public int getBtw() {
        return btw;
    }

    public void setBtw(int btw) {
        this.btw = btw;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    //</editor-fold>
}
