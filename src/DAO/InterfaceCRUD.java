/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author l_dsb
 * @param <G>
 */
public interface InterfaceCRUD<G> {
    
    public boolean insertIntoDB(G generic);
    public boolean alterIntoDB(G generic);
    public boolean deleteFromDB(G generic);
    public List<G> listIntoDB();
    public List<G> searchIntoDB(String T);
    
}
