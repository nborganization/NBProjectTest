/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleibatis;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.justin.bean.Mahasiswa;
import java.io.*;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jasmanpardede
 */
public class MainMahasiswa {
    public static void main(String[] args) throws IOException, SQLException{
        Reader rd = Resources.getResourceAsReader("sqlmapconfig.xml");
        SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

        /* This would read all records from the Employee table. */
        System.out.println("Going to read records.....");
        List <Mahasiswa> ems = (List<Mahasiswa>)
         smc.queryForList("Mahasiswa.getAll", null);
        Mahasiswa em = null;

        for (Mahasiswa e : ems) {
            System.out.print("  " + e.getNim());
            System.out.print("  " + e.getNama());
            System.out.print("  " + e.getAlamat());
            System.out.print("  " + e.getUmur());
            em = e; 
            System.out.println("");
        }    

        System.out.println("Records Read Successfully ");
    }
    
}
