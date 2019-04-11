/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.justin.config;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author jasmanpardede
 */
public class SqlMapConfig {
    protected static final SqlMapClient sqlMap;
 
    static {
        try {
            Reader reader = Resources.getResourceAsReader("com/justin/sqlmap/sqlmapconfig.xml");
            sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
        } catch (IOException e) {
            throw new RuntimeException("Fatal Error, ga dapet sqlmapconfignya.  Cause: " + e, e);
        } catch (Exception e){
            throw new RuntimeException("Fatal Error.  Cause: " + e, e);
        }
    }
 
    public static SqlMapClient getSqlMap() {
        return sqlMap;
    }
}
