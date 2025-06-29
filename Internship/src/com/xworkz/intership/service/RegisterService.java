package com.xworkz.intership.service;

import com.xworkz.intership.dto.RegisterDto;

import java.io.Serializable;

public interface RegisterService {

    String ValidateAndSave(RegisterDto registerDto);

    RegisterDto getById(int id);

}
