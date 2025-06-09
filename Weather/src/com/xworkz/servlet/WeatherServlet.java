package com.xworkz.servlet;

import com.xworkz.dto.WeatherDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/weather", loadOnStartup = 1)

public class WeatherServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String location = servletRequest.getParameter("locationName");
        String captured = servletRequest.getParameter("capturedName");
        String temperature = servletRequest.getParameter("temperatureName");
        String recorded = servletRequest.getParameter("recordedName");

        WeatherDTO weatherDTO = new WeatherDTO();
        weatherDTO.setLocation(location);
        weatherDTO.setCaptured(captured);
        weatherDTO.setTemperature(Integer.parseInt(temperature));
        if (recorded != null && !recorded.isEmpty()) {
            weatherDTO.setRecorded(LocalDate.parse(recorded));  // Assumes format yyyy-MM-dd
        } else {
            System.out.println("Recorded date is missing");
        }

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("weatherResult.jsp");
        servletRequest.setAttribute("weatherDTO", weatherDTO);
        requestDispatcher.forward(servletRequest, servletResponse);

    }
}
