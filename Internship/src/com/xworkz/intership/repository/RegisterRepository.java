package com.xworkz.intership.repository;

import com.xworkz.intership.dto.RegisterDto;

public interface RegisterRepository {

    String save(RegisterDto registerDto);

    RegisterDto getDetail(int id );
}
