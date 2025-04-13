package com.xworkz.Runner;

import com.xworkz.internal.*;

public class MethodRunner {
    public static void main(String[] args) {

        System.out.println("-------------------1----------------------------------");
        Bag bag = new Bag("WildCraft","Green",1200);
        System.out.println(bag);
        System.out.println("assigned hashCode : "+bag.hashCode());
        System.out.println("default : "+System.identityHashCode(bag));
        Bag bag1 = new Bag("WildCraft","black",900);
        System.out.println("Both bag are same : "+bag.equals(bag1));

        System.out.println();
        System.out.println("-------------------2----------------------------------");
        Laptop laptop = new Laptop("Acer","black",48000);
        System.out.println(laptop);
        System.out.println("assigned hashCode : "+laptop.hashCode());
        System.out.println("default : "+System.identityHashCode(laptop));
        Laptop laptop1 = new Laptop("Asus","black",120000);
        System.out.println("Both Lap colors are same : "+laptop.equals(laptop1));

        System.out.println();
        System.out.println("-------------------3----------------------------------");
        Charger charger = new Charger("Asus",7,1200);
        System.out.println(charger);
        System.out.println("assigned hashCode : "+charger.hashCode());
        System.out.println("default : "+System.identityHashCode(charger));
        Charger charger1 = new Charger("Asus",5,1500);
        System.out.println("Charger brands are same :"+charger.equals(charger1));

        System.out.println();
        System.out.println("-------------------4----------------------------------");
        Phone phone = new Phone("Redmi","Gaming",20000);
        System.out.println(phone);
        System.out.println("assigned hashCode : "+phone.hashCode());
        System.out.println("default : "+System.identityHashCode(phone));
        Phone phone1 = new Phone("iqoo","Gaming",22000);
        System.out.println("Phone categories are same: "+phone.equals(phone1));

        System.out.println();
        System.out.println("-------------------5----------------------------------");
        Screen screen = new Screen("Samsung","Large",8000);
        System.out.println(screen);
        System.out.println("assigned hashCode : "+screen.hashCode());
        System.out.println("default : "+System.identityHashCode(screen));
        Screen screen1 = new Screen("LG","Medium",8000);
        System.out.println("Screen price are same : "+screen.equals(screen1));

        System.out.println();
        System.out.println("-------------------6----------------------------------");
        Bottle bottle = new Bottle(1,"Blue",100);
        System.out.println(bottle);
        System.out.println("assigned hashCode : "+bottle.hashCode());
        System.out.println("default : "+System.identityHashCode(bottle));
        Bottle bottle1 = new Bottle(2,"Blue",150);
        System.out.println("Both bottle colors are same : "+bottle.equals(bottle1));

        System.out.println();
        System.out.println("-------------------7----------------------------------");
        Shirt shirt = new Shirt("US POLO","White",1500);
        System.out.println(shirt);
        System.out.println("assigned hashCode : "+shirt.hashCode());
        System.out.println("default : "+System.identityHashCode(shirt));
        Shirt shirt1 = new Shirt("Zudio","Red",400);
        System.out.println("Both the Shirts are of same Brand : "+shirt.equals(shirt1));

        System.out.println();
        System.out.println("-------------------8----------------------------------");
        Belt belt = new Belt("Lewis","Leather",1000);
        System.out.println(belt);
        System.out.println("assigned hashCode : "+belt.hashCode());
        System.out.println("default : "+System.identityHashCode(belt));
        Belt belt1 = new Belt("Lewis","Leather", 50000);
        System.out.println("Both belt materials are same : "+belt.equals(belt1));

        System.out.println();
        System.out.println("-------------------9----------------------------------");
        Shoe shoe = new Shoe("Puma",9,2800);
        System.out.println(shoe);
        System.out.println("assigned hashCode : "+shoe.hashCode());
        System.out.println("default : "+System.identityHashCode(shoe));
        Shoe shoe1 = new Shoe("Adidas",9,4200);
        System.out.println("both shoe size are same : "+shoe.equals(shoe1));

        System.out.println();
        System.out.println("-------------------10----------------------------------");
        Slider slider = new Slider("Adidas",8,1500);
        System.out.println(slider);
        System.out.println("assigned hashCode : "+slider.hashCode());
        System.out.println("default : "+System.identityHashCode(slider));
        Slider slider1 = new Slider("Adidas",9,2000);
        System.out.println("Sliders brand is same: "+slider.equals(slider1));

        System.out.println();
        System.out.println("-------------------11----------------------------------");
        NoteBook noteBook = new NoteBook("Classmate",200,80);
        System.out.println(noteBook);
        System.out.println("assigned hashCode : "+noteBook.hashCode());
        System.out.println("default : "+System.identityHashCode(noteBook));
        NoteBook noteBook1 = new NoteBook("Classmate",100,50);
        System.out.println("Both notebook brands are same : "+noteBook.equals(noteBook1));

        System.out.println();
        System.out.println("-------------------12----------------------------------");
        Fan fan = new Fan("Bajaj","white",1500);
        System.out.println(fan);
        System.out.println(noteBook);
        System.out.println("assigned hashCode : "+fan.hashCode());
        System.out.println("default : "+System.identityHashCode(fan));
        Fan fan1 = new Fan("Ankher","white",2000);
        System.out.println("Both brands have same color : "+fan.equals(fan1));

        System.out.println();
        System.out.println("-------------------13----------------------------------");
        IronBox ironBox = new IronBox("Usha","white",1200);
        System.out.println(ironBox);
        System.out.println("assigned hashCode : "+ironBox.hashCode());
        System.out.println("default : "+System.identityHashCode(ironBox));
        IronBox ironBox1 = new IronBox("Usha","Blue",1500);
        System.out.println("Both ironbox brands are same: "+ironBox.equals(ironBox1));

        System.out.println();
        System.out.println("-------------------14----------------------------------");
        Bike bike = new Bike("Pulsur",200,120000);
        System.out.println(bike);
        System.out.println("assigned hashCode : "+bike.hashCode());
        System.out.println("default : "+System.identityHashCode(bike));
        Bike bike1 = new Bike("Pulsur",400,220000);
        System.out.println("Both bike companies are same : "+bike.equals(bike1));

        System.out.println();
        System.out.println("-------------------15----------------------------------");
        WashingMachine washingMachine = new WashingMachine("LG","Automatic",30000);
        System.out.println(washingMachine);
        System.out.println("assigned hashCode : "+washingMachine.hashCode());
        System.out.println("default : "+System.identityHashCode(washingMachine));
        WashingMachine washingMachine1 = new WashingMachine("Samsung","manual",25000);
        System.out.println("WashingMachine type is same"+washingMachine.equals(washingMachine1));

        System.out.println();
        System.out.println("-------------------16----------------------------------");
        Pen pen = new Pen("Bright","Black",5);
        System.out.println(pen);
        System.out.println("assigned hashCode : "+pen.hashCode());
        System.out.println("default : "+System.identityHashCode(pen));
        Pen pen1 = new Pen("Pentop","Black",10);
        System.out.println("Both pen colors are same : "+pen.equals(pen1));

        System.out.println();
        System.out.println("-------------------17----------------------------------");
        Pencil pencil = new Pencil("Domz","4b",15);
        System.out.println(pencil);
        System.out.println("assigned hashCode : "+pencil.hashCode());
        System.out.println("default : "+System.identityHashCode(pencil));
        Pencil pencil1 = new Pencil("Apsara","3b",12);
        System.out.println("Both Pencils have same brand : "+pencil.equals(pencil1));

        System.out.println();
        System.out.println("-------------------18----------------------------------");
        ColorPencil colorPencil = new ColorPencil("FibreCastle","red",20);
        System.out.println(colorPencil);
        System.out.println("assigned hashCode : "+colorPencil.hashCode());
        System.out.println("default : "+System.identityHashCode(colorPencil));
        ColorPencil colorPencil1 = new ColorPencil("FibreCastle","blue",25);
        System.out.println("Both colorPencils have same brand : "+colorPencil.equals(colorPencil1));

        System.out.println();
        System.out.println("-------------------19----------------------------------");
        Eraser eraser = new Eraser("Nataraj","white",3);
        System.out.println(eraser);
        System.out.println("assigned hashCode : "+eraser.hashCode());
        System.out.println("default : "+System.identityHashCode(eraser));
        Eraser eraser1 = new Eraser("Apsara","white",5);
        System.out.println("Both erasers has same brand : "+eraser.equals(eraser1));

        System.out.println();
        System.out.println("-------------------20----------------------------------");
        Sharpner sharpner = new Sharpner("Apsara","blue",5);
        System.out.println(sharpner);
        System.out.println("assigned hashCode : "+sharpner.hashCode());
        System.out.println("default : "+System.identityHashCode(sharpner));
        Sharpner sharpner1 = new Sharpner("Apsara","red",5);

        System.out.println();
        System.out.println("-------------------21----------------------------------");
        Watch watch = new Watch("Fastrack","casual",2700);
        System.out.println(watch);
        System.out.println("assigned hashCode : "+watch.hashCode());
        System.out.println("default : "+System.identityHashCode(watch));
        Watch watch1 = new Watch("Titan","formals",3000);

        System.out.println();
        System.out.println("-------------------22----------------------------------");
        DeliveryApp deliveryApp = new DeliveryApp("Zepto",15,25);
        System.out.println(deliveryApp);
        System.out.println("assigned hashCode : "+deliveryApp.hashCode());
        System.out.println("default : "+System.identityHashCode(deliveryApp));
        DeliveryApp deliveryApp1 = new DeliveryApp("instaMart",10,20);
        System.out.println("deliveryApp name is same : "+deliveryApp.equals(deliveryApp1));

        System.out.println();
        System.out.println("-------------------23----------------------------------");
        Music music = new Music("Spotify",120,66);
        System.out.println(music);
        System.out.println("assigned hashCode : "+music.hashCode());
        System.out.println("default : "+System.identityHashCode(music));
        Music music1 = new Music("Jio Sawan",99,56);
        System.out.println("Nusic appname is same : "+music.equals(music1));

        System.out.println();
        System.out.println("-------------------24----------------------------------");
        Bucket bucket = new Bucket("Joyo","Brown",200);
        System.out.println(bucket);
        System.out.println("assigned hashCode : "+bucket.hashCode());
        System.out.println("default : "+System.identityHashCode(bucket));
        Bucket bucket1 = new Bucket("Turbo","Brown",250);
        System.out.println("Both bucket has same colors : "+bucket.equals(bucket1));

        System.out.println();
        System.out.println("-------------------25----------------------------------");
        Facewash facewash = new Facewash("Garnier","Charcoal",180);
        System.out.println(facewash);
        System.out.println("assigned hashCode : "+facewash.hashCode());
        System.out.println("default : "+System.identityHashCode(facewash));
        Facewash facewash1 = new Facewash("Himalaya","Lime",129);
        System.out.println("Both faceWash has same brands : "+facewash.equals(facewash1));

        System.out.println();
        System.out.println("-------------------26----------------------------------");
        Soap soap = new Soap("Mysore sandle","Sandlewood",80);
        System.out.println(soap);
        System.out.println("assigned hashCode : "+soap.hashCode());
        System.out.println("default : "+System.identityHashCode(soap));
        Soap soap1 = new Soap("Mysore sandle","Sandlewood",50);
        System.out.println("Both soad aroma are same: "+soap.equals(soap1));

        System.out.println();
        System.out.println("-------------------27----------------------------------");
        Paste paste = new Paste("Colgate","Mint",60);
        System.out.println(paste);
        System.out.println("assigned hashCode : "+paste.hashCode());
        System.out.println("default : "+System.identityHashCode(paste));
        Paste paste1 = new Paste("Sensudine","Mint",75);
        System.out.println("Both paste brands are same : "+paste.equals(paste1));

        System.out.println();
        System.out.println("-------------------28----------------------------------");
        Sampoo sampoo = new Sampoo("Traceme","Lime",160);
        System.out.println(sampoo);
        System.out.println("assigned hashCode : "+sampoo.hashCode());
        System.out.println("default : "+System.identityHashCode(sampoo));
        Sampoo sampoo1=new Sampoo("Dove","coconut",120);
        System.out.println("Both Sampoo brands are same : "+sampoo.equals(sampoo1));

        System.out.println();
        System.out.println("-------------------29----------------------------------");
        Brush brush = new Brush("Sensudine","Hard",42);
        System.out.println(brush);
        System.out.println("assigned hashCode : "+brush.hashCode());
        System.out.println("default : "+System.identityHashCode(brush));
        Brush brush1 = new Brush("Colgate","soft",40);
        System.out.println("Both brush brands are same : "+brush.equals(brush1));

        System.out.println();
        System.out.println("-------------------30----------------------------------");
        BodyWash bodyWash = new BodyWash("Pears","glicerin",200);
        System.out.println(bodyWash);
        System.out.println("assigned hashCode : "+bodyWash.hashCode());
        System.out.println("default : "+System.identityHashCode(bodyWash));
        BodyWash bodyWash1 = new BodyWash("Pears","glicerin",180);
        System.out.println("Both bodywash are same : "+bodyWash.equals(bodyWash1));

        System.out.println();
        System.out.println("-------------------31----------------------------------");
        Mug mug = new Mug("joyo","grey",70);
        System.out.println(mug);
        System.out.println("assigned hashCode : "+mug.hashCode());
        System.out.println("default : "+System.identityHashCode(mug));
        Mug mug1 = new Mug("joyo","grey",70);
        System.out.println("Both Mug are same : "+mug.equals(mug1));

        System.out.println();
        System.out.println("-------------------32----------------------------------");
        Tshirt tshirt = new Tshirt("polo","Black",250);
        System.out.println(tshirt);
        System.out.println("assigned hashCode : "+tshirt.hashCode());
        System.out.println("default : "+System.identityHashCode(tshirt));
        Tshirt tshirt1 = new Tshirt("polo","blue",250);
        System.out.println(tshirt.equals(tshirt1));


        System.out.println();
        System.out.println("-------------------33----------------------------------");
        SuitCase suitCase = new SuitCase("Arrow","Red",5000);
        System.out.println(suitCase);
        System.out.println("assigned hashCode : "+suitCase.hashCode());
        System.out.println("default : "+System.identityHashCode(suitCase));
        SuitCase suitCase1 = new SuitCase("Aristocart","Blue",8000);
        System.out.println("Both suitcase brands are same : "+suitCase.equals(suitCase1));

        System.out.println();
        System.out.println("-------------------34----------------------------------");
        Park park = new Park("Kadri","KPT",7);
        System.out.println(park);
        System.out.println("assigned hashCode : "+park.hashCode());
        System.out.println("default : "+System.identityHashCode(park));
        Park park1 = new Park("kubon","KPT",8);
        System.out.println("Both location are same : "+park.equals(park1));

        System.out.println();
        System.out.println("-------------------35----------------------------------");
        Restorent restorent = new Restorent("K9","KPT",7);
        System.out.println(restorent);
        System.out.println("assigned hashCode : "+restorent.hashCode());
        System.out.println("default : "+System.identityHashCode(restorent));
        Restorent restorent1 = new Restorent("Empire","Bangalore",8);
        System.out.println("Both restorent names are same : "+restorent.equals(restorent1));

        System.out.println();
        System.out.println("-------------------36----------------------------------");
        Hotel hotel = new Hotel("Samrat","sirsi",10);
        System.out.println(hotel);
        System.out.println("assigned hashCode : "+hotel.hashCode());
        System.out.println("default : "+System.identityHashCode(hotel));
        Hotel hotel1 = new Hotel("Samrat","sirsi",9);
        System.out.println("Both hotels name and location are same : "+hotel.equals(hotel1));

        System.out.println();
        System.out.println("-------------------37----------------------------------");
        Palace palace = new Palace("MysorePalace","Mysore",1000);
        System.out.println(palace);
        System.out.println("assigned hashCode : "+palace.hashCode());
        System.out.println("default : "+System.identityHashCode(palace));
        Palace palace1 = new Palace("BangalorePalace","bangalore",550);
        System.out.println("Both palace name and location are same : "+palace.equals(palace1));

        System.out.println();
        System.out.println("-------------------38----------------------------------");
        Temple temple = new Temple("Marikamba","Sirsi",50);
        System.out.println(temple);
        System.out.println("assigned hashCode : "+temple.hashCode());
        System.out.println("default : "+System.identityHashCode(temple));
        Temple temple1 = new Temple("Guruvayur","Kerala",200);
        System.out.println("Both temple name and location are same : "+temple.equals(temple1));

        System.out.println();
        System.out.println("-------------------39----------------------------------");
        Hospital hospital = new Hospital("AJ","Mangalore",8);
        System.out.println(hospital);
        System.out.println("assigned hashCode : "+hospital.hashCode());
        System.out.println("default : "+System.identityHashCode(hospital));
        Hospital hospital1 = new Hospital("AJ","Mangalore",8);
        System.out.println("Both hospital name and location are same : "+hospital.equals(hospital1));

        System.out.println();
        System.out.println("-------------------40----------------------------------");
        Camera camera = new Camera("Nikon","regular",80000);
        System.out.println(camera);
        System.out.println("assigned hashCode : "+camera.hashCode());
        System.out.println("default : "+System.identityHashCode(camera));
        Camera camera1 = new Camera("Canon","regular",85000);
        System.out.println("Both camera brand and type are same : "+camera.equals(camera1));

        System.out.println();
        System.out.println("-------------------41----------------------------------");
        Radio radio = new Radio("Sony","satelite",5000);
        System.out.println(radio);
        System.out.println("assigned hashCode : "+radio.hashCode());
        System.out.println("default : "+System.identityHashCode(radio));
        Radio radio1= new Radio("Sony","satelite",4000);
        System.out.println("Both radio brand and type are same : "+radio.equals(radio1));

        System.out.println();
        System.out.println("-------------------42----------------------------------");
        Speaker speaker = new Speaker("JBL","with Base",18000);
        System.out.println(speaker);
        System.out.println("assigned hashCode : "+speaker.hashCode());
        System.out.println("default : "+System.identityHashCode(speaker));
        Speaker speaker1 = new Speaker("Boat","bar speaker",6000);
        System.out.println("Both speaker has same brand and type : "+speaker.equals(speaker1));

        System.out.println();
        System.out.println("-------------------43----------------------------------");
        FitnessBand fitnessBand = new FitnessBand("mi","sports",5500);
        System.out.println(fitnessBand);
        System.out.println("assigned hashCode : "+fitnessBand.hashCode());
        System.out.println("default : "+System.identityHashCode(fitnessBand));
        FitnessBand fitnessBand1 = new FitnessBand("mi","sports",4500);
        System.out.println("Both fitness band brand and type are same : "+fitnessBand.equals(fitnessBand1));

        System.out.println();
        System.out.println("-------------------44----------------------------------");
        Powder powder = new Powder("Z","mens",150);
        System.out.println(powder);
        System.out.println("assigned hashCode : "+powder.hashCode());
        System.out.println("default : "+System.identityHashCode(powder));
        Powder powder1 = new Powder("Ponds","women",50);
        System.out.println("Both powder brand and type are same : "+powder.equals(powder1));

        System.out.println();
        System.out.println("-------------------45----------------------------------");
        Perfume perfume = new Perfume("Z","Gents",200);
        System.out.println(perfume);
        System.out.println("assigned hashCode : "+perfume.hashCode());
        System.out.println("default : "+System.identityHashCode(perfume));
        Perfume perfume1 = new Perfume("Z","Gents", 150);
        System.out.println("Both brand and type of perfume are same : "+perfume.equals(perfume1));

        System.out.println();
        System.out.println("-------------------46----------------------------------");
        Oil oil = new Oil("Parachute","coconut oil",50);
        System.out.println(oil);
        System.out.println("assigned hashCode : "+oil.hashCode());
        System.out.println("default : "+System.identityHashCode(oil));
        Oil oil1 = new Oil("Sunflower","cooking",80);
        System.out.println("Both oil brand and type are ame ; "+oil.equals(oil1));

        System.out.println();
        System.out.println("-------------------47----------------------------------");
        Moisturiser moisturiser = new Moisturiser("Nivya","soft skin",80);
        System.out.println(moisturiser);
        System.out.println("assigned hashCode : "+moisturiser.hashCode());
        System.out.println("default : "+System.identityHashCode(moisturiser));
        Moisturiser moisturiser1 = new Moisturiser("Nivya","soft skin",80);
        System.out.println("Both moisturizer brand and type are same : "+moisturiser.equals(moisturiser1));

        System.out.println();
        System.out.println("-------------------48----------------------------------");
        Electrolite electrolite = new Electrolite("Zest","energy drink",30);
        System.out.println(electrolite);
        System.out.println("assigned hashCode : "+electrolite.hashCode());
        System.out.println("default : "+System.identityHashCode(electrolite));
        Electrolite electrolite1 = new Electrolite("Zest","energy drink",50);
        System.out.println("Both Electrolite brand and type are same :" +electrolite.equals(electrolite1));

        System.out.println();
        System.out.println("-------------------49----------------------------------");
        SoftDrink softDrink = new SoftDrink("Coca Cola","cola drink",10);
        System.out.println(electrolite);
        System.out.println("assigned hashCode : "+softDrink.hashCode());
        System.out.println("default : "+System.identityHashCode(softDrink));
        SoftDrink softDrink1 = new SoftDrink("Pepsi","cola",15);
        System.out.println("Both softdrink brand and type are same : "+softDrink.equals(softDrink1));

        System.out.println();
        System.out.println("-------------------50----------------------------------");
        Water water = new Water("Bisleri",1,20);
        System.out.println(water);
        System.out.println("assigned hashCode : "+water.hashCode());
        System.out.println("default : "+System.identityHashCode(water));
        Water water1=new Water("Aqua",2,20);
        System.out.println("Both waterBottle brand and price are same : "+water.equals(water1));

        System.out.println();
        System.out.println("-------------------51----------------------------------");
        Bakery bakery = new Bakery("Ayangar","sirsi",9);
        System.out.println(bakery);
        System.out.println("assigned hashCode : "+bakery.hashCode());
        System.out.println("default : "+System.identityHashCode(bakery));
        Bakery bakery1 = new Bakery("Ayangar","sirsi",8);
        System.out.println("Both Bakery name and location are same : "+bakery.equals(bakery1));

        System.out.println();
        System.out.println("-------------------52----------------------------------");
        Jug jug = new Jug("Ajanta","Stainless steal",600);
        System.out.println(jug);
        System.out.println("assigned hashCode : "+jug.hashCode());
        System.out.println("default : "+System.identityHashCode(jug));
        Jug jug1 = new Jug("Ajanta","aluminium",800);
        System.out.println("Both Jug brand and material are same : "+jug.equals(jug1));

        System.out.println();
        System.out.println("-------------------53----------------------------------");
        EarBuds earBuds = new EarBuds("Boat","Black",1600);
        System.out.println(earBuds);
        System.out.println("assigned hashCode : "+earBuds.hashCode());
        System.out.println("default : "+System.identityHashCode(earBuds));
        EarBuds earBuds1 = new EarBuds("JBL","Black",3200);
        System.out.println("Both earBuds brand and color are same : "+earBuds.equals(earBuds1));

        System.out.println();
        System.out.println("-------------------54----------------------------------");
        Ornament ornament = new Ornament("Malabar","Gold",16000);
        System.out.println(ornament);
        System.out.println("assigned hashCode : "+ornament.hashCode());
        System.out.println("default : "+System.identityHashCode(ornament));
        Ornament ornament1= new Ornament("Malabar","Gold",18000);
        System.out.println("Both ornament brand and material are same : "+ornament.equals(ornament1));

        System.out.println();
        System.out.println("-------------------55----------------------------------");
        Art art = new Art("Monalisa","Da Vinchi",160000000);
        System.out.println(art);
        System.out.println("assigned hashCode : "+art.hashCode());
        System.out.println("default : "+System.identityHashCode(art));
        Art art1 = new Art("Sterry Night","vin",25600000);
        System.out.println("Both art name and artist are same : "+art.equals(art1));

        System.out.println();
        System.out.println("-------------------56----------------------------------");
        Sweet sweet = new Sweet("Mysore pac","Ghee",15);
        System.out.println(sweet);
        System.out.println("assigned hashCode : "+sweet.hashCode());
        System.out.println("default : "+System.identityHashCode(sweet));
        Sweet sweet1 = new Sweet("Doodh Peda","Milk",15);
        System.out.println("both sweet brand and ingredients are same : "+sweet.equals(sweet1));

        System.out.println();
        System.out.println("-------------------57----------------------------------");
        Wifi wifi = new Wifi("Dlink pac","PAN",5000);
        System.out.println(wifi);
        System.out.println("assigned hashCode : "+wifi.hashCode());
        System.out.println("default : "+System.identityHashCode(wifi));
        Wifi wifi1 = new Wifi("Dlink pac","PAN",4000);
        System.out.println("Both wifi brand and range are same : "+wifi.equals(wifi1));


        System.out.println();
        System.out.println("-------------------58----------------------------------");
        Bat bat = new Bat("Rebook",550,1500);
        System.out.println(bat);
        System.out.println("assigned hashCode : "+bat.hashCode());
        System.out.println("default : "+System.identityHashCode(bat));
        Bat bat1 = new Bat("SG",550,1500);
        System.out.println("Both bat brand and weight are same : "+bat.equals(bat1));


        System.out.println();
        System.out.println("-------------------59----------------------------------");
        SocialMedia socialMedia = new SocialMedia("Instagram","110mb",600);
        System.out.println(socialMedia);
        System.out.println("assigned hashCode : "+socialMedia.hashCode());
        System.out.println("default : "+System.identityHashCode(socialMedia));
        SocialMedia socialMedia1 = new SocialMedia("YouTube","160mb",700);
        System.out.println("Both SocialMedia appName and size are same : "+socialMedia.equals(socialMedia1));


        System.out.println();
        System.out.println("-------------------60----------------------------------");
        NewsPaper newsPaper = new NewsPaper("Vijayavani","Karnataka",5);
        System.out.println(newsPaper);
        System.out.println("assigned hashCode : "+newsPaper.hashCode());
        System.out.println("default : "+System.identityHashCode(newsPaper));
        NewsPaper newsPaper1 = new NewsPaper("Vijayavani","Karnataka",5);
        System.out.println("Both newspaper name and location are same : "+newsPaper.equals(newsPaper1));

        System.out.println();
        System.out.println("-------------------61----------------------------------");
        Cycle cycle = new Cycle("Herculus","Atom",5500);
        System.out.println(cycle);
        System.out.println("assigned hashCode : "+cycle.hashCode());
        System.out.println("default : "+System.identityHashCode(cycle));
        Cycle cycle1 = new Cycle("Rodio","s1",5500);
        System.out.println("Both cycles are same : "+cycle.equals(cycle1));


        System.out.println();
        System.out.println("-------------------62----------------------------------");
        Spec spec = new Spec("LensKart","yellow",6000);
        System.out.println(spec);
        System.out.println("assigned hashCode : "+spec.hashCode());
        System.out.println("default : "+System.identityHashCode(spec));
        Spec spec1 = new Spec("LensKart","Blue",5000);
        System.out.println("Both Specs are same : "+spec.equals(spec1));


        System.out.println();
        System.out.println("-------------------63----------------------------------");
        Sunglass sunglass = new Sunglass("Fastrack","fully tinted",3500);
        System.out.println(sunglass);
        System.out.println("assigned hashCode : "+sunglass.hashCode());
        System.out.println("default : "+System.identityHashCode(sunglass));
        Sunglass sunglass1 = new Sunglass("Fastrack","fully tinted",4500);
        System.out.println("Both Sunglasses are same : "+sunglass.equals(sunglass1));

        System.out.println();
        System.out.println("-------------------64----------------------------------");
        AC ac = new AC("Samsung",4,48000);
        System.out.println(ac);
        System.out.println("assigned hashCode : "+ac.hashCode());
        System.out.println("default : "+System.identityHashCode(ac));
        AC ac1 = new AC("Sony",4,48000);
        System.out.println("Both Ac are same : "+ac.equals(ac1));


        System.out.println();
        System.out.println("-------------------65----------------------------------");
        Snacks snacks = new Snacks("Lays","Spring Onion",10);
        System.out.println(snacks);
        System.out.println("assigned hashCode : "+snacks.hashCode());
        System.out.println("default : "+System.identityHashCode(snacks));
        Snacks snacks1 = new Snacks("Lays","Spring Onion",15);
        System.out.println("Both Snacks are same : "+snacks.equals(snacks1));

        System.out.println();
        System.out.println("-------------------66----------------------------------");
        Pizza pizza = new Pizza("Paneer cheese","Cheese",150);
        System.out.println(pizza);
        System.out.println("assigned hashCode : "+pizza.hashCode());
        System.out.println("default : "+System.identityHashCode(pizza));
        Pizza pizza1 = new Pizza("Paneer cheese","Cheese",150);
        System.out.println("Both Pizza are same : "+pizza.equals(pizza1));

        System.out.println();
        System.out.println("-------------------67----------------------------------");
        Burger burger = new Burger("Chicken Burger","Chicken",150);
        System.out.println(burger);
        System.out.println("assigned hashCode : "+paste.hashCode());
        System.out.println("default : "+System.identityHashCode(paste));
        Burger burger1 = new Burger("Chicken Burger","Chicken",170);
        System.out.println("Both burgers are same : "+burger.equals(burger1));


        System.out.println();
        System.out.println("-------------------68----------------------------------");
        Door door = new Door("wood","brown",45000);
        System.out.println(door);
        System.out.println("assigned hashCode : "+door.hashCode());
        System.out.println("default : "+System.identityHashCode(door));
        Door door1 = new Door("wood","Dark brown",45000);
        System.out.println("Both Doors are same : "+door.equals(door1));

        System.out.println();
        System.out.println("-------------------69----------------------------------");
        PowerBank powerBank = new PowerBank("mi",5000,1500);
        System.out.println(powerBank);
        System.out.println("assigned hashCode : "+powerBank.hashCode());
        System.out.println("default : "+System.identityHashCode(powerBank));
        PowerBank powerBank1 = new PowerBank("mi",5000,1500);
        System.out.println("Both PowerBank are same : "+powerBank.equals(powerBank1));

        System.out.println();
        System.out.println("-------------------70----------------------------------");
        TV tv = new TV("Sony", 55, 55000);
        System.out.println(tv);
        System.out.println("assigned hashCode : "+tv.hashCode());
        System.out.println("default : "+System.identityHashCode(tv));
        TV tv1 = new TV("Onida", 55, 55000);
        System.out.println("Both TV are same : "+tv.equals(tv1));

        System.out.println();
        System.out.println("-------------------71----------------------------------");
        Tablet tablet = new Tablet("Samsung", 6, 20000);
        System.out.println(tablet);
        System.out.println("assigned hashCode : "+tablet.hashCode());
        System.out.println("default : "+System.identityHashCode(tablet));
        Tablet tablet1 = new Tablet("Samsung", 6, 20000);
        System.out.println("Both Tablet are same : "+tablet.equals(tablet1));

        System.out.println();
        System.out.println("-------------------72----------------------------------");
        Projector projector = new Projector("BenQ", "Full HD", 45000);
        System.out.println(projector);
        System.out.println("assigned hashCode : "+projector.hashCode());
        System.out.println("default : "+System.identityHashCode(projector));
        Projector projector1 = new Projector("Epson", "Full HD", 45000);
        System.out.println("Both projectors are same : "+projector.equals(projector1));

        System.out.println();
        System.out.println("-------------------73----------------------------------");
        TabletStand tabletStand = new TabletStand("Metal", "Black", 500);
        System.out.println(tabletStand);
        System.out.println("assigned hashCode : "+tabletStand.hashCode());
        System.out.println("default : "+System.identityHashCode(tabletStand));
        TabletStand tabletStand1 = new TabletStand("Metal", "Black", 500);
        System.out.println("Both tableStands are same : "+tabletStand.equals(tabletStand1));

        System.out.println();
        System.out.println("-------------------74----------------------------------");
        Webcam webcam = new Webcam("Logitech", "1080p", 3000);
        System.out.println(webcam);
        System.out.println("assigned hashCode : "+webcam.hashCode());
        System.out.println("default : "+System.identityHashCode(webcam));
        Webcam webcam1 = new Webcam("Logitech", "720p", 3000);
        System.out.println("Both Webcam are same : "+webcam.equals(webcam1));

        System.out.println();
        System.out.println("-------------------75----------------------------------");
        Router router = new Router("TP-Link", 300, 1200);
        System.out.println(router);
        System.out.println("assigned hashCode : "+router.hashCode());
        System.out.println("default : "+System.identityHashCode(router));
        Router router1 = new Router("TP-Link", 300, 1200);
        System.out.println("Both router are same : "+router.equals(router1));

        System.out.println();
        System.out.println("-------------------76----------------------------------");
        Tripod tripod = new Tripod("AmazonBasics", 170, 900);
        System.out.println(tripod);
        System.out.println("assigned hashCode : "+tripod.hashCode());
        System.out.println("default : "+System.identityHashCode(tripod));
        Tripod tripod1 = new Tripod("AmazonBasics", 190, 900);
        System.out.println("Both Tripods are same : "+tripod.equals(tripod1));

        System.out.println();
        System.out.println("-------------------77----------------------------------");
        Mic mic = new Mic("Condenser", "Blue", 4500);
        System.out.println(mic);
        System.out.println("assigned hashCode : "+paste.hashCode());
        System.out.println("default : "+System.identityHashCode(paste));
        Mic mic1 = new Mic("Condenser", "Blue", 4500);
        System.out.println("Both mic are same : "+mic.equals(mic1));

        System.out.println();
        System.out.println("-------------------78----------------------------------");
        Stabilizer stabilizer = new Stabilizer("V-Guard", 230, 2500);
        System.out.println(stabilizer);
        System.out.println("assigned hashCode : "+stabilizer.hashCode());
        System.out.println("default : "+System.identityHashCode(stabilizer));
        Stabilizer stabilizer1 = new Stabilizer("V-Guard", 260, 2500);
        System.out.println("Both stabilizer are same : "+stabilizer.equals(stabilizer1));

        System.out.println();
        System.out.println("-------------------79----------------------------------");
        Inverter inverter = new Inverter("Exide", 4, 18000);
        System.out.println(inverter);
        System.out.println("assigned hashCode : "+inverter.hashCode());
        System.out.println("default : "+System.identityHashCode(inverter));
        Inverter inverter1 = new Inverter("Exide", 4, 18000);
        System.out.println("Both inverters are same : "+inverter.equals(inverter1));

        System.out.println();
        System.out.println("-------------------80----------------------------------");
        Mirror mirror = new Mirror("Oval", "Wall-mounted", 600);
        System.out.println(mirror);
        System.out.println("assigned hashCode : "+mirror.hashCode());
        System.out.println("default : "+System.identityHashCode(mirror));
        Mirror mirror1 = new Mirror("Oval", "Wall-mounted", 800);
        System.out.println("Both mirrors are same : "+mirror.equals(mirror1));

        System.out.println();
        System.out.println("-------------------81----------------------------------");
        Mouse mouse = new Mouse("Logitech", "Wireless", 1200);
        System.out.println(mouse);
        System.out.println("assigned hashCode : "+mouse.hashCode());
        System.out.println("default : "+System.identityHashCode(mouse));
        Mouse mouse1 = new Mouse("Logitech", "Wired", 1200);
        System.out.println("Both mouse are same : "+mouse.equals(mouse1));

        System.out.println();
        System.out.println("-------------------82----------------------------------");
        Keyboard keyboard = new Keyboard("Dell", "QWERTY", 1500);
        System.out.println(keyboard);
        System.out.println("assigned hashCode : "+keyboard.hashCode());
        System.out.println("default : "+System.identityHashCode(keyboard));
        Keyboard keyboard1 = new Keyboard("Dell", "QWERTY", 1500);
        System.out.println("Both Keyboard are same : "+keyboard.equals(keyboard1));

        System.out.println();
        System.out.println("-------------------83----------------------------------");
        Television television = new Television("Sony", 42, 45000);
        System.out.println(television);
        System.out.println("assigned hashCode : "+television.hashCode());
        System.out.println("default : "+System.identityHashCode(television));
        Television television1 = new Television("Sony", 42, 45000);
        System.out.println("Both Television are same : "+television.equals(television1));


        System.out.println();
        System.out.println("-------------------84----------------------------------");
        Table table = new Table("Wood", "Brown", 2500);
        System.out.println(table);
        System.out.println("assigned hashCode : "+table.hashCode());
        System.out.println("default : "+System.identityHashCode(table));
        Table table1 = new Table("Wood", "red", 2500);
        System.out.println("Both Table are same : "+table.equals(table1));

        System.out.println();
        System.out.println("-------------------85----------------------------------");
        Chair chair = new Chair("Office", "Plastic", 800);
        System.out.println(chair);
        System.out.println("assigned hashCode : "+chair.hashCode());
        System.out.println("default : "+System.identityHashCode(chair));
        Chair chair1 = new Chair("Office", "Plastic", 1000);
        System.out.println("Both Chair are same : "+chair.equals(chair1));

        System.out.println();
        System.out.println("-------------------86----------------------------------");
        Cup cup = new Cup("Ceramic", "White", 150);
        System.out.println(cup);
        System.out.println("assigned hashCode : "+cup.hashCode());
        System.out.println("default : "+System.identityHashCode(cup));
        Cup cup1 = new Cup("Ceramic", "Black", 150);
        System.out.println("Both cup are same : "+cup.equals(cup1));

        System.out.println();
        System.out.println("-------------------87----------------------------------");
        PenDrive penDrive = new PenDrive("Sandisk", 64, 700);
        System.out.println(penDrive);
        System.out.println("assigned hashCode : "+penDrive.hashCode());
        System.out.println("default : "+System.identityHashCode(penDrive));
        PenDrive penDrive1 = new PenDrive("Sandisk", 128, 700);
        System.out.println("Both Pendrive are same : "+penDrive.equals(penDrive1));

        System.out.println();
        System.out.println("-------------------88----------------------------------");
        Monitor monitor = new Monitor("LG", 24, 9000);
        System.out.println(monitor);
        System.out.println("assigned hashCode : "+monitor.hashCode());
        System.out.println("default : "+System.identityHashCode(monitor));
        Monitor monitor1 = new Monitor("LG", 24, 9000);
        System.out.println("Both Monitor are same : "+monitor.equals(monitor1));

        System.out.println();
        System.out.println("-------------------89----------------------------------");
        Wallet wallet = new Wallet("Levis", "Leather", 1200);
        System.out.println(wallet);
        System.out.println("assigned hashCode : "+wallet.hashCode());
        System.out.println("default : "+System.identityHashCode(wallet));
        Wallet wallet1 = new Wallet("Levis", "Leather", 1500);
        System.out.println("Both Monitor are same : "+wallet.equals(wallet1));

        System.out.println();
        System.out.println("-------------------90----------------------------------");
        FanRemote fanRemote = new FanRemote("Havells", 15, 500);
        System.out.println(fanRemote);
        System.out.println("assigned hashCode : "+fanRemote.hashCode());
        System.out.println("default : "+System.identityHashCode(fanRemote));
        FanRemote fanRemote1 = new FanRemote("Havells", 20, 500);
        System.out.println("Both Fan remote are same : "+fanRemote.equals(fanRemote1));

        System.out.println();
        System.out.println("-------------------91----------------------------------");
        Lamp lamp = new Lamp("Table", "Yellow", 750);
        System.out.println(lamp);
        System.out.println("assigned hashCode : "+lamp.hashCode());
        System.out.println("default : "+System.identityHashCode(lamp));
        Lamp lamp1 = new Lamp("Table", "White", 750);
        System.out.println("Both Lamp are same : "+lamp.equals(lamp1));

        System.out.println();
        System.out.println("-------------------92----------------------------------");
        Frame frame = new Frame("A4", "Wood", 300);
        System.out.println(frame);
        System.out.println("assigned hashCode : "+frame.hashCode());
        System.out.println("default : "+System.identityHashCode(frame));
        Frame frame1 = new Frame("A3", "Wood", 300);
        System.out.println("Both Frame are same : "+frame.equals(frame1 ));

        System.out.println();
        System.out.println("-------------------93----------------------------------");
        Clock clock = new Clock("Titan", "Wall", 1200);
        System.out.println(clock);
        System.out.println("assigned hashCode : "+clock.hashCode());
        System.out.println("default : "+System.identityHashCode(clock));
        Clock clock1 = new Clock("Titan", "Wall", 1200);
        System.out.println("Both clock are same : "+clock.equals(clock1));

        System.out.println();
        System.out.println("-------------------94----------------------------------");
        FanStand fanStand = new FanStand("Bajaj", 120, 2000);
        System.out.println(fanStand);
        System.out.println("assigned hashCode : "+fanStand.hashCode());
        System.out.println("default : "+System.identityHashCode(fanStand));
        FanStand fanStand1 = new FanStand("Bajaj", 120, 3000);
        System.out.println("Both FanStand are same : "+fanStand.equals(fanStand1));

        System.out.println();
        System.out.println("-------------------95----------------------------------");
        BagPack bagPack = new BagPack("SkyBag", 35, 1800);
        System.out.println(bagPack);
        System.out.println("assigned hashCode : "+bagPack.hashCode());
        System.out.println("default : "+System.identityHashCode(bagPack));
        BagPack bagPack1 = new BagPack("SkyBag", 35, 1800);
        System.out.println("Both FanStand are same : "+bagPack.equals(bagPack1));

        System.out.println();
        System.out.println("-------------------96----------------------------------");
        PowerPlug powerPlug = new PowerPlug("Type-C", 220, 250);
        System.out.println(powerPlug);
        System.out.println("assigned hashCode : "+powerPlug.hashCode());
        System.out.println("default : "+System.identityHashCode(powerPlug));
        PowerPlug powerPlug1 = new PowerPlug("Type-C", 220, 250);
        System.out.println("Both PowerPlug are same : "+powerPlug.equals(powerPlug1));

        System.out.println();
        System.out.println("-------------------97----------------------------------");
        Ink ink = new Ink("Blue", "Camlin", 30);
        System.out.println(ink);
        System.out.println("assigned hashCode : "+ink.hashCode());
        System.out.println("default : "+System.identityHashCode(ink));
        Ink ink1 = new Ink("Black", "Camlin", 30);
        System.out.println("Both Ink are same : "+ink.equals(ink1));

        System.out.println();
        System.out.println("-------------------98----------------------------------");
        SketchBook sketchBook = new SketchBook("Brustro", 100, 180);
        System.out.println(sketchBook);
        System.out.println("assigned hashCode : "+sketchBook.hashCode());
        System.out.println("default : "+System.identityHashCode(sketchBook));
        SketchBook sketchBook1 = new SketchBook("Brustro", 100, 180);
        System.out.println("Both sketchBook are same : "+sketchBook.equals(sketchBook1));

        System.out.println();
        System.out.println("-------------------99----------------------------------");
        Globe globe = new Globe("Medium", "Blue", 900);
        System.out.println(globe);
        System.out.println("assigned hashCode : "+globe.hashCode());
        System.out.println("default : "+System.identityHashCode(globe));
        Globe globe1 = new Globe("Large", "Blue", 900);
        System.out.println("Both sketchBook are same : "+globe.equals(globe1));

        System.out.println();
        System.out.println("-------------------100----------------------------------");
        Smartwatch smartwatch = new Smartwatch("Boat", "160", 2400);
        System.out.println(smartwatch);
        System.out.println("assigned hashCode : "+smartwatch.hashCode());
        System.out.println("default : "+System.identityHashCode(smartwatch));
        Smartwatch smartwatch1 = new Smartwatch("Boat", "160", 2400);
        System.out.println("Both sketchBook are same : "+smartwatch.equals(smartwatch1));

    }
}
