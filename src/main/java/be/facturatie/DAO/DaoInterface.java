/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.facturatie.DAO;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Brech
 */
public interface DaoInterface<E> {
    public void setDataSource(DataSource source);
    public List<E> getAll();
    public void put(E object);
    public void update(int id, E obj);
}
