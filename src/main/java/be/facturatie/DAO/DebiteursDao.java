package be.facturatie.DAO;

import be.facturatie.Debiteur.Debiteur;
import java.sql.ResultSet;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Brech - 2-apr-2017
 */
@Repository
public class DebiteursDao implements DaoInterface<Debiteur>{

    private JdbcTemplate jdbc;
    
    @Autowired
    @Override
    public void setDataSource(DataSource source) {
        this.jdbc = new JdbcTemplate(source);
    }

    @Override
    public List<Debiteur> getAll() {
        return this.jdbc.query("select * from debiteurs", (ResultSet rs, int i) -> {
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
            return deb;
        });
    }

    @Override
    public void put(Debiteur deb) {
        this.jdbc.update("insert into debiteur('company, owner, btwnr, street,"
                + " number, zipcode, city, email, phone')"
                + " Values(?, ?, ?, ?, ?, ?, ?, ?, ?)", 
                deb.getCompany(), deb.getOwner(), deb.getBtwnr(), deb.getStreet(),
                deb.getNumber(), deb.getZipcode(), deb.getCity(), deb.getEmail(), deb.getPhone());
    }

    @Override
    public void update(int id, Debiteur deb) {
        this.jdbc.update("update debiteur set company = ?, owner = ?, btwnr = ?, "
                + " street = ?, number = ?, zipcode = ?, city = ?, email = ?, phone = ?"
                + " where id = ?", 
                deb.getCompany(), deb.getOwner(), deb.getBtwnr(),  deb.getStreet(),
                deb.getNumber(), deb.getZipcode(), deb.getCity(), deb.getEmail(), 
                deb.getPhone(), id);
    }

    
}
