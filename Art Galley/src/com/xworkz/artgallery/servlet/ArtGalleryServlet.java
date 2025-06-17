package com.xworkz.artgallery.servlet;

import com.xworkz.artgallery.dto.ArtGalleryDTO;
import com.xworkz.artgallery.service.ArtGalleryService;
import com.xworkz.artgallery.service.ArtGalleryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        artGalleryService.validAndSave(artGalleryDTO);

    }
}
