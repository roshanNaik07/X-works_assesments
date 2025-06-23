package com.xworkz.artgallery.servlet;

import com.xworkz.artgallery.dto.ArtGalleryDTO;
import com.xworkz.artgallery.service.ArtGalleryService;
import com.xworkz.artgallery.service.ArtGalleryServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static javafx.scene.input.KeyCode.R;

@WebServlet (urlPatterns = "/exhibit" , loadOnStartup = 1)
public class ArtGalleryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost in ArtGalleryServlet");
        String artist = req.getParameter("artist");
        String title = req.getParameter("title");
        String artType = req.getParameter("artType");
        String price = req.getParameter("price");
        String size = req.getParameter("size");
        String medium = req.getParameter("medium");
        String email = req.getParameter("email");
        String mode = req.getParameter("btnradio");

        int newPrice = Integer.parseInt(price);

        ArtGalleryDTO artGalleryDTO = new ArtGalleryDTO(artist, title, artType, newPrice, size, medium, email, mode);

        ArtGalleryService artGalleryService = new ArtGalleryServiceImpl();
        String result = artGalleryService.validAndSave(artGalleryDTO);

        System.out.println("Result is : "+ result);

        if(!result.equals("Data saved succefully")){
            req.setAttribute("dto",artGalleryDTO);
            req.setAttribute("errorMessage",result);
        }else {
            req.setAttribute("message",result);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("ExhibitionForm.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Running doGet in ArtGalleryServlet");

        String id = req.getParameter("artistId");
        int newId = Integer.parseInt(id);

        System.out.println("converted id is : "+newId);

        ArtGalleryService artGalleryService = new ArtGalleryServiceImpl();
        ArtGalleryDTO artGalleryDTO = artGalleryService.getById(newId);

        if (artGalleryDTO==null){
            String result = "Id not found , please check again";
            req.setAttribute("errorMessage",result);
        }
        else {
            System.out.println("Data is found");
            req.setAttribute("message",artGalleryDTO);
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("ArtResult.jsp");
        requestDispatcher.forward(req,resp);
    }
}
