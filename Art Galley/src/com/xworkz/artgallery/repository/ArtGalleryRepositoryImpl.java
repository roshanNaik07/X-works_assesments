package com.xworkz.artgallery.repository;

import com.xworkz.artgallery.dto.ArtGalleryDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import static java.lang.Class.forName;

public class ArtGalleryRepositoryImpl implements ArtGalleryRepository{

    @Override
    public String save(ArtGalleryDTO artGalleryDTO) {
    System.out.println("Running save in ArtGalleryRepositoryImpl");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/artgallery";
            String username = "root";
            String password = "Xworkzodc@123";

            Connection connection = DriverManager.getConnection(url, username, password);

            String sql = "insert into register_form values(0,'"+artGalleryDTO.getArtist()+"','"+artGalleryDTO.getTitle()+"','"+artGalleryDTO.getArtType()+"',"+artGalleryDTO.getPrice()+",'"+artGalleryDTO.getSize()+"','"+artGalleryDTO.getMedium()+"','"+artGalleryDTO.getEmail()+"','"+artGalleryDTO.getMode()+"')";
            System.out.println("building statement");
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Connection established successfully: " + connection);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "false";
    }
}
