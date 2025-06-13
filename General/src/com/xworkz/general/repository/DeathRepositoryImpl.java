package com.xworkz.general.repository;

import com.xworkz.general.dto.DeathDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeathRepositoryImpl implements DeathRepository {


    @Override
    public String save(DeathDTO deathDTO) {
        System.out.println("Running save in DeathRepositoryImpl");

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
