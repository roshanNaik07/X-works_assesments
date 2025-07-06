package com.xworkz.collections.country.external;

import java.util.Collection;

public interface CountryRepository <T>{

    Collection <T> findAll();

}
