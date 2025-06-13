package com.xworkz.general.repository;

import com.xworkz.general.dto.JobDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JobRepositoryImpl implements JobRepository {

    @Override
    public String save(JobDTO jobDTO) {
        System.out.println("Running save in JobRepositoryImpl");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/general";
            String username = "root";
            String password = "Xworkzodc@123";
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return "false";
    }
}
