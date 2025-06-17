package com.xworkz.general.service;

import com.xworkz.general.dto.PassportDTO;

public interface PassportService {

    public String validateAndSave(PassportDTO passportDTO);
}
