package be.facturatie.DAO;

import be.facturatie.Factuur.Factuur;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Brech - 2-apr-2017
 */
@Repository
public class FacturenDao implements DaoInterface<Factuur>{

    private JdbcTemplate jdbc;
    
    @Autowired
    @Override
    public void setDataSource(DataSource source){
        this.jdbc = new JdbcTemplate(source);  
    }

    @Override
    public List<Factuur> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void put(Factuur factuur) {
        this.jdbc.update("insert into facturen('debitorid, debiteurid, startdatum, btw') Values(?, ?, ?, ?)", 
                factuur.getDebitor().getId(), factuur.getDebiteur().getId(), factuur.getStartdate(), factuur.getBtw());
    }

    @Override
    public void update(int id, Factuur f) {
        this.jdbc.update("update facturen set debiteurid = ?, startdatum = ?, btw = ? where id = ?",
        f.getDebiteur().getId(), f.getStartdate(), f.getBtw() , id);
    }

    
}
