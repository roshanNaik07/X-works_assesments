package com.xworkz.Runner;

import com.xworkz.Rules.*;

public class Runner {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("----------------------- 1 ---------------------");

        Student student = new Student();
        student.teach();
        student.clean();
        ClassRoom.lock();

        System.out.println();
        System.out.println("--------------------- 2 -----------------------");

        Employee employee = new Employee();
        employee.work();
        employee.clean();
        Office.lock();

        System.out.println();
        System.out.println("----------------------- 3 ---------------------");

        Xworkz xworkz = new Intern();
        xworkz.clean();
        xworkz.teach();
        Xworkz.lock();

        System.out.println();
        System.out.println("----------------------- 4 ---------------------");

        Bachelor bachelor = new Bachelor();
        bachelor.pay();
        bachelor.clean();
        bachelor.silence();

        System.out.println();
        System.out.println("----------------------- 5 ---------------------");

        ParkWatchMan parkWatchMan = new ParkWatchMan();
        parkWatchMan.clean();
        parkWatchMan.facilities();
        parkWatchMan.timings();

        System.out.println();
        System.out.println("----------------------- 6 ---------------------");

        CricketPlayer cricketPlayer = new CricketPlayer();
        cricketPlayer.players();
        cricketPlayer.rules();
        cricketPlayer.umpireDecision();

        System.out.println();
        System.out.println("----------------------- 7 ---------------------");

        FootBallPlayer footBallPlayer = new FootBallPlayer();
        footBallPlayer.players();
        footBallPlayer.rules();
        footBallPlayer.refereeDecision();

        System.out.println();
        System.out.println("----------------------- 8 ---------------------");

        BasketBallPlayer basketBallPlayer = new BasketBallPlayer();
        basketBallPlayer.players();
        basketBallPlayer.rules();
        basketBallPlayer.refereeDecision();

        System.out.println();
        System.out.println("----------------------- 9 ---------------------");

        YouTubeChannel youTubeChannel = new YouTubeChannel();
        youTubeChannel.videos();
        youTubeChannel.rules();
        youTubeChannel.channels();

        System.out.println();
        System.out.println("----------------------- 10 ---------------------");

        CollegeStudent collegeStudent = new CollegeStudent();
        collegeStudent.students();
        collegeStudent.teachers();
        collegeStudent.rules();

        System.out.println();
        System.out.println("----------------------- 11 ---------------------");

        FamilyMember familyMember = new FamilyMember();
        familyMember.friends();
        familyMember.houseHelp();
        familyMember.neighbors();

        System.out.println();
        System.out.println("----------------------- 12 ---------------------");

        Vehicles vehicles = new Vehicles();
        vehicles.vehicles();
        vehicles.rules();
        vehicles.signals();

        System.out.println();
        System.out.println("----------------------- 13 ---------------------");

        BuyShirt buyShirt = new BuyShirt();
        buyShirt.privacyPolicy();
        buyShirt.termsAndConditions();
        buyShirt.returnsAndExchanges();

        System.out.println();
        System.out.println("----------------------- 14 ---------------------");

        PayTax payTax = new PayTax();
        payTax.tax();
        payTax.taxRate();
        payTax.taxFiling();

        System.out.println();
        System.out.println("----------------------- 15 ---------------------");

        OrderLaptop orderLaptop = new OrderLaptop();
        orderLaptop.privacyPolicy();
        orderLaptop.termsAndConditions();
        orderLaptop.returnsAndExchanges();

        System.out.println();
        System.out.println("----------------------- 16 ---------------------");

        CoalIndustry coalIndustry = new CoalIndustry();
        coalIndustry.rules();
        coalIndustry.employees();
        coalIndustry.managers();

        System.out.println();
        System.out.println("----------------------- 17 ---------------------");

        Poojari poojari = new Poojari();
        poojari.pooja();
        poojari.rules();
        poojari.prasad();

        System.out.println();
        System.out.println("----------------------- 18 ---------------------");

        MusiumVisitors musiumVisitors = new MusiumVisitors();
        musiumVisitors.rules();
        musiumVisitors.tickets();
        musiumVisitors.guides();

