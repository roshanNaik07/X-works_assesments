package com.xworkz.scholarship.service;

import com.xworkz.scholarship.dto.ScholarshipDTO;
import com.xworkz.scholarship.repository.ProfileRepository;
import com.xworkz.scholarship.repository.ProfileRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class ProfileServiceImpl implements ProfileService{


    @Override
    public List<ScholarshipDTO> getSignUpDetails() {

        ProfileRepository profileRepository = new ProfileRepositoryImpl();
        List<ScholarshipDTO> detailList = profileRepository.getDetails();
        if (!detailList.isEmpty()){
            return detailList;
        }

        return Collections.emptyList();
    }
}
