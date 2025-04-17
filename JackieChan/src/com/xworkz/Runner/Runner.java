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

        bachelor.Timing();

        System.out.println();
        System.out.println("----------------------- 5 ---------------------");

        ParkWatchMan parkWatchMan = new ParkWatchMan();
        parkWatchMan.clean();
        parkWatchMan.facilities();
        parkWatchMan.timings();

        parkWatchMan.rules();

        System.out.println();
        System.out.println("----------------------- 6 ---------------------");

        CricketPlayer cricketPlayer = new CricketPlayer();
        cricketPlayer.players();
        cricketPlayer.rules();
        cricketPlayer.umpireDecision();

        cricketPlayer.kit();

        System.out.println();
        System.out.println("----------------------- 7 ---------------------");

        FootBallPlayer footBallPlayer = new FootBallPlayer();
        footBallPlayer.players();
        footBallPlayer.rules();
        footBallPlayer.refereeDecision();

        footBallPlayer.Practice();

        System.out.println();
        System.out.println("----------------------- 8 ---------------------");

        BasketBallPlayer basketBallPlayer = new BasketBallPlayer();
        basketBallPlayer.players();
        basketBallPlayer.rules();
        basketBallPlayer.refereeDecision();

        basketBallPlayer.Practice();

        System.out.println();
        System.out.println("----------------------- 9 ---------------------");

        YouTubeChannel youTubeChannel = new YouTubeChannel();
        youTubeChannel.videos();
        youTubeChannel.rules();
        youTubeChannel.channels();

        youTubeChannel.subscription();

        System.out.println();
        System.out.println("----------------------- 10 ---------------------");

        CollegeStudent collegeStudent = new CollegeStudent();
        collegeStudent.students();
        collegeStudent.teachers();
        collegeStudent.rules();

        collegeStudent.attendance();

        System.out.println();
        System.out.println("----------------------- 11 ---------------------");

        FamilyMember familyMember = new FamilyMember();
        familyMember.friends();
        familyMember.houseHelp();
        familyMember.neighbors();

        familyMember.familyTime();

        System.out.println();
        System.out.println("----------------------- 12 ---------------------");

        Vehicles vehicles = new Vehicles();
        vehicles.vehicles();
        vehicles.rules();
        vehicles.signals();

        vehicles.speedLimit();

        System.out.println();
        System.out.println("----------------------- 13 ---------------------");

        BuyShirt buyShirt = new BuyShirt();
        buyShirt.privacyPolicy();
        buyShirt.termsAndConditions();
        buyShirt.returnsAndExchanges();

        buyShirt.paymentMethods();

        System.out.println();
        System.out.println("----------------------- 14 ---------------------");

        PayTax payTax = new PayTax();
        payTax.tax();
        payTax.taxRate();
        payTax.taxFiling();

        payTax.taxBenefits();

        System.out.println();
        System.out.println("----------------------- 15 ---------------------");

        OrderLaptop orderLaptop = new OrderLaptop();
        orderLaptop.privacyPolicy();
        orderLaptop.termsAndConditions();
        orderLaptop.returnsAndExchanges();

        orderLaptop.paymentMethods();

        System.out.println();
        System.out.println("----------------------- 16 ---------------------");

        CoalIndustry coalIndustry = new CoalIndustry();
        coalIndustry.rules();
        coalIndustry.employees();
        coalIndustry.managers();

        coalIndustry.safety();

        System.out.println();
        System.out.println("----------------------- 17 ---------------------");

        Poojari poojari = new Poojari();
        poojari.pooja();
        poojari.rules();
        poojari.prasad();

        poojari.rituals();

        System.out.println();
        System.out.println("----------------------- 18 ---------------------");

        MusiumVisitors musiumVisitors = new MusiumVisitors();
        musiumVisitors.rules();
        musiumVisitors.tickets();
        musiumVisitors.guides();

        musiumVisitors.safety();

        System.out.println();
        System.out.println("----------------------- 19 ---------------------");

        PilgrimVisitors pilgrimVisitors = new PilgrimVisitors();
        pilgrimVisitors.rules();
        pilgrimVisitors.dressCode();
        pilgrimVisitors.food();

        pilgrimVisitors.safety();

        System.out.println();
        System.out.println("----------------------- 20 ---------------------");

        OrderBiryani orderBiryani = new OrderBiryani();
        orderBiryani.payment();
        orderBiryani.delivery();
        orderBiryani.order();

        orderBiryani.type();

        System.out.println();
        System.out.println("----------------------- 21 ---------------------");

        FaceWash  faceWash = new FaceWash();
        faceWash.skinCareLifestyle();
        faceWash.skinCareHydration();
        faceWash.skinCareDiet();

        faceWash.skinCareRoutine();

        System.out.println();
        System.out.println("----------------------- 22 ---------------------");

        Patient patient = new Patient();
        patient.emergencyServices();
        patient.billingAndInsurance();
        patient.patientRightsAndResponsibilities();

        patient.patientCare();

        System.out.println();
        System.out.println("----------------------- 23 ---------------------");

        StartUpFounder startUpFounder = new StartUpFounder();
        startUpFounder.privacyPolicy();
        startUpFounder.returnsAndExchanges();
        startUpFounder.termsAndConditions();

        startUpFounder.startupCulture();

        System.out.println();
        System.out.println("----------------------- 24 ---------------------");

        Alcoholic alcoholic = new Alcoholic();
        alcoholic.fun();
        alcoholic.respect();
        alcoholic.safety();

        alcoholic.barRules();

        System.out.println();
        System.out.println("----------------------- 25 ---------------------");

        LearningLicence learningLicence = new LearningLicence();
        learningLicence.rules();
        learningLicence.vehicles();
        learningLicence.signals();

        learningLicence.apply();

        System.out.println();
        System.out.println("----------------------- 26 ---------------------");

        Ashram ashram = new Ashram();
        ashram.rules();
        ashram.monks();
        ashram.temples();

        ashram.ashram();

        System.out.println();
        System.out.println("----------------------- 27 ---------------------");

        YogiLifeStyle yogiLifeStyle = new YogiLifeStyle();
        yogiLifeStyle.meditation();
        yogiLifeStyle.yoga();
        yogiLifeStyle.pranayama();

        yogiLifeStyle.ashram();

        System.out.println();
        System.out.println("----------------------- 28 ---------------------");

        KarateStudent karateStudent = new KarateStudent();
        karateStudent.rules();
        karateStudent.students();
        karateStudent.teachers();

        karateStudent.learn();

        System.out.println();
        System.out.println("----------------------- 29 ---------------------");

        KungFuStudent kungFuStudent = new KungFuStudent();
        kungFuStudent.rules();
        kungFuStudent.students();
        kungFuStudent.teachers();

        kungFuStudent.learn();

        System.out.println();
        System.out.println("----------------------- 30 ---------------------");

        WarmUp warmUp = new WarmUp();
        warmUp.cardio();
        warmUp.strengthTraining();
        warmUp.warmUp();

        warmUp.flexibility();

        System.out.println();
        System.out.println("----------------------- 31 ---------------------");

        Soldier soldier = new Soldier();
        soldier.rules();
        soldier.soldiers();
        soldier.weapons();

        soldier.force();

        System.out.println();
        System.out.println("----------------------- 32 ---------------------");

        Isro isro = new Isro();
        isro.rules();
        isro.satellites();
        isro.signals();

        isro.launch();

        System.out.println();
        System.out.println("----------------------- 33 ---------------------");

        CleanRiver cleanRiver = new CleanRiver();
        cleanRiver.recreation();
        cleanRiver.hydropower();
        cleanRiver.navigation();

        cleanRiver.waterQuality();

        System.out.println();
        System.out.println("----------------------- 34 ---------------------");

        HotelManager hotelManager = new HotelManager();
        hotelManager.rules();
        hotelManager.food();
        hotelManager.service();

        hotelManager.cleanliness();

        System.out.println();
        System.out.println("----------------------- 35 ---------------------");

        RestorentManager restorentManager = new RestorentManager();
        restorentManager.rules();
        restorentManager.food();
        restorentManager.service();

        restorentManager.cleanliness();

        System.out.println();
        System.out.println("----------------------- 36 ---------------------");

        MayuraLogistics mayuraLogistics = new MayuraLogistics();
        mayuraLogistics.rules();
        mayuraLogistics.transportation();
        mayuraLogistics.warehousing();

        mayuraLogistics.approval();

        System.out.println();
        System.out.println("----------------------- 37 ---------------------");

        Biker biker = new Biker();
        biker.rules();
        biker.speed();
        biker.safety();

        biker.bikeCompany();

        System.out.println();
        System.out.println("----------------------- 38 ---------------------");

        Gliding gliding = new Gliding();
        gliding.rules();
        gliding.equipment();
        gliding.safety();

        gliding.weatherConditions();

        System.out.println();
        System.out.println("----------------------- 39 ---------------------");

        Diver diver = new Diver();
        diver.rules();
        diver.safety();
        diver.equipment();

        diver.practice();

        System.out.println();
        System.out.println("----------------------- 40 ---------------------");

        HockeyPlayer hockeyPlayer = new HockeyPlayer();
        hockeyPlayer.rules();
        hockeyPlayer.safety();
        hockeyPlayer.equipment();

        hockeyPlayer.practice();

        System.out.println();
        System.out.println("----------------------- 41 ---------------------");

        BaseBallPlayer baseBallPlayer = new BaseBallPlayer();
        baseBallPlayer.equipment();
        baseBallPlayer.rules();
        baseBallPlayer.safety();

        baseBallPlayer.practice();

        System.out.println();
        System.out.println("----------------------- 42 ---------------------");

        Politician politician = new Politician();
        politician.equipment();
        politician.safety();
        politician.rules();

        politician.management();

        System.out.println();
        System.out.println("----------------------- 43 ---------------------");

        NarendraModi narendraModi = new NarendraModi();
        narendraModi.rules();
        narendraModi.safety();
        narendraModi.primeMinister();

        narendraModi.foreignAffairs();

        System.out.println();
        System.out.println("----------------------- 44 ---------------------");

        IndianBank indianBank = new IndianBank();
        indianBank.rules();
        indianBank.safety();
        indianBank.bank();

        indianBank.management();

        System.out.println();
        System.out.println("----------------------- 45 ---------------------");

        Nalanda nalanda = new Nalanda();
        nalanda.rules();
        nalanda.silence();
        nalanda.library();

        nalanda.renovation();

        System.out.println();
        System.out.println("----------------------- 46 ---------------------");

        TelephoneTower telephoneTower = new TelephoneTower();
        telephoneTower.rules();
        telephoneTower.safety();
        telephoneTower.tower();

        telephoneTower.installation();

        System.out.println();
        System.out.println("----------------------- 47 ---------------------");

        EcoBeach ecoBeach = new EcoBeach();
        ecoBeach.rules();
        ecoBeach.safety();
        ecoBeach.beach();

        ecoBeach.clean();

        System.out.println();
        System.out.println("----------------------- 48 ---------------------");

        AmazonFouna amazonFouna = new AmazonFouna();
        amazonFouna.rules();
        amazonFouna.safety();
        amazonFouna.forest();

        amazonFouna.protection();

        System.out.println();
        System.out.println("----------------------- 49 ---------------------");

        Andaman andaman = new Andaman();
        andaman.rules();
        andaman.safety();
        andaman.island();

        andaman.packages();

        System.out.println();
        System.out.println("----------------------- 50 ---------------------");

        RatPoison ratPoison = new RatPoison();
        ratPoison.Avoid();
        ratPoison.safety();
        ratPoison.poison();

        ratPoison.protection();

        System.out.println();
        System.out.println("----------------------- 51 ---------------------");

        Grosary grosary = new Grosary();
        grosary.rules();
        grosary.safety();
        grosary.shop();

        grosary.items();

        System.out.println();
        System.out.println("----------------------- 52 ---------------------");

        Jumper jumper  = new Jumper();
        jumper.rules();
        jumper.safety();
        jumper.bunjiJumping();

        jumper.protection();

        System.out.println();
        System.out.println("----------------------- 53 ---------------------");

        KarnatakaPolice karnatakaPolice = new KarnatakaPolice();
        karnatakaPolice.rules();
        karnatakaPolice.safety();
        karnatakaPolice.police();

        karnatakaPolice.duty();

        System.out.println();
        System.out.println("----------------------- 54 ---------------------");

        WarShips warShips = new WarShips();
        warShips.rules();
        warShips.safety();
        warShips.navy();

        warShips.maintainShip();

        System.out.println();
        System.out.println("----------------------- 55 ---------------------");

        Diwali diwali = new Diwali();
        diwali.rules();
        diwali.ritual();
        diwali.festival();

        diwali.celebration();

        System.out.println();
        System.out.println("----------------------- 56 ---------------------");

        RocketCrackers rocketCrackers = new RocketCrackers();
        rocketCrackers.safety();
        rocketCrackers.crackers();
        rocketCrackers.Sell();

        rocketCrackers.safetyMeasures();

        System.out.println();
        System.out.println("----------------------- 57 ---------------------");

        AutomaticGun automaticGun = new AutomaticGun();
        automaticGun.rules();
        automaticGun.safety();
        automaticGun.gun();

        automaticGun.safetyMeasures();

        System.out.println();
        System.out.println("----------------------- 58 ---------------------");

        HandGranade handGranade = new HandGranade();
        handGranade.rules();
        handGranade.safety();
        handGranade.granade();

        handGranade.safetyMeasures();

        System.out.println();
        System.out.println("----------------------- 59 ---------------------");

        PublicStrick publicStrick = new PublicStrick();
        publicStrick.rules();
        publicStrick.safety();
        publicStrick.strick();

        publicStrick.opposition();

        System.out.println();
        System.out.println("----------------------- 60 ---------------------");

        Kargil kargil = new Kargil();
        kargil.rules();
        kargil.safety();
        kargil.war();

        kargil.attack();

        System.out.println();
        System.out.println("----------------------- 61 ---------------------");

        SpaceWar spaceWar = new SpaceWar();
        spaceWar.coldWar();;
        spaceWar.rules();
        spaceWar.safety();

        spaceWar.economyReasons();

        System.out.println();
        System.out.println("----------------------- 62 ---------------------");

        IndianEconomy indianEconomy = new IndianEconomy();
        indianEconomy.economy();
        indianEconomy.growth();
        indianEconomy.safety();

        indianEconomy.improvement();

        System.out.println();
        System.out.println("----------------------- 63 ---------------------");

        IndianGDP indianGDP = new IndianGDP();
        indianGDP.growth();
        indianGDP.safety();
        indianGDP.gdp();

        indianGDP.improvement();

        System.out.println();
        System.out.println("----------------------- 64 ---------------------");

        Rice rice = new Rice();
        rice.crop();
        rice.yield();
        rice.growth();

        rice.season();

        System.out.println();
        System.out.println("----------------------- 65 ---------------------");

        MountainTreckking mountainTreckking = new MountainTreckking();
        mountainTreckking.rules();
        mountainTreckking.safety();
        mountainTreckking.trekking();

        mountainTreckking.season();

        System.out.println();
        System.out.println("----------------------- 66 ---------------------");

        BulletProof bulletProof = new BulletProof();
        bulletProof.rules();
        bulletProof.safety();
        bulletProof.bullet();

        bulletProof.material();

        System.out.println();
        System.out.println("----------------------- 67 ---------------------");

        PumaJacket pumaJacket = new PumaJacket();
        pumaJacket.waterProof();
        pumaJacket.safety();
        pumaJacket.jacket();

        pumaJacket.material();

        System.out.println();
        System.out.println("----------------------- 68 ---------------------");

        SafeWater safeWater = new SafeWater();
        safeWater.drinkWater();
        safeWater.safety();
        safeWater.filter();

        safeWater.temperature();

        System.out.println();
        System.out.println("----------------------- 69 ---------------------");

        BuildHome buildHome = new BuildHome();
        buildHome.rules();
        buildHome.safety();
        buildHome.construction();

        buildHome.material();

        System.out.println();
        System.out.println("----------------------- 70 ---------------------");

        Metro metro = new Metro();
        metro.rules();
        metro.safety();
        metro.train();

        metro.timing();

        System.out.println();
        System.out.println("----------------------- 71 ---------------------");

        BMTC bmtc = new BMTC();
        bmtc.rules();
        bmtc.safety();
        bmtc.bus();

        bmtc.timing();

        System.out.println();
        System.out.println("----------------------- 72 ---------------------");

        MumbaiStock mumbaiStock = new MumbaiStock();
        mumbaiStock.rules();
        mumbaiStock.safety();
        mumbaiStock.stockMarket();

        mumbaiStock.timing();

        System.out.println();
        System.out.println("----------------------- 73 ---------------------");

        MotoGtRacing motoGtRacing = new MotoGtRacing();
        motoGtRacing.rules();
        motoGtRacing.safety();
        motoGtRacing.racing();

        motoGtRacing.driver();

        System.out.println();
        System.out.println("----------------------- 74 ---------------------");

        CourierArtWork courierArtWork = new CourierArtWork();
        courierArtWork.courier();
        courierArtWork.safety();
        courierArtWork.protect();

        courierArtWork.price();

    }
}
