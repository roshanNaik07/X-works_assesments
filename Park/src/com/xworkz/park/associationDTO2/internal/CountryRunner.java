package com.xworkz.park.associationDTO2.internal;

import com.xworkz.park.associationDTO2.dto.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CountryRunner {

    public static void main(String[] args) {

        ChancellorDTO chancellorDTO1 = new ChancellorDTO("Radhakrishnan",5);
        UniversityDTO universityDTO1 = new UniversityDTO("VTU","Vishveshwarayya",chancellorDTO1);
        EducationDto educationDto1 = new EducationDto("BE","SDIT",universityDTO1);
        DetailsDTO detailsDTO1 = new DetailsDTO(12354,9110689457l,educationDto1);

        List<StaffDTO> staffDTOList1 = new ArrayList<>();
        staffDTOList1.add(new StaffDTO("Suresh","Bussiness Management",detailsDTO1));
        staffDTOList1.add(new StaffDTO("mahesh","Developer",detailsDTO1));
        staffDTOList1.add(new StaffDTO("jaggesh","Intern",detailsDTO1));
        staffDTOList1.add(new StaffDTO("Rupesh","Data Analyst",detailsDTO1));

        HeadOfDepartment headOfDepartment1 = new HeadOfDepartment(5,"rajajinagar",staffDTOList1);
        DepartmentDTO departmentDTO1 =new DepartmentDTO("HR","Bashyam circle",headOfDepartment1);

        List<PortfolioDTO> portfolioDTOList1 = new ArrayList<>();
        portfolioDTOList1.add(new PortfolioDTO("Finance",2,departmentDTO1));
        portfolioDTOList1.add(new PortfolioDTO("Health",4,departmentDTO1));

        List<MinisterDTO> ministerDTOList1 = new ArrayList<>();
        ministerDTOList1.add(new MinisterDTO("Siddharamayya",75,portfolioDTOList1));
        ministerDTOList1.add(new MinisterDTO("Yedeyurappa",67,portfolioDTOList1));
        ministerDTOList1.add(new MinisterDTO("Kumar swami",72,portfolioDTOList1));

        List<StateDTO> stateDTOList1 = new ArrayList<>();
        stateDTOList1.add(new StateDTO("Karnataka",6000000,"Sidhharamayya",ministerDTOList1));
        stateDTOList1.add(new StateDTO("UP",2356655,"Yogi",ministerDTOList1));
        stateDTOList1.add(new StateDTO("Gujarat",264666,"Modi",ministerDTOList1));
        stateDTOList1.add(new StateDTO("Delhi",60546000,"Kejriwal",ministerDTOList1));
        stateDTOList1.add(new StateDTO("Kerala",33434,"EdaMone",ministerDTOList1));

        CountryDTO countryDTO1 = new CountryDTO("India","Asia",4,stateDTOList1);


        ChancellorDTO chancellorDTO2 = new ChancellorDTO("Anuradha Joshi",3);
        UniversityDTO universityDTO2 = new UniversityDTO("JNTU","Jawaharlal Nehru Technological University",chancellorDTO2);
        EducationDto educationDto2 = new EducationDto("MBA","IIM Bangalore",universityDTO2);
        DetailsDTO detailsDTO2 = new DetailsDTO(98765,9876543210L,educationDto2);

        List<StaffDTO> staffDTOList2 = new ArrayList<>();
        staffDTOList2.add(new StaffDTO("Anil","Marketing Lead",detailsDTO2));
        staffDTOList2.add(new StaffDTO("Divya","HR Executive",detailsDTO2));
        staffDTOList2.add(new StaffDTO("Kiran","UI Designer",detailsDTO2));
        staffDTOList2.add(new StaffDTO("Maya","Business Analyst",detailsDTO2));

        HeadOfDepartment headOfDepartment2 = new HeadOfDepartment(8,"MG Road",staffDTOList2);
        DepartmentDTO departmentDTO2 = new DepartmentDTO("Operations","Whitefield Campus",headOfDepartment2);

        List<PortfolioDTO> portfolioDTOList2 = new ArrayList<>();
        portfolioDTOList2.add(new PortfolioDTO("Defence",6,departmentDTO2));
        portfolioDTOList2.add(new PortfolioDTO("Technology",3,departmentDTO2));

        List<MinisterDTO> ministerDTOList2 = new ArrayList<>();
        ministerDTOList2.add(new MinisterDTO("Rajeev Shekhar",62,portfolioDTOList2));
        ministerDTOList2.add(new MinisterDTO("Anjali Mehta",58,portfolioDTOList2));
        ministerDTOList2.add(new MinisterDTO("Prakash Jha",64,portfolioDTOList2));

        List<StateDTO> stateDTOList2 = new ArrayList<>();
        stateDTOList2.add(new StateDTO("Maharashtra",112374333,"Shinde",ministerDTOList2));
        stateDTOList2.add(new StateDTO("Tamil Nadu",72147030,"Stalin",ministerDTOList2));
        stateDTOList2.add(new StateDTO("Punjab",27704236,"Bhagwant",ministerDTOList2));
        stateDTOList2.add(new StateDTO("Rajasthan",68548437,"Gehlot",ministerDTOList2));
        stateDTOList2.add(new StateDTO("Bihar",104099452,"Nitish",ministerDTOList2));

        CountryDTO countryDTO2 = new CountryDTO("Japan","Asia",5,stateDTOList2);

        ChancellorDTO chancellorDTO3 = new ChancellorDTO("William Harper",7);
        UniversityDTO universityDTO3 = new UniversityDTO("MIT","Massachusetts Institute of Technology",chancellorDTO3);
        EducationDto educationDto3 = new EducationDto("Ph.D.","Harvard",universityDTO3);
        DetailsDTO detailsDTO3 = new DetailsDTO(45678,8881234567L,educationDto3);

        List<StaffDTO> staffDTOList3 = new ArrayList<>();
        staffDTOList3.add(new StaffDTO("Alice","Research Scientist",detailsDTO3));
        staffDTOList3.add(new StaffDTO("John","Software Engineer",detailsDTO3));
        staffDTOList3.add(new StaffDTO("Linda","Data Engineer",detailsDTO3));
        staffDTOList3.add(new StaffDTO("Tom","AI Specialist",detailsDTO3));

        HeadOfDepartment headOfDepartment3 = new HeadOfDepartment(10,"Silicon Valley",staffDTOList3);
        DepartmentDTO departmentDTO3 = new DepartmentDTO("Technology & Innovation","Menlo Park",headOfDepartment3);

        List<PortfolioDTO> portfolioDTOList3 = new ArrayList<>();
        portfolioDTOList3.add(new PortfolioDTO("Cybersecurity",5,departmentDTO3));
        portfolioDTOList3.add(new PortfolioDTO("Artificial Intelligence",2,departmentDTO3));

        List<MinisterDTO> ministerDTOList3 = new ArrayList<>();
        ministerDTOList3.add(new MinisterDTO("Kamala Harris",59,portfolioDTOList3));
        ministerDTOList3.add(new MinisterDTO("Pete Buttigieg",42,portfolioDTOList3));
        ministerDTOList3.add(new MinisterDTO("Janet Yellen",77,portfolioDTOList3));

        List<StateDTO> stateDTOList3 = new ArrayList<>();
        stateDTOList3.add(new StateDTO("California",39538223,"Gavin Newsom",ministerDTOList3));
        stateDTOList3.add(new StateDTO("Texas",29145505,"Greg Abbott",ministerDTOList3));
        stateDTOList3.add(new StateDTO("Florida",21538187,"Ron DeSantis",ministerDTOList3));
        stateDTOList3.add(new StateDTO("New York",20201249,"Kathy Hochul",ministerDTOList3));
        stateDTOList3.add(new StateDTO("Illinois",12812508,"J.B. Pritzker",ministerDTOList3));

        CountryDTO countryDTO3 = new CountryDTO("USA","North America",6,stateDTOList3);

        ChancellorDTO chancellorDTO4 = new ChancellorDTO("Charlotte Green",4);
        UniversityDTO universityDTO4 = new UniversityDTO("Oxford","University of Oxford",chancellorDTO4);
        EducationDto educationDto4 = new EducationDto("M.A.","Cambridge",universityDTO4);
        DetailsDTO detailsDTO4 = new DetailsDTO(32109,7774567890L,educationDto4);

        List<StaffDTO> staffDTOList4 = new ArrayList<>();
        staffDTOList4.add(new StaffDTO("Oliver","Policy Advisor",detailsDTO4));
        staffDTOList4.add(new StaffDTO("Emma","Legal Consultant",detailsDTO4));
        staffDTOList4.add(new StaffDTO("Harry","Public Relations Officer",detailsDTO4));
        staffDTOList4.add(new StaffDTO("Sophia","Economic Analyst",detailsDTO4));

        HeadOfDepartment headOfDepartment4 = new HeadOfDepartment(6,"Westminster",staffDTOList4);
        DepartmentDTO departmentDTO4 = new DepartmentDTO("Foreign Affairs","Whitehall",headOfDepartment4);

        List<PortfolioDTO> portfolioDTOList4 = new ArrayList<>();
        portfolioDTOList4.add(new PortfolioDTO("International Relations",3,departmentDTO4));
        portfolioDTOList4.add(new PortfolioDTO("Economic Strategy",5,departmentDTO4));

        List<MinisterDTO> ministerDTOList4 = new ArrayList<>();
        ministerDTOList4.add(new MinisterDTO("Rishi Sunak",43,portfolioDTOList4));
        ministerDTOList4.add(new MinisterDTO("Theresa May",66,portfolioDTOList4));
        ministerDTOList4.add(new MinisterDTO("David Cameron",57,portfolioDTOList4));

        List<StateDTO> stateDTOList4 = new ArrayList<>();
        stateDTOList4.add(new StateDTO("England",55980000,"Sunak",ministerDTOList4));
        stateDTOList4.add(new StateDTO("Scotland",5466000,"Humza",ministerDTOList4));
        stateDTOList4.add(new StateDTO("Wales",3153000,"Drakeford",ministerDTOList4));
        stateDTOList4.add(new StateDTO("Northern Ireland",1893000,"O’Neill",ministerDTOList4));
        stateDTOList4.add(new StateDTO("Isle of Man",85000,"Cannan",ministerDTOList4));

        CountryDTO countryDTO4 = new CountryDTO("United Kingdom","Europe",4,stateDTOList4);

        ChancellorDTO chancellorDTO5 = new ChancellorDTO("Hiroshi Tanaka",6);
        UniversityDTO universityDTO5 = new UniversityDTO("UTokyo","University of Tokyo",chancellorDTO5);
        EducationDto educationDto5 = new EducationDto("M.Sc.","Kyoto University",universityDTO5);
        DetailsDTO detailsDTO5 = new DetailsDTO(76543,9098765432L,educationDto5);

        List<StaffDTO> staffDTOList5 = new ArrayList<>();
        staffDTOList5.add(new StaffDTO("Takeshi","AI Researcher",detailsDTO5));
        staffDTOList5.add(new StaffDTO("Yuki","Systems Analyst",detailsDTO5));
        staffDTOList5.add(new StaffDTO("Haruto","IT Consultant",detailsDTO5));
        staffDTOList5.add(new StaffDTO("Sakura","Project Coordinator",detailsDTO5));

        HeadOfDepartment headOfDepartment5 = new HeadOfDepartment(9,"Shibuya",staffDTOList5);
        DepartmentDTO departmentDTO5 = new DepartmentDTO("Technology","Chiyoda",headOfDepartment5);

        List<PortfolioDTO> portfolioDTOList5 = new ArrayList<>();
        portfolioDTOList5.add(new PortfolioDTO("Science & Innovation",4,departmentDTO5));
        portfolioDTOList5.add(new PortfolioDTO("Digital Affairs",3,departmentDTO5));

        List<MinisterDTO> ministerDTOList5 = new ArrayList<>();
        ministerDTOList5.add(new MinisterDTO("Fumio Kishida",66,portfolioDTOList5));
        ministerDTOList5.add(new MinisterDTO("Taro Kono",61,portfolioDTOList5));
        ministerDTOList5.add(new MinisterDTO("Yuriko Koike",71,portfolioDTOList5));

        List<StateDTO> stateDTOList5 = new ArrayList<>();
        stateDTOList5.add(new StateDTO("Tokyo",13960000,"Kishida",ministerDTOList5));
        stateDTOList5.add(new StateDTO("Osaka",8800000,"Yoshimura",ministerDTOList5));
        stateDTOList5.add(new StateDTO("Kyoto",1475000,"Kadokawa",ministerDTOList5));
        stateDTOList5.add(new StateDTO("Hokkaido",5260000,"Suzuki",ministerDTOList5));
        stateDTOList5.add(new StateDTO("Fukuoka",5100000,"Ogawa",ministerDTOList5));

        CountryDTO countryDTO5 = new CountryDTO("Japan","East Asia",5,stateDTOList5);

        ChancellorDTO chancellorDTO6 = new ChancellorDTO("Emily Parker",5);
        UniversityDTO universityDTO6 = new UniversityDTO("UofT","University of Toronto",chancellorDTO6);
        EducationDto educationDto6 = new EducationDto("B.Com","McGill University",universityDTO6);
        DetailsDTO detailsDTO6 = new DetailsDTO(89123,8667788990L,educationDto6);

        List<StaffDTO> staffDTOList6 = new ArrayList<>();
        staffDTOList6.add(new StaffDTO("Liam","Operations Manager",detailsDTO6));
        staffDTOList6.add(new StaffDTO("Ava","Recruitment Officer",detailsDTO6));
        staffDTOList6.add(new StaffDTO("Noah","Training Lead",detailsDTO6));
        staffDTOList6.add(new StaffDTO("Isabella","Compliance Advisor",detailsDTO6));

        HeadOfDepartment headOfDepartment6 = new HeadOfDepartment(7,"Downtown Toronto",staffDTOList6);
        DepartmentDTO departmentDTO6 = new DepartmentDTO("Public Services","Bay Street",headOfDepartment6);

        List<PortfolioDTO> portfolioDTOList6 = new ArrayList<>();
        portfolioDTOList6.add(new PortfolioDTO("Healthcare",6,departmentDTO6));
        portfolioDTOList6.add(new PortfolioDTO("Education Reform",4,departmentDTO6));

        List<MinisterDTO> ministerDTOList6 = new ArrayList<>();
        ministerDTOList6.add(new MinisterDTO("Justin Trudeau",53,portfolioDTOList6));
        ministerDTOList6.add(new MinisterDTO("Chrystia Freeland",55,portfolioDTOList6));
        ministerDTOList6.add(new MinisterDTO("Jagmeet Singh",45,portfolioDTOList6));

        List<StateDTO> stateDTOList6 = new ArrayList<>();
        stateDTOList6.add(new StateDTO("Ontario",14734014,"Trudeau",ministerDTOList6));
        stateDTOList6.add(new StateDTO("Quebec",8537674,"Legault",ministerDTOList6));
        stateDTOList6.add(new StateDTO("British Columbia",5147712,"Eby",ministerDTOList6));
        stateDTOList6.add(new StateDTO("Alberta",4428112,"Smith",ministerDTOList6));
        stateDTOList6.add(new StateDTO("Manitoba",1379584,"Kinew",ministerDTOList6));

        CountryDTO countryDTO6 = new CountryDTO("Canada","North America",6,stateDTOList6);

        ChancellorDTO chancellorDTO7 = new ChancellorDTO("Dr. Grace Thompson",3);
        UniversityDTO universityDTO7 = new UniversityDTO("ANU","Australian National University",chancellorDTO7);
        EducationDto educationDto7 = new EducationDto("M.Tech","University of Melbourne",universityDTO7);
        DetailsDTO detailsDTO7 = new DetailsDTO(77654,9112233445L,educationDto7);

        List<StaffDTO> staffDTOList7 = new ArrayList<>();
        staffDTOList7.add(new StaffDTO("Ethan","Cyber Security Analyst",detailsDTO7));
        staffDTOList7.add(new StaffDTO("Olivia","Policy Developer",detailsDTO7));
        staffDTOList7.add(new StaffDTO("Mason","IT Infrastructure Lead",detailsDTO7));
        staffDTOList7.add(new StaffDTO("Lily","Cloud Architect",detailsDTO7));

        HeadOfDepartment headOfDepartment7 = new HeadOfDepartment(6,"Canberra Central",staffDTOList7);
        DepartmentDTO departmentDTO7 = new DepartmentDTO("Digital Services","Barton",headOfDepartment7);

        List<PortfolioDTO> portfolioDTOList7 = new ArrayList<>();
        portfolioDTOList7.add(new PortfolioDTO("Digital Transformation",3,departmentDTO7));
        portfolioDTOList7.add(new PortfolioDTO("Public Safety",5,departmentDTO7));

        List<MinisterDTO> ministerDTOList7 = new ArrayList<>();
        ministerDTOList7.add(new MinisterDTO("Anthony Albanese",61,portfolioDTOList7));
        ministerDTOList7.add(new MinisterDTO("Penny Wong",52,portfolioDTOList7));
        ministerDTOList7.add(new MinisterDTO("Jim Chalmers",45,portfolioDTOList7));

        List<StateDTO> stateDTOList7 = new ArrayList<>();
        stateDTOList7.add(new StateDTO("New South Wales",8166369,"Albanese",ministerDTOList7));
        stateDTOList7.add(new StateDTO("Victoria",6680648,"Allan",ministerDTOList7));
        stateDTOList7.add(new StateDTO("Queensland",5261736,"Miles",ministerDTOList7));
        stateDTOList7.add(new StateDTO("Western Australia",2815480,"Cook",ministerDTOList7));
        stateDTOList7.add(new StateDTO("South Australia",1774100,"Malinauskas",ministerDTOList7));

        CountryDTO countryDTO7 = new CountryDTO("Australia","Oceania",5,stateDTOList7);

        ChancellorDTO chancellorDTO8 = new ChancellorDTO("Johannes Bauer",8);
        UniversityDTO universityDTO8 = new UniversityDTO("TUM","Technical University of Munich",chancellorDTO8);
        EducationDto educationDto8 = new EducationDto("B.Sc.","Heidelberg University",universityDTO8);
        DetailsDTO detailsDTO8 = new DetailsDTO(66543,9988776655L,educationDto8);

        List<StaffDTO> staffDTOList8 = new ArrayList<>();
        staffDTOList8.add(new StaffDTO("Felix","Energy Policy Advisor",detailsDTO8));
        staffDTOList8.add(new StaffDTO("Mia","Climate Specialist",detailsDTO8));
        staffDTOList8.add(new StaffDTO("Ben","Transport Planner",detailsDTO8));
        staffDTOList8.add(new StaffDTO("Emma","Environment Officer",detailsDTO8));

        HeadOfDepartment headOfDepartment8 = new HeadOfDepartment(10,"Berlin Mitte",staffDTOList8);
        DepartmentDTO departmentDTO8 = new DepartmentDTO("Sustainability","Alexanderplatz",headOfDepartment8);

        List<PortfolioDTO> portfolioDTOList8 = new ArrayList<>();
        portfolioDTOList8.add(new PortfolioDTO("Green Energy",4,departmentDTO8));
        portfolioDTOList8.add(new PortfolioDTO("Infrastructure",6,departmentDTO8));

        List<MinisterDTO> ministerDTOList8 = new ArrayList<>();
        ministerDTOList8.add(new MinisterDTO("Olaf Scholz",66,portfolioDTOList8));
        ministerDTOList8.add(new MinisterDTO("Annalena Baerbock",44,portfolioDTOList8));
        ministerDTOList8.add(new MinisterDTO("Robert Habeck",54,portfolioDTOList8));

        List<StateDTO> stateDTOList8 = new ArrayList<>();
        stateDTOList8.add(new StateDTO("Bavaria",13124737,"Söder",ministerDTOList8));
        stateDTOList8.add(new StateDTO("North Rhine-Westphalia",17947221,"Wüst",ministerDTOList8));
        stateDTOList8.add(new StateDTO("Baden-Württemberg",11200372,"Kretschmann",ministerDTOList8));
        stateDTOList8.add(new StateDTO("Berlin",3769495,"Giffey",ministerDTOList8));
        stateDTOList8.add(new StateDTO("Hamburg",1841179,"Tschentscher",ministerDTOList8));

        CountryDTO countryDTO8 = new CountryDTO("Germany","Europe",5,stateDTOList8);

        ChancellorDTO chancellorDTO9 = new ChancellorDTO("Émile Laurent",6);
        UniversityDTO universityDTO9 = new UniversityDTO("Sorbonne","Sorbonne University",chancellorDTO9);
        EducationDto educationDto9 = new EducationDto("B.A.","École Normale Supérieure",universityDTO9);
        DetailsDTO detailsDTO9 = new DetailsDTO(54901,9876543210L,educationDto9);

        List<StaffDTO> staffDTOList9 = new ArrayList<>();
        staffDTOList9.add(new StaffDTO("Julien","Cultural Advisor",detailsDTO9));
        staffDTOList9.add(new StaffDTO("Camille","Diplomatic Attaché",detailsDTO9));
        staffDTOList9.add(new StaffDTO("Nicolas","Public Policy Analyst",detailsDTO9));
        staffDTOList9.add(new StaffDTO("Claire","Media Strategist",detailsDTO9));

        HeadOfDepartment headOfDepartment9 = new HeadOfDepartment(7,"Paris Centre",staffDTOList9);
        DepartmentDTO departmentDTO9 = new DepartmentDTO("Foreign & Cultural Affairs","Boulevard Haussmann",headOfDepartment9);

        List<PortfolioDTO> portfolioDTOList9 = new ArrayList<>();
        portfolioDTOList9.add(new PortfolioDTO("Heritage Preservation",3,departmentDTO9));
        portfolioDTOList9.add(new PortfolioDTO("International Cooperation",4,departmentDTO9));

        List<MinisterDTO> ministerDTOList9 = new ArrayList<>();
        ministerDTOList9.add(new MinisterDTO("Emmanuel Macron",46,portfolioDTOList9));
        ministerDTOList9.add(new MinisterDTO("Élisabeth Borne",63,portfolioDTOList9));
        ministerDTOList9.add(new MinisterDTO("Jean-Yves Le Drian",76,portfolioDTOList9));

        List<StateDTO> stateDTOList9 = new ArrayList<>();
        stateDTOList9.add(new StateDTO("Île-de-France",12160000,"Macron",ministerDTOList9));
        stateDTOList9.add(new StateDTO("Provence-Alpes-Côte d'Azur",5075000,"Muselier",ministerDTOList9));
        stateDTOList9.add(new StateDTO("Auvergne-Rhône-Alpes",8030000,"Wauquiez",ministerDTOList9));
        stateDTOList9.add(new StateDTO("Nouvelle-Aquitaine",5992000,"Rousset",ministerDTOList9));
        stateDTOList9.add(new StateDTO("Occitanie",5984000,"Delga",ministerDTOList9));

        CountryDTO countryDTO9 = new CountryDTO("France","Europe",5,stateDTOList9);

        ChancellorDTO chancellorDTO10 = new ChancellorDTO("Carlos Mendes",5);
        UniversityDTO universityDTO10 = new UniversityDTO("USP","University of São Paulo",chancellorDTO10);
        EducationDto educationDto10 = new EducationDto("B.Sc.","Federal University of Rio",universityDTO10);
        DetailsDTO detailsDTO10 = new DetailsDTO(64320,9225566341L,educationDto10);

        List<StaffDTO> staffDTOList10 = new ArrayList<>();
        staffDTOList10.add(new StaffDTO("Mateus","Environmental Analyst",detailsDTO10));
        staffDTOList10.add(new StaffDTO("Isabela","Urban Planner",detailsDTO10));
        staffDTOList10.add(new StaffDTO("Rafael","Civil Engineer",detailsDTO10));
        staffDTOList10.add(new StaffDTO("Ana","Water Resource Manager",detailsDTO10));

        HeadOfDepartment headOfDepartment10 = new HeadOfDepartment(8,"Brasília Central",staffDTOList10);
        DepartmentDTO departmentDTO10 = new DepartmentDTO("Urban Development","Avenida Paulista",headOfDepartment10);

        List<PortfolioDTO> portfolioDTOList10 = new ArrayList<>();
        portfolioDTOList10.add(new PortfolioDTO("Infrastructure",4,departmentDTO10));
        portfolioDTOList10.add(new PortfolioDTO("Environment & Planning",6,departmentDTO10));

        List<MinisterDTO> ministerDTOList10 = new ArrayList<>();
        ministerDTOList10.add(new MinisterDTO("Luiz Inácio Lula da Silva",78,portfolioDTOList10));
        ministerDTOList10.add(new MinisterDTO("Marina Silva",66,portfolioDTOList10));
        ministerDTOList10.add(new MinisterDTO("Geraldo Alckmin",71,portfolioDTOList10));

        List<StateDTO> stateDTOList10 = new ArrayList<>();
        stateDTOList10.add(new StateDTO("São Paulo",46780000,"Lula",ministerDTOList10));
        stateDTOList10.add(new StateDTO("Rio de Janeiro",17460000,"Castro",ministerDTOList10));
        stateDTOList10.add(new StateDTO("Minas Gerais",21460000,"Zema",ministerDTOList10));
        stateDTOList10.add(new StateDTO("Bahia",14930000,"Costa",ministerDTOList10));
        stateDTOList10.add(new StateDTO("Paraná",11520000,"Ratinho Jr.",ministerDTOList10));

        CountryDTO countryDTO10 = new CountryDTO("Brazil","South America",5,stateDTOList10);


        Collection<CountryDTO> c = new ArrayList<>(Arrays.asList(countryDTO1,countryDTO2,countryDTO3,countryDTO4
                                    ,countryDTO5,countryDTO6,countryDTO7,countryDTO8,countryDTO9,countryDTO10));

        System.out.println(c);

    }

}
