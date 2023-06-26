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
package com.example.study_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.study_servlets.controls.commons.Commons;

public class OptionInforsDao {

    public int InsertWithUniqueID(String insert_id) {
        int count = 0;
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
             
            String query = "INSERT INTO option_infors(OPTION_INFOR_ID, OPTION_NAME)\n" + //
                    "VALUES('', '');";
            
            count = statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public int DeleteWithUniqueID(String unique_id) {
        int count = 0;
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "DELETE FROM option_infors\n" + //
                    "WHERE OPTION_INFOR_ID = '" + unique_id + "';";
            count = statement.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public ArrayList SelectwithSearch(String search) {
        ArrayList optionInforList = new ArrayList<>();
        try {
            if (search == null) {
                search = "";
            }
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT *\n" + //
                    "FROM option_infors\n" + //
                    "WHERE OPTION_NAME like '" + search + "%';";
            ResultSet resultSet = statement.executeQuery(query);

            HashMap optionInforRecord = new HashMap<>();

            while (resultSet.next()) {

                // HashMap의 Key와 Value 입력
                optionInforRecord = new HashMap<>();
                optionInforRecord.put("OPTION_INFOR_ID", resultSet.getString("OPTION_INFOR_ID"));
                optionInforRecord.put("OPTION_NAME", resultSet.getString("OPTION_NAME"));

                // ArrayList에 HashMap을 Row로 각각 입력
                optionInforList.add(optionInforRecord);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return optionInforList;
    }
}
