package be.facturatie.DAO;

import be.facturatie.Debiteur.Debiteur;
import be.facturatie.instellingen.Instellingen;
import java.sql.ResultSet;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Brech - 2-apr-2017
 */
@Repository
public class InstellingenDao implements DaoInterface<Instellingen>{

    private JdbcTemplate jdbc;
    @Override
    public void setDataSource(DataSource source) {
        this.jdbc = new JdbcTemplate(source);
    }

    @Override
    public List<Instellingen> getAll() {
        return this.jdbc.query("SELECT * FROM `instellingen` Join debiteur d on debitorid = d.id ", (ResultSet rs, int i) -> {
            Instellingen conf = new Instellingen();
            conf.setCurrentFactuurNumber(rs.getInt("currentNumber"));
            Debiteur deb = new Debiteur();
            deb.setId(rs.getInt("id"));
            deb.setBedrijfsnaam(rs.getString("companyname"));
            deb.setBedrijfsnaam(rs.getString("owner"));
            deb.setBedrijfsnaam(rs.getString("btwnr"));
            deb.setBedrijfsnaam(rs.getString("email"));
            deb.setBedrijfsnaam(rs.getString("phone"));
            deb.setStreet(rs.getString("street"));
            deb.setNumber(rs.getInt("housenumber"));
            deb.setZipcode(rs.getInt("postcode"));
            deb.setCity(rs.getString("city"));
            conf.setDebitor(deb);
            conf.setInvoiceSavePath(rs.getString("saveFile"));
            return conf;
        });
    }

    @Override
    public void put(Instellingen object) {
        throw new UnsupportedOperationException("Not supported. Only 1 config shall exist"); 
    }

    @Override
    public void update(int id, Instellingen obj) {
        this.jdbc.update("update instellingen set debitorid = ?, currentnumber = ?, savefile = ?",
                obj.getDebitor(), obj.getCurrentFactuurNumber(), obj.getInvoiceSavePath());
    }

    
}
