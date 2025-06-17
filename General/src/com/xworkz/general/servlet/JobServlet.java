package com.xworkz.general.servlet;

import com.xworkz.general.dto.JobDTO;
import com.xworkz.general.service.JobService;
import com.xworkz.general.service.JobServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/job", loadOnStartup = 1)
public class JobServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String skill = req.getParameter("skill");
        String selectEducation = req.getParameter("selectEducation");
        String salary = req.getParameter("salary");
        String experience = req.getParameter("experience");
        int experienceInt=Integer.parseInt(experience);

        JobDTO jobDTO = new JobDTO(name, email, skill, selectEducation, salary, experienceInt);

        JobService jobService = new JobServiceImpl();
        jobService.validAndSave(jobDTO);


    }
}
