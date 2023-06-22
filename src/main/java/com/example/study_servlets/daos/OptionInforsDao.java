package com.example.study_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.study_servlets.controlls.commons.Common;

public class OptionInforsDao {
    public int DeletewithUniqueID(String unique_id){
        try {
            Common common = new Common();
            Statement statement = common.getStatement(); // Editor in Workbench
            String query = "delete from option_infors\n" + //
                    "where OPTION_INFOR_ID = '"+unique_id+"';";
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return 0;
    }

    public ArrayList SelectWithSearch(String search) {
        ArrayList optionInforList = new ArrayList<>();
        try {
            if(search == null){
                search = "";

            }
            Common common = new Common();
            Statement statement = common.getStatement(); // Editor in Workbench
            String query = "SELECT *\n" + //
                    "FROM option_infors\n" + //
                    "WHERE OPTION_NAME like '"+search+"%';";
            ResultSet resultSet = statement.executeQuery(query);

            HashMap optionInforRecord = new HashMap<>();
            while (resultSet.next()) {
                optionInforRecord = new HashMap<>();
                optionInforRecord.put("OPTION_INFOR_ID", resultSet.getString("OPTION_INFOR_ID"));
                optionInforRecord.put("OPTION_NAME", resultSet.getString("OPTION_NAME"));
                
                optionInforList.add(optionInforRecord);
                resultSet.getString("OPTION_INFOR_ID");
                resultSet.getString("OPTION_NAME");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return optionInforList;
    }
}