        System.out.println();
        System.out.println("----------------------- 19 ---------------------");

        PilgrimVisitors pilgrimVisitors = new PilgrimVisitors();
        pilgrimVisitors.rules();
        pilgrimVisitors.dressCode();
        pilgrimVisitors.food();

        System.out.println();
        System.out.println("----------------------- 20 ---------------------");

        OrderBiryani orderBiryani = new OrderBiryani();
        orderBiryani.payment();
        orderBiryani.delivery();
        orderBiryani.order();

        System.out.println();
        System.out.println("----------------------- 21 ---------------------");

        FaceWash  faceWash = new FaceWash();
        faceWash.skinCareLifestyle();
        faceWash.skinCareHydration();
        faceWash.skinCareDiet();

        System.out.println();
        System.out.println("----------------------- 22 ---------------------");

        Patient patient = new Patient();
        patient.emergencyServices();
        patient.billingAndInsurance();
        patient.patientRightsAndResponsibilities();

        System.out.println();
        System.out.println("----------------------- 23 ---------------------");

        StartUpFounder startUpFounder = new StartUpFounder();
        startUpFounder.privacyPolicy();
        startUpFounder.returnsAndExchanges();
        startUpFounder.termsAndConditions();

        System.out.println();
        System.out.println("----------------------- 24 ---------------------");

        Alcoholic alcoholic = new Alcoholic();
        alcoholic.fun();
        alcoholic.respect();
        alcoholic.safety();

        System.out.println();
        System.out.println("----------------------- 25 ---------------------");

        LearningLicence learningLicence = new LearningLicence();
        learningLicence.rules();
        learningLicence.vehicles();
        learningLicence.signals();

        System.out.println();
        System.out.println("----------------------- 26 ---------------------");

        Ashram ashram = new Ashram();
        ashram.rules();
        ashram.monks();
        ashram.temples();

        System.out.println();
        System.out.println("----------------------- 27 ---------------------");

        YogiLifeStyle yogiLifeStyle = new YogiLifeStyle();
        yogiLifeStyle.meditation();
        yogiLifeStyle.yoga();
        yogiLifeStyle.pranayama();

        System.out.println();
        System.out.println("----------------------- 28 ---------------------");

        KarateStudent karateStudent = new KarateStudent();
        karateStudent.rules();
        karateStudent.students();
        karateStudent.students();

        System.out.println();
        System.out.println("----------------------- 29 ---------------------");

        KungFuStudent kungFuStudent = new KungFuStudent();
        kungFuStudent.rules();
        kungFuStudent.students();
        kungFuStudent.teachers();


        System.out.println();
        System.out.println("----------------------- 30 ---------------------");

        WarmUp warmUp = new WarmUp();
        warmUp.cardio();
        warmUp.strengthTraining();
        warmUp.warmUp();

        System.out.println();
        System.out.println("----------------------- 31 ---------------------");

        Soldier soldier = new Soldier();
        soldier.rules();
        soldier.soldiers();
        soldier.weapons();

        System.out.println();
        System.out.println("----------------------- 32 ---------------------");

        Isro isro = new Isro();
        isro.rules();
        isro.satellites();
        isro.signals();

        System.out.println();
        System.out.println("----------------------- 33 ---------------------");

        CleanRiver cleanRiver = new CleanRiver();
        cleanRiver.recreation();
        cleanRiver.hydropower();
        cleanRiver.navigation();

        System.out.println();
        System.out.println("----------------------- 34 ---------------------");

        HotelManager hotelManager = new HotelManager();
        hotelManager.rules();
        hotelManager.food();
        hotelManager.service();

        System.out.println();
        System.out.println("----------------------- 35 ---------------------");

        RestorentManager restorentManager = new RestorentManager();
        restorentManager.rules();
        restorentManager.food();
        restorentManager.service();

        System.out.println();
        System.out.println("----------------------- 36 ---------------------");

