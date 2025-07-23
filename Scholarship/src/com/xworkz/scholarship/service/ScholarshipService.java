package com.xworkz.scholarship.service;

import com.xworkz.scholarship.dto.ScholarshipDTO;

public interface ScholarshipService {

    String validAndSave(ScholarshipDTO scholarshipDTO);

    String validate(String formUsername , String formPassword);

}
