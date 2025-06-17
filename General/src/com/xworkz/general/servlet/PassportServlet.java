package com.xworkz.general.servlet;

import com.xworkz.general.dto.PassportDTO;
import com.xworkz.general.service.PassportService;
import com.xworkz.general.service.PassportServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/passport", loadOnStartup = 1)
public class PassportServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String applicantName = req.getParameter("applicantName");
        String adar = req.getParameter("adar");
        String address = req.getParameter("address");
        String panNo = req.getParameter("panNo");
        String country = req.getParameter("country");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        String passportType = req.getParameter("passportType");
        String refNum = req.getParameter("refNum");

        long newAdar = Long.parseLong(adar);
        long newPanNo = Long.parseLong(panNo);
        long refNumber = Long.parseLong(refNum);

        PassportDTO passportDTO = new PassportDTO(applicantName, newAdar, address, newPanNo, country, state, city, passportType, refNumber);

        PassportService passportService = new PassportServiceImpl();
        passportService.validateAndSave(passportDTO);

    }
}
