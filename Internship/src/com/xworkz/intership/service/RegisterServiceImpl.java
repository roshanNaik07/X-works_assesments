package com.xworkz.intership.service;

import com.xworkz.intership.dto.RegisterDto;
import com.xworkz.intership.repository.RegisterRepository;
import com.xworkz.intership.repository.RegisterRepositoryImpl;

public class RegisterServiceImpl implements RegisterService{

    @Override
    public String ValidateAndSave(RegisterDto registerDto) {

        RegisterRepository registerRepository = new RegisterRepositoryImpl();
        registerRepository.save(registerDto);

        return "false";
    }

    @Override
    public RegisterDto getById(int id) {

        if (id<=0){
            System.out.println("ID is invalid ");
        }

        System.out.println("ID is valid ");

        RegisterRepository registerRepository = new RegisterRepositoryImpl();
        RegisterDto registerDto = registerRepository.getDetail(id);
        return registerDto;
    }

}
