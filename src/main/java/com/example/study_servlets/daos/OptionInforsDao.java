package com.example.study_servlets.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.study_servlets.controls.commons.Commons;

public class OptionInforsDao {
    public ArrayList SelectwithSearch(String search) {
        ArrayList optionInforList = new ArrayList<>();
        try {
            if(search == null){
                search = "";
            }
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT *\n" + //
                    "FROM option_infors\n" + //
                    "WHERE OPTION_NAME like '"+search+"%';";
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
