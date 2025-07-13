package com.xworkz.scholarship.repository;

import com.xworkz.scholarship.dto.ScholarshipDTO;

import java.util.ArrayList;
import java.util.List;

public interface ProfileRepository {

    List<ScholarshipDTO> getDetails();
}
