package com.xworkz.scholarship.repository;

import com.xworkz.scholarship.constant.ClassLoaderEnum;
import com.xworkz.scholarship.dto.ScholarshipDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProfileRepositoryImpl implements ProfileRepository{
    @Override
    public List<ScholarshipDTO> getDetails() {

        System.out.println("Running getDetails in ProfileRepoImpl");

        List<ScholarshipDTO> signUpList = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(ClassLoaderEnum.URL.getProp(),ClassLoaderEnum.USERNAME.getProp(),ClassLoaderEnum.SECRET.getProp());

            String noConcatSql = "SELECT * FROM sign_up_info";

            PreparedStatement preparedStatement = connection.prepareStatement(noConcatSql);

            ResultSet resultSet = preparedStatement.executeQuery();



            while (resultSet.next()){

                String userName = resultSet.getString("username");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");


                signUpList.add(new ScholarshipDTO(userName,email,password,password));

            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return signUpList;
    }
}
