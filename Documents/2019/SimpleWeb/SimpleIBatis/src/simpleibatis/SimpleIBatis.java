/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleibatis;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.justin.bean.Dosen;
import com.justin.config.SqlMapConfig;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jasmanpardede
 */
public class SimpleIBatis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dsn = new Dosen();
        dsn.setNid("171819");
        dsn.setNama("Ibatius Update");
        dsn.setKeahlian("Database Prog");
        dsn.setAlamat("Bandung no.5");
        
        /* This would delete one record in Employee table. */
        System.out.println("Going to delete record.....");
        String nid = "171819";

        SqlMapClient sqlMapClient = SqlMapConfig.getSqlMap();
        try {
            //sqlMapClient.insert("dosen.insertDosen", dsn);
            
            //sqlMapClient.delete("dosen.deleteDosen", dsn);
            //System.out.println("Record deleted Successfully ");
            
            sqlMapClient.delete("dosen.updateDosen", dsn);
            //System.out.println("Record Updated Successfully ");
      
            System.out.println("Success");
        } catch (SQLException ex) {
            Logger.getLogger(SimpleIBatis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
