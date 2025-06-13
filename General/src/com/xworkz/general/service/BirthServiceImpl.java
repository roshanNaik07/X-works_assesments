package com.xworkz.general.service;

import com.xworkz.general.dto.BirthDTO;
import com.xworkz.general.repository.BirthRepository;
import com.xworkz.general.repository.BirthRepositoryImpl;

public class BirthServiceImpl implements BirthService {

    @Override
    public String validAndSave(BirthDTO birthDTO) {
    System.out.println("Running validAndSave in BirthServiceImpl");

        BirthRepository birthRepository = new BirthRepositoryImpl();
        if (birthDTO != null) {
            System.out.println("BirthDTO is not null, proceeding to save");
            String result = birthRepository.save(birthDTO);
        }

        return "false";
    }
}
