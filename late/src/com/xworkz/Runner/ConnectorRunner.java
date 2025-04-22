package com.xworkz.Runner;

import com.xworkz.external.*;
import com.xworkz.external.Patient;
import com.xworkz.internal.*;

public class ConnectorRunner {

    public static void main(String[] args) {

        System.out.println("----------------------1-----------------------");
        System.out.println();

        Connector connector = new ConnectorImp();

        ConnectorUser connectorUser = new ConnectorUser(connector);

        connectorUser.execute();

        System.out.println("-----------------------2-----------------------");
        System.out.println();

        ICC icc = new IndianCricketTeamIccImpl();

        BCCI bcci = new BCCI(icc);

        bcci.conductTournament();

        System.out.println("-----------------------3-----------------------");
        System.out.println();

        Constitution constitution = new CitizenConstituionImpl();
        Government government = new Government(constitution);
        government.applyRules();

        System.out.println("-----------------------4-----------------------");
        System.out.println();

        Laptop laptop = new HpLaptopImpl();
        OperatingSystem operatingSystem = new OperatingSystem(laptop);
        operatingSystem.run();

        System.out.println("-----------------------5-----------------------");
        System.out.println();

        TrainingInstitute trainingInstitute = new xworkz();
        StartUp startUp = new StartUp(trainingInstitute);
        startUp.start();

        System.out.println("-----------------------6-----------------------");
        System.out.println();

        Lobby lobby = new BgmiImpl();
        Game game = new Game(lobby);
        game.play();

        System.out.println("-----------------------7-----------------------");
        System.out.println();

        ATM atm = new CustomerWithdrawImpl();
        Bank bank = new Bank(atm);
        bank.operate();

        System.out.println("-----------------------8-----------------------");
        System.out.println();

        TrafficSignal trafficSignal = new DriversImpl();
        TrafficPolice trafficPolice = new TrafficPolice(trafficSignal);
        trafficPolice.manageTraffic();

        System.out.println("-----------------------9-----------------------");
        System.out.println();

        Metro metro = new MetroPassengersImpl();
        BMTC bmtc = new BMTC(metro);
        metro.buyTicket();

        System.out.println("-----------------------10-----------------------");
        System.out.println();

        Railway railway = new RailwayPassengersImpl();
        IRCTC irctc = new IRCTC(railway);
        railway.getTrainTicket();

        System.out.println("-----------------------11-----------------------");
        System.out.println();

        Artist artist = new ArtCustomersImpl();
        ART art = new ART(artist);
        art.sell();

        System.out.println("-----------------------12-----------------------");
        System.out.println();

        Speaker speaker = new EventOrganise();
        JBL jbl = new JBL(speaker);
        jbl.play();

        System.out.println("-----------------------13-----------------------");
        System.out.println();

        LicAgent licAgent = new LicClientImpl();
        LIC lic = new LIC(licAgent);
        lic.policyRequirements();

        System.out.println("-----------------------14-----------------------");
        System.out.println();

        Instagram instagram = new SocialMediaUserImpl();
        SocialMedia socialMedia = new SocialMedia(instagram);
        socialMedia.use();

        System.out.println("-----------------------15-----------------------");
        System.out.println();

        SwiggyApp swiggyApp = new OrderFoodImpl();
        FoodDeliveryApp foodDeliveryApp = new FoodDeliveryApp(swiggyApp);
        foodDeliveryApp.order();

        System.out.println("-----------------------16-----------------------");
        System.out.println();

        Dentist dentist = new DentistPatient();
        Hospital hospital = new Hospital(dentist);
        hospital.treat();

        System.out.println("-----------------------17-----------------------");
        System.out.println();

        BikeCompany bikeCompany = new BikeCustomerImpl();
        BikeShowRoom bikeShowRoom = new BikeShowRoom(bikeCompany);
        bikeShowRoom.bikeDelivery();

        System.out.println("-----------------------18-----------------------");
        System.out.println();

        Police police = new CitizenComplaintImpl();
        PoliceStation policeStation = new PoliceStation(police);
        policeStation.fileFIR();

        System.out.println("-----------------------19-----------------------");
        System.out.println();

        MusicPlatform platform = new SpotifyImpl();
        AudioPlayer player = new AudioPlayer(platform);
        player.playMusic();

        System.out.println("-----------------------20-----------------------");
        System.out.println();
        SmartAssistant assistant = new AlexaImpl();
        SmartHome home = new SmartHome(assistant);
        home.controlHome();

        System.out.println("-----------------------21-----------------------");
        System.out.println();
        TravelAgency travel = new MakeMyTripImpl();
        Tourist tourist = new Tourist(travel);
        tourist.goVacation();

        System.out.println("-----------------------22-----------------------");
        System.out.println();
        CourierService courier = new FedExImpl();
        ECommerce ecommerce = new ECommerce(courier);
        ecommerce.shipProduct();

        System.out.println("-----------------------23-----------------------");
        System.out.println();
        ElectricityBoard board = new BescomImpl();
        House house = new House(board);
        house.getElectricity();

        System.out.println("-----------------------24-----------------------");
        System.out.println();
        RecruitmentAgency agency = new NaukriImpl();
        HRDepartment hr = new HRDepartment(agency);
        hr.recruit();

        System.out.println("-----------------------25-----------------------");
        System.out.println();
        Restaurant restaurant = new DominosImpl();
        Customer customer = new Customer(restaurant);
        customer.eat();

        System.out.println("-----------------------26-----------------------");
        System.out.println();
        TelecomService telecom = new JioImpl();
        Mobile mobile = new Mobile(telecom);
        mobile.useInternet();

        System.out.println("-----------------------27-----------------------");
        System.out.println();
        Publisher publisher = new PenguinImpl();
        Author author = new Author(publisher);
        author.writeBook();

        System.out.println("-----------------------28-----------------------");
        System.out.println();
        PaymentGateway gateway = new RazorpayImpl();
        OnlineStore store = new OnlineStore(gateway);
        store.checkout();

        System.out.println("-----------------------29-----------------------");
        System.out.println();
        RideSharing sharing = new UberImpl();
        Rider rider = new Rider(sharing);
        rider.startJourney();

        System.out.println("-----------------------30-----------------------");
        System.out.println();
        VideoStreaming streaming = new NetflixImpl();
        TV tv = new TV(streaming);
        tv.watchShow();

        System.out.println("-----------------------31-----------------------");
        System.out.println();
        GroceryApp grocery = new BigBasketImpl();
        GroceryUser groceryUser = new GroceryUser(grocery);
        groceryUser.getGroceries();

        System.out.println("-----------------------32-----------------------");
        System.out.println();
        Airline airline = new IndigoImpl();
        Passenger passenger = new Passenger(airline);
        passenger.fly();

        System.out.println("-----------------------33-----------------------");
        System.out.println();
        CabService cab = new OlaImpl();
        Traveler traveler = new Traveler(cab);
        traveler.goToDestination();

        System.out.println("-----------------------34-----------------------");
        System.out.println();
        MessagingApp msgApp = new WhatsAppImpl();
        User user = new User(msgApp);
        user.chat();

        System.out.println("-----------------------35-----------------------");
        System.out.println();
        MovieTicket movieTicket = new BookMyShowImpl();
        MovieGoer goer = new MovieGoer(movieTicket);
        goer.enjoyMovie();

        System.out.println("-----------------------36-----------------------");
        System.out.println();
        EducationPortal portal = new ByjusImpl();
        Student student = new Student(portal);
        student.learn();

        System.out.println("-----------------------37-----------------------");
        System.out.println();
        PaymentApp pay = new GooglePayImpl();
        Merchant merchant = new Merchant(pay);
        merchant.receiveMoney();

        System.out.println("-----------------------38-----------------------");
        System.out.println();
        FitnessApp fitness = new CultFitImpl();
        GymUser gymUser = new GymUser(fitness);
        gymUser.exercise();

        System.out.println("-----------------------39-----------------------");
        System.out.println();
        FoodApp foodApp = new ZomatoImpl();
        FoodCustomer foodCustomer = new FoodCustomer(foodApp);
        foodCustomer.placeOrder();

        System.out.println("-----------------------40-----------------------");
        System.out.println();
        HealthcareApp healthcare = new PractoImpl();
        Patient patient = new Patient(healthcare);
        patient.getTreatment();

        System.out.println("-----------------------41-----------------------");
        System.out.println();
        TaxiService taxiService = new OlaCabsImpl();
        OlaTraveler olaTraveler = new OlaTraveler(taxiService);
        olaTraveler.travel();

        System.out.println("-----------------------42-----------------------");
        System.out.println();
        EcommercePlatform ecommercePlatform = new FlipkartImpl();
        Shopper shopper = new Shopper(ecommercePlatform);
        shopper.shop();

        System.out.println("-----------------------43-----------------------");
        System.out.println();
        NewsApp newsApp = new TimesNowImpl();
        NewsViewer newsViewer = new NewsViewer(newsApp);
        newsViewer.getNews();

        System.out.println("-----------------------44-----------------------");
        System.out.println();
        SocialMediaApp socialMediaApp = new InstagramImpl();
        Influencer influencer = new Influencer(socialMediaApp);
        influencer.post();

        System.out.println("-----------------------45-----------------------");
        System.out.println();
        BankingApp bankingApp = new PaytmImpl();
        PaytmCustomer paytmCustomer = new PaytmCustomer(bankingApp);
        paytmCustomer.makeTransaction();

        System.out.println("-----------------------46-----------------------");
        System.out.println();
        EntertainmentApp entertainmentApp = new HotstarImpl();
        Viewer viewer = new Viewer(entertainmentApp);
        viewer.watch();

        System.out.println("-----------------------47-----------------------");
        System.out.println();
        FitnessTracker fitnessTracker = new FitbitImpl();
        FitnessUser fitnessUser = new FitnessUser(fitnessTracker);
        fitnessUser.monitorActivity();

        System.out.println("-----------------------48-----------------------");
        System.out.println();
        DeliveryApp deliveryApp = new SwiggyImpl();
        Recipient recipient = new Recipient(deliveryApp);
        recipient.receiveDelivery();

        System.out.println("-----------------------49-----------------------");
        System.out.println();
        CarRental carRental = new ZoomcarImpl();
        Renter renter = new Renter(carRental);
        renter.driveCar();

        System.out.println("-----------------------50-----------------------");
        System.out.println();
        BookStore bookStore = new KindleImpl();
        Reader reader = new Reader(bookStore);
        reader.read();


    }
}
