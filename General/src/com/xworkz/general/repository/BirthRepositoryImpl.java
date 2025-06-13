package com.xworkz.general.repository;

import com.xworkz.general.dto.BirthDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BirthRepositoryImpl implements BirthRepository {

    @Override
    public String save(BirthDTO birthDTO) {
    System.out.println("Running save in BirthRepositoryImpl");

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
