package com.xworkz.scholarship.repository;

import com.xworkz.scholarship.constant.ClassLoaderEnum;
import com.xworkz.scholarship.dto.ScholarshipDTO;

import java.sql.*;

public class ScholarshipRepositoryImpl implements ScholarshipRepository {

    @Override
    public String save(ScholarshipDTO scholarshipDTO) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(ClassLoaderEnum.URL.getProp(),ClassLoaderEnum.USERNAME.getProp(),ClassLoaderEnum.SECRET.getProp());

            String noConcatSql = "insert into sign_up_info values (?,?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(noConcatSql);

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());

            preparedStatement.setInt(1,0);
            preparedStatement.setString(2, scholarshipDTO.getUsername());
            preparedStatement.setString(3,scholarshipDTO.getEmail());
            preparedStatement.setString(4,scholarshipDTO.getPassword());
            preparedStatement.setTimestamp(5,timestamp);

            preparedStatement.executeUpdate();
            System.out.println("Connection built successfully");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "null";
    }
}
