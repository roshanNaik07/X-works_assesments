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
                break;

            case "Password not matching":
                req.setAttribute("resultPassword", result);
                break;

            case "Data saved successfully":
                req.setAttribute("saved", result);
                break;
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("SignUp.jsp");
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String formUsername = req.getParameter("userId");
        String formPassword = req.getParameter("password");

        System.out.println(formPassword);
        System.out.println(formUsername);
        ScholarshipService scholarshipService = new ScholarshipServiceImpl();
        String result = scholarshipService.validate(formUsername,formPassword);

        System.out.println(result);
    }
}