        MayuraLogistics mayuraLogistics = new MayuraLogistics();
        mayuraLogistics.rules();
        mayuraLogistics.transportation();
        mayuraLogistics.warehousing();

        System.out.println();
        System.out.println("----------------------- 37 ---------------------");

        Biker biker = new Biker();
        biker.rules();
        biker.speed();
        biker.safety();

        System.out.println();
        System.out.println("----------------------- 38 ---------------------");

        Gliding gliding = new Gliding();
        gliding.rules();
        gliding.equipment();
        gliding.safety();

        System.out.println();
        System.out.println("----------------------- 39 ---------------------");

        Diver diver = new Diver();
        diver.rules();
        diver.safety();
        diver.equipment();

        System.out.println();
        System.out.println("----------------------- 40 ---------------------");

        HockeyPlayer hockeyPlayer = new HockeyPlayer();
        hockeyPlayer.rules();
        hockeyPlayer.safety();
        hockeyPlayer.equipment();

        System.out.println();
        System.out.println("----------------------- 41 ---------------------");

        BaseBallPlayer baseBallPlayer = new BaseBallPlayer();
        baseBallPlayer.equipment();
        baseBallPlayer.rules();
        baseBallPlayer.safety();

        System.out.println();
        System.out.println("----------------------- 42 ---------------------");

        Politician politician = new Politician();
        politician.equipment();
        politician.safety();
        politician.rules();

        System.out.println();
        System.out.println("----------------------- 43 ---------------------");

        NarendraModi narendraModi = new NarendraModi();
        narendraModi.rules();
        narendraModi.safety();
        narendraModi.primeMinister();

        System.out.println();
        System.out.println("----------------------- 44 ---------------------");

        IndianBank indianBank = new IndianBank();
        indianBank.rules();
        indianBank.safety();
        indianBank.bank();

        System.out.println();
        System.out.println("----------------------- 45 ---------------------");

        Nalanda nalanda = new Nalanda();
        nalanda.rules();
        nalanda.silence();
        nalanda.library();

        System.out.println();
        System.out.println("----------------------- 46 ---------------------");

        TelephoneTower telephoneTower = new TelephoneTower();
        telephoneTower.rules();
        telephoneTower.safety();
        telephoneTower.tower();

        System.out.println();
        System.out.println("----------------------- 47 ---------------------");

        EcoBeach ecoBeach = new EcoBeach();
        ecoBeach.rules();
        ecoBeach.safety();
        ecoBeach.beach();

        System.out.println();
        System.out.println("----------------------- 48 ---------------------");

        AmazonFouna amazonFouna = new AmazonFouna();
        amazonFouna.rules();
        amazonFouna.safety();
        amazonFouna.forest();

        System.out.println();
        System.out.println("----------------------- 49 ---------------------");

        Andaman andaman = new Andaman();
        andaman.rules();
        andaman.safety();
        andaman.island();

        System.out.println();
        System.out.println("----------------------- 50 ---------------------");

        RatPoison ratPoison = new RatPoison();
        ratPoison.Avoid();
        ratPoison.safety();
        ratPoison.poison();

        System.out.println();
        System.out.println("----------------------- 51 ---------------------");

        Grosary grosary = new Grosary();
        grosary.rules();
        grosary.safety();
        grosary.shop();

        System.out.println();
        System.out.println("----------------------- 52 ---------------------");

        Jumper jumper  = new Jumper();
        jumper.rules();
        jumper.safety();
        jumper.bunjiJumping();

        System.out.println();
        System.out.println("----------------------- 53 ---------------------");

        KarnatakaPolice karnatakaPolice = new KarnatakaPolice();
        karnatakaPolice.rules();
        karnatakaPolice.safety();
        karnatakaPolice.police();

        System.out.println();
        System.out.println("----------------------- 54 ---------------------");

        WarShips warShips = new WarShips();
        warShips.rules();
        warShips.safety();
        warShips.navy();

        System.out.println();
        System.out.println("----------------------- 55 ---------------------");

        Diwali diwali = new Diwali();
        diwali.rules();
        diwali.ritual();
        diwali.festival();

