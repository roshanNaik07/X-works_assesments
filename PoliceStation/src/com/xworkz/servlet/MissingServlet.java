package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/missing" , loadOnStartup = 1)
public class MissingServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        String mobile = servletRequest.getParameter("mobile");
        String age = servletRequest.getParameter("age");
        String address =servletRequest.getParameter("address");
        String location = servletRequest.getParameter("location");
        String marks = servletRequest.getParameter("marks");
        String gender = servletRequest.getParameter("gender");
        String lang = servletRequest.getParameter("lang");

        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("missingResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
        servletRequest.setAttribute("name", name);
        servletRequest.setAttribute("mobile", mobile);
        servletRequest.setAttribute("age", age);
        servletRequest.setAttribute("address", address);
        servletRequest.setAttribute("location", location);
        servletRequest.setAttribute("marks", marks);
        servletRequest.setAttribute("gender",gender);
        servletRequest.setAttribute("lang", lang);
    }
}
