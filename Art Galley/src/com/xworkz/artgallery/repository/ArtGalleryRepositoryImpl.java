package com.xworkz.artgallery.repository;

import com.xworkz.artgallery.constants.ClassLoaderEnum;
import com.xworkz.artgallery.dto.ArtGalleryDTO;

import java.sql.*;

import static java.lang.Class.forName;

public class ArtGalleryRepositoryImpl implements ArtGalleryRepository{

    @Override
    public String save(ArtGalleryDTO artGalleryDTO) {
    System.out.println("Running save in ArtGalleryRepositoryImpl");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(ClassLoaderEnum.URL.getProp(),ClassLoaderEnum.USERNAME.getProp(),ClassLoaderEnum.SECRET.getProp());

            String noConcatSql = "insert into register_form values(?,?,?,?,?,?,?,?,?) ";

            PreparedStatement preparedStatement = connection.prepareStatement(noConcatSql);

            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,artGalleryDTO.getArtist());
            preparedStatement.setString(3,artGalleryDTO.getTitle());
            preparedStatement.setString(4,artGalleryDTO.getArtType());
            preparedStatement.setInt(5,artGalleryDTO.getPrice());
            preparedStatement.setString(6,artGalleryDTO.getSize());
            preparedStatement.setString(7,artGalleryDTO.getMedium());
            preparedStatement.setString(8, artGalleryDTO.getEmail());
            preparedStatement.setString(9,artGalleryDTO.getMode());

            preparedStatement.executeUpdate();

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

            Connection connection = DriverManager.getConnection(ClassLoaderEnum.URL.getProp(),ClassLoaderEnum.USERNAME.getProp(),ClassLoaderEnum.SECRET.getProp());
            String sql = "SELECT * FROM register_form where id = ? " ;

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,id);

            ResultSet resultSet =  preparedStatement.executeQuery();

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