        System.out.println();
        System.out.println("----------------------- 56 ---------------------");

        RocketCrackers rocketCrackers = new RocketCrackers();
        rocketCrackers.safety();
        rocketCrackers.crackers();
        rocketCrackers.Sell();

        System.out.println();
        System.out.println("----------------------- 57 ---------------------");

        AutomaticGun automaticGun = new AutomaticGun();
        automaticGun.rules();
        automaticGun.safety();
        automaticGun.gun();

        System.out.println();
        System.out.println("----------------------- 58 ---------------------");

        HandGranade handGranade = new HandGranade();
        handGranade.rules();
        handGranade.safety();
        handGranade.granade();

        System.out.println();
        System.out.println("----------------------- 59 ---------------------");

        PublicStrick publicStrick = new PublicStrick();
        publicStrick.rules();
        publicStrick.safety();
        publicStrick.strick();

        System.out.println();
        System.out.println("----------------------- 60 ---------------------");

        Kargil kargil = new Kargil();
        kargil.rules();
        kargil.safety();
        kargil.war();

        System.out.println();
        System.out.println("----------------------- 61 ---------------------");
        SpaceWar spaceWar = new SpaceWar();
        spaceWar.coldWar();;
        spaceWar.rules();
        spaceWar.safety();

        System.out.println();
        System.out.println("----------------------- 62 ---------------------");

        IndianEconomy indianEconomy = new IndianEconomy();
        indianEconomy.economy();
        indianEconomy.growth();
        indianEconomy.safety();

        System.out.println();
        System.out.println("----------------------- 63 ---------------------");

        IndianGDP indianGDP = new IndianGDP();
        indianGDP.growth();
        indianGDP.safety();
        indianGDP.gdp();

        System.out.println();
        System.out.println("----------------------- 64 ---------------------");

        Rice rice = new Rice();
        rice.crop();
        rice.yield();
        rice.growth();

        System.out.println();
        System.out.println("----------------------- 65 ---------------------");

        MountainTreckking mountainTreckking = new MountainTreckking();
        mountainTreckking.rules();
        mountainTreckking.safety();
        mountainTreckking.trekking();

        System.out.println();
        System.out.println("----------------------- 66 ---------------------");

        BulletProof bulletProof = new BulletProof();
        bulletProof.rules();
        bulletProof.safety();
        bulletProof.bullet();

        System.out.println();
        System.out.println("----------------------- 67 ---------------------");

        PumaJacket pumaJacket = new PumaJacket();
        pumaJacket.waterProof();
        pumaJacket.safety();
        pumaJacket.jacket();

        System.out.println();
        System.out.println("----------------------- 68 ---------------------");

        SafeWater safeWater = new SafeWater();
        safeWater.drinkWater();
        safeWater.safety();
        safeWater.filter();

        System.out.println();
        System.out.println("----------------------- 69 ---------------------");

        BuildHome buildHome = new BuildHome();
        buildHome.rules();
        buildHome.safety();
        buildHome.construction();

        System.out.println();
        System.out.println("----------------------- 70 ---------------------");

        Metro metro = new Metro();
        metro.rules();
        metro.safety();
        metro.train();

        System.out.println();
        System.out.println("----------------------- 71 ---------------------");

        BMTC bmtc = new BMTC();
        bmtc.rules();
        bmtc.safety();
        bmtc.bus();

        System.out.println();
        System.out.println("----------------------- 72 ---------------------");

        MumbaiStock mumbaiStock = new MumbaiStock();
        mumbaiStock.rules();
        mumbaiStock.safety();
        mumbaiStock.stockMarket();

        System.out.println();
        System.out.println("----------------------- 73 ---------------------");

        MotoGtRacing motoGtRacing = new MotoGtRacing();
        motoGtRacing.rules();
        motoGtRacing.safety();
        motoGtRacing.racing();

        System.out.println();
        System.out.println("----------------------- 74 ---------------------");

        CourierArtWork courierArtWork = new CourierArtWork();
        courierArtWork.courier();
        courierArtWork.safety();
        courierArtWork.protect();

    }
}
