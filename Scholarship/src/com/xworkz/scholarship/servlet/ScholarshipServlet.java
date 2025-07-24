package com.xworkz.scholarship.servlet;

import com.xworkz.scholarship.dto.ScholarshipDTO;
import com.xworkz.scholarship.service.ScholarshipService;
import com.xworkz.scholarship.service.ScholarshipServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signUp", loadOnStartup = 1)
public class ScholarshipServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId = req.getParameter("userId");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        ScholarshipDTO scholarshipDTO = new ScholarshipDTO(userId, email, password, confirmPassword);

        ScholarshipService scholarshipService = new ScholarshipServiceImpl();
        String result = scholarshipService.validAndSave(scholarshipDTO);

        req.setAttribute("username", scholarshipDTO.getUsername());
        req.setAttribute("email", scholarshipDTO.getEmail());
        req.setAttribute("password", scholarshipDTO.getPassword());
        req.setAttribute("confirmPassword", scholarshipDTO.getConfirmPassword());


        switch (result) {
            case "UserName should be between 4 to 20 characters":
                req.setAttribute("resultUsername", result);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("SignUp.jsp");
                requestDispatcher.forward(req, resp);
                break;

            case "Password not matching":
                req.setAttribute("resultPassword", result);
                RequestDispatcher requestDispatcher1 = req.getRequestDispatcher("SignUp.jsp");
                requestDispatcher1.forward(req, resp);
                break;

            case "Data saved successfully":
                req.setAttribute("saved", result);
                RequestDispatcher requestDispatcher2 = req.getRequestDispatcher("SignIn.jsp");
                requestDispatcher2.forward(req, resp);
                break;
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String formUsername = req.getParameter("userId");
        String formPassword = req.getParameter("password");

        System.out.println(formPassword);
        System.out.println(formUsername);
        ScholarshipService scholarshipService = new ScholarshipServiceImpl();
        String result = scholarshipService.validate(formUsername, formPassword);


        switch (result) {
            case "Login Successfully !":
                req.setAttribute("Successful",result);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("Schemes.jsp");
                requestDispatcher.forward(req,resp);
                break;
            case "invalid username and password":
                req.setAttribute("failed",result);
                RequestDispatcher requestDispatcher1 = req.getRequestDispatcher("SignIn.jsp");
                requestDispatcher1.forward(req,resp);
                break;
        }
    }
}
