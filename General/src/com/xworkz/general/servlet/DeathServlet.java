package com.xworkz.general.servlet;

import com.xworkz.general.dto.DeathDTO;
import com.xworkz.general.service.DeathService;
import com.xworkz.general.service.DeathServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import static java.nio.file.Files.setAttribute;

@WebServlet(urlPatterns = "/death", loadOnStartup = 1)
public class DeathServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String cause = req.getParameter("cause");
        String date = req.getParameter("date");
        String time = req.getParameter("time");
        String age = req.getParameter("age");
        String certifiedBy = req.getParameter("certifiedBy");
        String hospitalName = req.getParameter("hospitalName");
        String mannerOfDeath = req.getParameter("mannerOfDeath");
        String gender= req.getParameter("gender");
        String marks = req.getParameter("marks");


        LocalDate newDate = LocalDate.parse(date); // Assuming date is in the format yyyy-MM-dd
        int newAge = Integer.parseInt(age);


        DeathDTO deathDTO = new DeathDTO(name,cause,newDate,time,newAge,certifiedBy,hospitalName,mannerOfDeath,gender,marks);

        DeathService deathService = new DeathServiceImpl();
        deathService.validateAndSave(deathDTO);
    }
}
