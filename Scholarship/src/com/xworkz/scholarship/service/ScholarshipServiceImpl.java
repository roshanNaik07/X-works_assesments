package com.xworkz.scholarship.service;

import com.xworkz.scholarship.dto.ScholarshipDTO;
import com.xworkz.scholarship.repository.ScholarshipRepository;
import com.xworkz.scholarship.repository.ScholarshipRepositoryImpl;

public class ScholarshipServiceImpl implements ScholarshipService {


    @Override
    public String validAndSave(ScholarshipDTO scholarshipDTO) {

        if (scholarshipDTO != null) {

            if (scholarshipDTO.getUsername().length() < 4 || scholarshipDTO.getUsername().length() > 20) {
                return "UserName should be between 4 to 20 characters";
            } else if (!scholarshipDTO.getPassword().equals(scholarshipDTO.getConfirmPassword())) {
                return "Password not matching";
            } else {
                ScholarshipRepository scholarshipRepository = new ScholarshipRepositoryImpl();
                scholarshipRepository.save(scholarshipDTO);
                return "Data saved successfully";
            }
        }
        return "Data not saved";
    }
}
