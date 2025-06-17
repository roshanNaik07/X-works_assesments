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

            ArtGalleryRepository artGalleryRepository = new ArtGalleryRepositoryImpl();
            artGalleryRepository.save(artGalleryDTO);
            return "Art Gallery details saved successfully";
        }
        return "false";
    }
}
