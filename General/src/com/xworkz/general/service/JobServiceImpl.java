package com.xworkz.general.service;

import com.xworkz.general.dto.JobDTO;
import com.xworkz.general.repository.JobRepository;
import com.xworkz.general.repository.JobRepositoryImpl;

public class JobServiceImpl implements JobService{


    @Override
    public String validAndSave(JobDTO jobDTO) {
        System.out.println("Running validAndSave in JobServiceImpl");

        JobRepository jobRepository = new JobRepositoryImpl();
        jobRepository.save(jobDTO);
        return "false";
    }
}
