package com.xworkz.intership.servlet;

import com.xworkz.intership.dto.RegisterDto;
import com.xworkz.intership.service.RegisterService;
import com.xworkz.intership.service.RegisterServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register" , loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Running doPost method in Register Servlet");

        String name = req.getParameter("name");
        String course = req.getParameter("course");
        String fees = req.getParameter("fees");
        String mode = req.getParameter("radioDefault");
        int convertedFees = Integer.parseInt(fees);

        RegisterDto registerDto = new RegisterDto(name,course,convertedFees,mode);

        RegisterService registerService = new RegisterServiceImpl();
        registerService.ValidateAndSave(registerDto);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Running doGet in Register Servlet");

        String id = req.getParameter("id");
        int convertedID = Integer.parseInt(id);

        RegisterService registerService = new RegisterServiceImpl();
        RegisterDto registerDto = registerService.getById(convertedID);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("StudentDetails.jsp");
        req.setAttribute("result",registerDto);
        requestDispatcher.forward(req,resp);

    }
}
