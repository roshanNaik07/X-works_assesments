package com.xworkz.intership.repository;

import com.xworkz.intership.constant.ClassLoaderEnum;
import com.xworkz.intership.dto.RegisterDto;

import java.sql.*;

public class RegisterRepositoryImpl implements RegisterRepository{



    @Override
    public String save(RegisterDto registerDto) {

        System.out.println("Running save in RegisterRepoImpl");

        try {
            //Loading the driver class
            Class.forName(ClassLoaderEnum.CLASS_NAME.getProp());
            Connection connection = DriverManager.getConnection(ClassLoaderEnum.URL.getProp(),ClassLoaderEnum.USERNAME.getProp(), ClassLoaderEnum.SECRET.getProp());

            //Preparing the statement
            String sql = "insert into intern_info values(?,?,?,?,?)";

            //We do pre-compilation
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,registerDto.getName());
            preparedStatement.setString(3,registerDto.getCourse());
            preparedStatement.setInt(4,registerDto.getFees());
            preparedStatement.setString(5,registerDto.getMode());

            //Execute the statement
            preparedStatement.executeUpdate();

            System.out.println("Connection built successfully");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "false";
    }



    @Override
    public RegisterDto getDetail(int id) {

        System.out.println("Running getDetail in Register Repository impl");

        try {
            //Loading the class
            Class.forName(ClassLoaderEnum.CLASS_NAME.getProp());
            Connection connection = DriverManager.getConnection(ClassLoaderEnum.URL.getProp(), ClassLoaderEnum.USERNAME.getProp(), ClassLoaderEnum.SECRET.getProp());

            //preparing the statement
            String sql = "select * from intern_info where id = ?";

            //pre-compilation of the sql statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            //executing the sql statement
            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Connection built successfully");

            while (resultSet.next()){

                int pk = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String course = resultSet.getString("course");
                int fees = resultSet.getInt("fees");
                String mode = resultSet.getString("mode");

                RegisterDto registerDto = new RegisterDto(name,course,fees,mode);
                registerDto.setPk(pk);
                return registerDto;

            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }



}
