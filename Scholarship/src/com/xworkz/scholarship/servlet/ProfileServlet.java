package com.xworkz.scholarship.servlet;

import com.xworkz.scholarship.dto.ScholarshipDTO;
import com.xworkz.scholarship.service.ProfileService;
import com.xworkz.scholarship.service.ProfileServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/retrieve" , loadOnStartup = 1)
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Running doGet method in ProfileServlet");

        ProfileService profileService = new ProfileServiceImpl();
        List<ScholarshipDTO> list = profileService.getSignUpDetails();

        req.setAttribute("list",list);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("result.jsp");
        requestDispatcher.forward(req,resp);

    }
}
