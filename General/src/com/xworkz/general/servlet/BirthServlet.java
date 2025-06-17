package com.xworkz.general.servlet;

import com.xworkz.general.dto.BirthDTO;
import com.xworkz.general.service.BirthService;
import com.xworkz.general.service.BirthServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/birth", loadOnStartup = 1)
public class BirthServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String birthId = req.getParameter("birthId");
        String hospitalName = req.getParameter("hospitalName");
        String fatherName = req.getParameter("father");
        String motherName = req.getParameter("mother");
        String date = req.getParameter("date");
        String doctorName = req.getParameter("doctor");
        String nurse = req.getParameter("nurse");
        String hospitalType = req.getParameter("hospitalType");

        LocalDate birthDate = LocalDate.parse(date);

        BirthDTO birthDTO = new BirthDTO(birthId, hospitalName, fatherName, motherName, birthDate, doctorName, nurse, hospitalType);

        BirthService birthService = new BirthServiceImpl();
        birthService.validAndSave(birthDTO);
    }
}
