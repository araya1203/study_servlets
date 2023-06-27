package com.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.study_servlets.controlls.commons.Common;

public class FactorysDao {
    public ArrayList selectALL() {
        ArrayList arrayList = new ArrayList();
        try {
            String query = "SELECT COMPANY, COMPANY_ID\n" + //
                "FROM factorys";
        Common commons = new Common();
        Statement statement = commons.getStatement();
        ResultSet resultset = statement.executeQuery(query);
       

        while (resultset.next()) {
            HashMap hashMap = new HashMap(); 
            hashMap.put("COMPANY_ID", resultset.getString("COMPANY_ID"));
            hashMap.put("COMPANY", resultset.getString("COMPANY"));
            arrayList.add(hashMap);
        }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
        return arrayList;
        
    }
}