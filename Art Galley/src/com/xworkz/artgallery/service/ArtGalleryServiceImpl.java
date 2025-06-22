package com.xworkz.artgallery.service;

import com.xworkz.artgallery.dto.ArtGalleryDTO;
import com.xworkz.artgallery.repository.ArtGalleryRepository;
import com.xworkz.artgallery.repository.ArtGalleryRepositoryImpl;

public class ArtGalleryServiceImpl implements ArtGalleryService {

    @Override
    public String validAndSave(ArtGalleryDTO artGalleryDTO) {
        System.out.println("Running validAndSave in ArtGalleryServiceImpl");

        if (artGalleryDTO != null) {
            System.out.println("ArtGalleryDTO is not null");

            String name = artGalleryDTO.getArtist();
            if(name==null || name.length()<4 || name.length()>30){
                System.out.println("Name is in-valid ");
                return "Please enter the valid name";
            }
            ArtGalleryRepository artGalleryRepository = new ArtGalleryRepositoryImpl();
            artGalleryRepository.save(artGalleryDTO);
        }
        return "Data saved succefully";
    }

    @Override
    public ArtGalleryDTO getById(int newId) {

        if (newId<=0){
            System.out.println("id is not found");
        }
        System.out.println("id is valid ");

        ArtGalleryRepository artGalleryRepository = new ArtGalleryRepositoryImpl();
        ArtGalleryDTO artGalleryDTO = artGalleryRepository.getDetails(newId);

        return artGalleryDTO;
    }


}
