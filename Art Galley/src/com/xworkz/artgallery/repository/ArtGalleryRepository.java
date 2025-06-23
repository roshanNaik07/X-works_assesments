package com.xworkz.artgallery.repository;

import com.xworkz.artgallery.dto.ArtGalleryDTO;

public interface ArtGalleryRepository {

    String save(ArtGalleryDTO artGalleryDTO);

    ArtGalleryDTO getDetails(int id);
}
