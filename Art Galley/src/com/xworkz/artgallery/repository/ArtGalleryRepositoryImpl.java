package com.xworkz.artgallery.repository;

import com.xworkz.artgallery.dto.ArtGalleryDTO;

import java.sql.*;

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

    @Override
    public ArtGalleryDTO getDetails(int id) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/artgallery";
            String username="root";
            String password = "Xworkzodc@123";

            Connection connection = DriverManager.getConnection(url,username,password);
            String sql = "SELECT * FROM register_form where id = ("+id+")" ;
            Statement statement = connection.createStatement();
            ResultSet resultSet =  statement.executeQuery(sql);

            while (resultSet.next()){

                int pk = resultSet.getInt("id");
                String artist = resultSet.getString("artist");
                String title = resultSet.getString("title");
                String artType = resultSet.getString("artType");
                int price = resultSet.getInt("price");
                String size = resultSet.getString("size");
                String medium = resultSet.getString("medium");
                String email = resultSet.getString("email");
                String mode = resultSet.getString("mode");

                ArtGalleryDTO artGalleryDTO = new ArtGalleryDTO(artist,title,artType,price,size,medium,email,mode);
                artGalleryDTO.setPk(pk);

                return artGalleryDTO;
            }

        } catch (ClassNotFoundException |SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
