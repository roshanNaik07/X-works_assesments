package com.xworkz.collections.country.internal;

import com.xworkz.collections.country.external.CountryRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CountryRepositoryImpl implements CountryRepository<String> {


    @Override
    public Collection<String> findAll() {

        Collection<String> countryCollection = new ArrayList<>(Arrays.asList("Argentina", "Samoa", "Pakistan", "Ireland", "Russia", "Vatican City", "Ecuador", "Cambodia",
                "United Kingdom", "Kazakhstan", "Jamaica", "Cyprus", "Mozambique", "Iran", "Slovenia", "Nicaragua",
                "Bahamas", "Ukraine", "Finland", "Myanmar", "New Zealand", "Libya", "Croatia", "Dominican Republic",
                "Somalia", "Singapore", "Poland", "Estonia", "Nigeria", "Malawi", "South Korea", "Azerbaijan",
                "Barbados", "Guatemala", "Egypt", "Tanzania", "Norway", "Ghana", "Kiribati", "Lebanon",
                "Chile", "Lesotho", "Mali", "Honduras", "India", "Portugal", "Belgium", "Turkey",
                "Luxembourg", "Monaco", "Lithuania", "Vanuatu", "Sudan", "Latvia", "Saint Lucia", "Czech Republic",
                "United Arab Emirates", "Belize", "Bhutan", "Uruguay", "Haiti", "Morocco", "Sri Lanka", "Philippines",
                "Papua New Guinea", "Bosnia and Herzegovina", "Mauritius", "Laos", "Palau", "Qatar", "Saudi Arabia", "Afghanistan",
                "Indonesia", "Niger", "Fiji", "Djibouti", "Brunei", "Slovakia", "Democratic Republic of the Congo", "Saint Vincent and the Grenadines",
                "Guyana", "Japan", "Cameroon", "Greece", "Togo", "Netherlands", "Bolivia", "Hungary",
                "Serbia", "Sweden", "Comoros", "Maldives", "Micronesia", "North Korea", "Canada", "Cuba",
                "Switzerland", "Marshall Islands", "Palestine", "Kenya", "Syria", "Moldova", "Gabon", "Germany",
                "Bangladesh", "Saint Kitts and Nevis", "Andorra", "Angola", "South Africa", "Romania", "Bulgaria", "Yemen",
                "Trinidad and Tobago", "Ethiopia", "Kazakhstan", "Colombia", "Georgia", "Eswatini", "Kosovo", "Tunisia",
                "Oman", "Malta", "Iraq", "France", "Montenegro", "Seychelles", "Benin", "Zambia",
                "Bhutan", "Tuvalu", "Vietnam", "Spain", "Bahrain", "Central African Republic", "United States", "Albania",
                "Antigua and Barbuda", "Australia", "Denmark", "Republic of the Congo", "Tajikistan", "Uganda", "Zambia", "Kyrgyzstan",
                "Liechtenstein", "Rwanda", "Venezuela", "Namibia", "Mongolia", "Nepal", "Algeria", "Israel",
                "Costa Rica", "Timor-Leste", "Panama", "San Marino", "Sierra Leone", "Djibouti", "Marshall Islands", "Mexico",
                "Equatorial Guinea", "Paraguay", "Chad", "Botswana", "Mauritania", "Solomon Islands", "Guinea", "Sao Tome and Principe",
                "Malaysia", "Jordan", "Iceland", "Norway", "Armenia", "Gambia", "Grenada", "Cabo Verde",
                "North Macedonia", "Croatia", "Norway", "Belgium", "Austria", "Malawi", "Lithuania", "Kuwait",
                "Senegal", "Suriname", "Timor-Leste", "Tonga", "Monaco", "Kazakhstan", "Honduras", "Kiribati"
        ));

        return countryCollection;
    }
}
