package be.facturatie.DAO;

import org.springframework.stereotype.Component;

/**
 * @author Brech - 3-apr-2017
 */
@Component
public class daoSource{

    final String driver = "com.mysql.jdbc.Driver";
    final String database = "jdbc:mysql://localhost:3306/facturatie";
    final String user = "dhondt";
    final String password = "dhondt";
    
}
