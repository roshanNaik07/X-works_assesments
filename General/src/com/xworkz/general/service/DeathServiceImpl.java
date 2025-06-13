package com.xworkz.general.service;

import com.xworkz.general.dto.DeathDTO;
import com.xworkz.general.repository.DeathRepository;
import com.xworkz.general.repository.DeathRepositoryImpl;

public class DeathServiceImpl implements DeathService{

    @Override
    public String validateAndSave(DeathDTO deathDTO) {
        System.out.println("Running validateAndSave in DeathServiceImpl");
        DeathRepository deathRepository = new DeathRepositoryImpl();
        deathRepository.save(deathDTO);

        return "false";
    }
}
