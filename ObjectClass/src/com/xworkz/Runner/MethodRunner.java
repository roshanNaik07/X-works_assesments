package com.xworkz.Runner;

import com.xworkz.internal.*;

public class MethodRunner {
    public static void main(String[] args) {

        System.out.println("-------------------1----------------------------------");
        Bag bag = new Bag("WildCraft","Green",1200);
        System.out.println(bag);
        System.out.println("assigned hashCode : "+bag.hashCode());
        System.out.println("default : "+System.identityHashCode(bag));

        System.out.println();
        System.out.println("-------------------2----------------------------------");
        Laptop laptop = new Laptop("Acer","black",1200);
        System.out.println(laptop);
        System.out.println("assigned hashCode : "+laptop.hashCode());
        System.out.println("default : "+System.identityHashCode(laptop));

        System.out.println();
        System.out.println("-------------------3----------------------------------");
        Charger charger = new Charger("Asus",7,1200);
        System.out.println(charger);
        System.out.println("assigned hashCode : "+charger.hashCode());
        System.out.println("default : "+System.identityHashCode(charger));

        System.out.println();
        System.out.println("-------------------4----------------------------------");
        Phone phone = new Phone("Redmi","Gaming",20000);
        System.out.println(phone);
        System.out.println("assigned hashCode : "+phone.hashCode());
        System.out.println("default : "+System.identityHashCode(phone));

        System.out.println();
        System.out.println("-------------------5----------------------------------");
        Screen screen = new Screen("Samsung","Large",8000);
        System.out.println(screen);
        System.out.println("assigned hashCode : "+screen.hashCode());
        System.out.println("default : "+System.identityHashCode(screen));

        System.out.println();
        System.out.println("-------------------6----------------------------------");
        Bottle bottle = new Bottle(1,"Blue",100);
        System.out.println(bottle);
        System.out.println("assigned hashCode : "+bottle.hashCode());
        System.out.println("default : "+System.identityHashCode(bottle));

        System.out.println();
        System.out.println("-------------------7----------------------------------");
        Shirt shirt = new Shirt("US POLO","White",1500);
        System.out.println(shirt);
        System.out.println("assigned hashCode : "+shirt.hashCode());
        System.out.println("default : "+System.identityHashCode(shirt));

        System.out.println();
        System.out.println("-------------------8----------------------------------");
        Belt belt = new Belt("Lewis","Leather",1000);
        System.out.println(belt);
        System.out.println("assigned hashCode : "+belt.hashCode());
        System.out.println("default : "+System.identityHashCode(belt));

        System.out.println();
        System.out.println("-------------------9----------------------------------");
        Shoe shoe = new Shoe("Puma",9,2800);
        System.out.println(shoe);
        System.out.println("assigned hashCode : "+shoe.hashCode());
        System.out.println("default : "+System.identityHashCode(shoe));

        System.out.println();
        System.out.println("-------------------10----------------------------------");
        Slider slider = new Slider("Adidas",8,1500);
        System.out.println(slider);
        System.out.println("assigned hashCode : "+slider.hashCode());
        System.out.println("default : "+System.identityHashCode(slider));

        System.out.println();
        System.out.println("-------------------11----------------------------------");
        NoteBook noteBook = new NoteBook("Classmate",200,80);
        System.out.println(noteBook);
        System.out.println("assigned hashCode : "+noteBook.hashCode());
        System.out.println("default : "+System.identityHashCode(noteBook));

        System.out.println();
        System.out.println("-------------------12----------------------------------");
        Fan fan = new Fan("Bajaj","Brown",1500);
        System.out.println(fan);
        System.out.println(noteBook);
        System.out.println("assigned hashCode : "+fan.hashCode());
        System.out.println("default : "+System.identityHashCode(fan));

        System.out.println();
        System.out.println("-------------------13----------------------------------");
        IronBox ironBox = new IronBox("Usha","white",1200);
        System.out.println(ironBox);
        System.out.println("assigned hashCode : "+ironBox.hashCode());
        System.out.println("default : "+System.identityHashCode(ironBox));

        System.out.println();
        System.out.println("-------------------14----------------------------------");
        Bike bike = new Bike("Pulsur",200,120000);
        System.out.println(bike);
        System.out.println("assigned hashCode : "+bike.hashCode());
        System.out.println("default : "+System.identityHashCode(bike));

        System.out.println();
        System.out.println("-------------------15----------------------------------");
        WashingMachine washingMachine = new WashingMachine("LG","Automatic",30000);
        System.out.println(washingMachine);
        System.out.println("assigned hashCode : "+washingMachine.hashCode());
        System.out.println("default : "+System.identityHashCode(washingMachine));

        System.out.println();
        System.out.println("-------------------16----------------------------------");
        Pen pen = new Pen("Bright","Black",5);
        System.out.println(pen);
        System.out.println("assigned hashCode : "+pen.hashCode());
        System.out.println("default : "+System.identityHashCode(pen));

        System.out.println();
        System.out.println("-------------------17----------------------------------");
        Pencil pencil = new Pencil("Domz","4b",15);
        System.out.println(pencil);
        System.out.println("assigned hashCode : "+pencil.hashCode());
        System.out.println("default : "+System.identityHashCode(pencil));

        System.out.println();
        System.out.println("-------------------18----------------------------------");
        ColorPencil colorPencil = new ColorPencil("FibreCastle","red",20);
        System.out.println(colorPencil);
        System.out.println("assigned hashCode : "+colorPencil.hashCode());
        System.out.println("default : "+System.identityHashCode(colorPencil));

        System.out.println();
        System.out.println("-------------------19----------------------------------");
        Eraser eraser = new Eraser("Nataraj","white",3);
        System.out.println(eraser);
        System.out.println("assigned hashCode : "+eraser.hashCode());
        System.out.println("default : "+System.identityHashCode(eraser));

        System.out.println();
        System.out.println("-------------------20----------------------------------");
        Sharpner sharpner = new Sharpner("Apsara","blue",5);
        System.out.println(sharpner);
        System.out.println("assigned hashCode : "+sharpner.hashCode());
        System.out.println("default : "+System.identityHashCode(sharpner));

        System.out.println();
        System.out.println("-------------------21----------------------------------");
        Watch watch = new Watch("Fastrack","casual",2700);
        System.out.println(watch);
        System.out.println("assigned hashCode : "+watch.hashCode());
        System.out.println("default : "+System.identityHashCode(watch));

        System.out.println();
        System.out.println("-------------------22----------------------------------");
        DeliveryApp deliveryApp = new DeliveryApp("Zepto",15,25);
        System.out.println(deliveryApp);
        System.out.println("assigned hashCode : "+deliveryApp.hashCode());
        System.out.println("default : "+System.identityHashCode(deliveryApp));

        System.out.println();
        System.out.println("-------------------23----------------------------------");
        Music music = new Music("Spotify",120,66);
        System.out.println(music);
        System.out.println("assigned hashCode : "+music.hashCode());
        System.out.println("default : "+System.identityHashCode(music));

        System.out.println();
        System.out.println("-------------------24----------------------------------");
        Bucket bucket = new Bucket("Joyo","Brown",200);
        System.out.println(bucket);
        System.out.println("assigned hashCode : "+bucket.hashCode());
        System.out.println("default : "+System.identityHashCode(bucket));

        System.out.println();
        System.out.println("-------------------25----------------------------------");
        Facewash facewash = new Facewash("Garnier","Charcoal",180);
        System.out.println(facewash);
        System.out.println("assigned hashCode : "+facewash.hashCode());
        System.out.println("default : "+System.identityHashCode(facewash));

        System.out.println();
        System.out.println("-------------------26----------------------------------");
        Soap soap = new Soap("Mysore sandle","Sandlewood",80);
        System.out.println(soap);
        System.out.println("assigned hashCode : "+soap.hashCode());
        System.out.println("default : "+System.identityHashCode(soap));

        System.out.println();
        System.out.println("-------------------27----------------------------------");
        Paste paste = new Paste("Colgate","Mint",60);
        System.out.println(paste);
        System.out.println("assigned hashCode : "+paste.hashCode());
        System.out.println("default : "+System.identityHashCode(paste));

        System.out.println();
        System.out.println("-------------------28----------------------------------");
        Sampoo sampoo = new Sampoo("Traceme","Lime",160);
        System.out.println(sampoo);
        System.out.println("assigned hashCode : "+sampoo.hashCode());
        System.out.println("default : "+System.identityHashCode(sampoo));

        System.out.println();
        System.out.println("-------------------29----------------------------------");
        Brush brush = new Brush("Sensudine","Hard",160);
        System.out.println(brush);
        System.out.println("assigned hashCode : "+brush.hashCode());
        System.out.println("default : "+System.identityHashCode(brush));

        System.out.println();
        System.out.println("-------------------30----------------------------------");
        BodyWash bodyWash = new BodyWash("Pears","glicerin",200);
        System.out.println(bodyWash);
        System.out.println("assigned hashCode : "+bodyWash.hashCode());
        System.out.println("default : "+System.identityHashCode(bodyWash));

        System.out.println();
        System.out.println("-------------------31----------------------------------");
        Mug mug = new Mug("joyo","grey",70);
        System.out.println(mug);
        System.out.println("assigned hashCode : "+mug.hashCode());
        System.out.println("default : "+System.identityHashCode(mug));

        System.out.println();
        System.out.println("-------------------32----------------------------------");
        Tshirt tshirt = new Tshirt("polo","Black",250);
        System.out.println(tshirt);
        System.out.println("assigned hashCode : "+tshirt.hashCode());
        System.out.println("default : "+System.identityHashCode(tshirt));

        System.out.println();
        System.out.println("-------------------33----------------------------------");
        SuitCase suitCase = new SuitCase("Arrow","Red",5000);
        System.out.println(suitCase);
        System.out.println("assigned hashCode : "+suitCase.hashCode());
        System.out.println("default : "+System.identityHashCode(suitCase));

        System.out.println();
        System.out.println("-------------------34----------------------------------");
        Park park = new Park("Kadri","KPT",7);
        System.out.println(park);
        System.out.println("assigned hashCode : "+park.hashCode());
        System.out.println("default : "+System.identityHashCode(park));

        System.out.println();
        System.out.println("-------------------35----------------------------------");
        Restorent restorent = new Restorent("K9","KPT",7);
        System.out.println(restorent);
        System.out.println("assigned hashCode : "+restorent.hashCode());
        System.out.println("default : "+System.identityHashCode(restorent));

        System.out.println();
        System.out.println("-------------------36----------------------------------");
        Hotel hotel = new Hotel("Samrat","sirsi",10);
        System.out.println(hotel);
        System.out.println("assigned hashCode : "+hotel.hashCode());
        System.out.println("default : "+System.identityHashCode(hotel));

        System.out.println();
        System.out.println("-------------------37----------------------------------");
        Palace palace = new Palace("MysorePalace","Mysore",1000);
        System.out.println(palace);
        System.out.println("assigned hashCode : "+palace.hashCode());
        System.out.println("default : "+System.identityHashCode(palace));

        System.out.println();
        System.out.println("-------------------38----------------------------------");
        Temple temple = new Temple("Marikamba","Sirsi",50);
        System.out.println(temple);
        System.out.println("assigned hashCode : "+temple.hashCode());
        System.out.println("default : "+System.identityHashCode(temple));

        System.out.println();
        System.out.println("-------------------39----------------------------------");
        Hospital hospital = new Hospital("AJ","Mangalore",8);
        System.out.println(hospital);
        System.out.println("assigned hashCode : "+hospital.hashCode());
        System.out.println("default : "+System.identityHashCode(hospital));

        System.out.println();
        System.out.println("-------------------40----------------------------------");
        Camera camera = new Camera("Nikon","regular",80000);
        System.out.println(camera);
        System.out.println("assigned hashCode : "+camera.hashCode());
        System.out.println("default : "+System.identityHashCode(camera));

        System.out.println();
        System.out.println("-------------------41----------------------------------");
        Radio radio = new Radio("Sony","satelite",5000);
        System.out.println(radio);
        System.out.println("assigned hashCode : "+radio.hashCode());
        System.out.println("default : "+System.identityHashCode(radio));

        System.out.println();
        System.out.println("-------------------42----------------------------------");
        Speaker speaker = new Speaker("JBL","with Base",18000);
        System.out.println(speaker);
        System.out.println("assigned hashCode : "+speaker.hashCode());
        System.out.println("default : "+System.identityHashCode(speaker));

        System.out.println();
        System.out.println("-------------------43----------------------------------");
        FitnessBand fitnessBand = new FitnessBand("mi","sports",5500);
        System.out.println(fitnessBand);
        System.out.println("assigned hashCode : "+fitnessBand.hashCode());
        System.out.println("default : "+System.identityHashCode(fitnessBand));

        System.out.println();
        System.out.println("-------------------44----------------------------------");
        Powder powder = new Powder("Z","mens",150);
        System.out.println(powder);
        System.out.println("assigned hashCode : "+powder.hashCode());
        System.out.println("default : "+System.identityHashCode(powder));

        System.out.println();
        System.out.println("-------------------45----------------------------------");
        Perfume perfume = new Perfume("Z","Gents",200);
        System.out.println(perfume);
        System.out.println("assigned hashCode : "+perfume.hashCode());
        System.out.println("default : "+System.identityHashCode(perfume));

        System.out.println();
        System.out.println("-------------------46----------------------------------");
        Oil oil = new Oil("Parachute","coconut oil",50);
        System.out.println(oil);
        System.out.println("assigned hashCode : "+oil.hashCode());
        System.out.println("default : "+System.identityHashCode(oil));

        System.out.println();
        System.out.println("-------------------47----------------------------------");
        Moisturiser moisturiser = new Moisturiser("Nivya","soft skin",80);
        System.out.println(moisturiser);
        System.out.println("assigned hashCode : "+moisturiser.hashCode());
        System.out.println("default : "+System.identityHashCode(moisturiser));

        System.out.println();
        System.out.println("-------------------48----------------------------------");
        Electrolite electrolite = new Electrolite("Zest","energy drink",30);
        System.out.println(electrolite);
        System.out.println("assigned hashCode : "+electrolite.hashCode());
        System.out.println("default : "+System.identityHashCode(electrolite));

        System.out.println();
        System.out.println("-------------------49----------------------------------");
        SoftDrink softDrink = new SoftDrink("Coca Cola","cola drink",10);
        System.out.println(electrolite);
        System.out.println("assigned hashCode : "+softDrink.hashCode());
        System.out.println("default : "+System.identityHashCode(softDrink));

        System.out.println();
        System.out.println("-------------------50----------------------------------");
        Water water = new Water("Bisleri",1,20);
        System.out.println(water);
        System.out.println("assigned hashCode : "+water.hashCode());
        System.out.println("default : "+System.identityHashCode(water));

        System.out.println();
        System.out.println("-------------------51----------------------------------");
        Bakery bakery = new Bakery("Ayangar","sirsi",9);
        System.out.println(bakery);
        System.out.println("assigned hashCode : "+bakery.hashCode());
        System.out.println("default : "+System.identityHashCode(bakery));

        System.out.println();
        System.out.println("-------------------52----------------------------------");
        Jug jug = new Jug("Ajanta","Stainless steal",600);
        System.out.println(jug);
        System.out.println("assigned hashCode : "+jug.hashCode());
        System.out.println("default : "+System.identityHashCode(jug));

        System.out.println();
        System.out.println("-------------------53----------------------------------");
        EarBuds earBuds = new EarBuds("Boat","Black",1600);
        System.out.println(earBuds);
        System.out.println("assigned hashCode : "+earBuds.hashCode());
        System.out.println("default : "+System.identityHashCode(earBuds));

        System.out.println();
        System.out.println("-------------------54----------------------------------");
        Ornament ornament = new Ornament("Malabar","Gold",16000);
        System.out.println(ornament);
        System.out.println("assigned hashCode : "+ornament.hashCode());
        System.out.println("default : "+System.identityHashCode(ornament));

        System.out.println();
        System.out.println("-------------------55----------------------------------");
        Art art = new Art("Monalisa","Da Vinchi",160000000);
        System.out.println(art);
        System.out.println("assigned hashCode : "+art.hashCode());
        System.out.println("default : "+System.identityHashCode(art));

        System.out.println();
        System.out.println("-------------------56----------------------------------");
        Sweet sweet = new Sweet("Mysore pac","Ghee",15);
        System.out.println(sweet);
        System.out.println("assigned hashCode : "+sweet.hashCode());
        System.out.println("default : "+System.identityHashCode(sweet));

        System.out.println();
        System.out.println("-------------------57----------------------------------");
        Wifi wifi = new Wifi("Dlink pac","PAN",5000);
        System.out.println(wifi);
        System.out.println("assigned hashCode : "+wifi.hashCode());
        System.out.println("default : "+System.identityHashCode(wifi));

        System.out.println();
        System.out.println("-------------------58----------------------------------");
        Bat bat = new Bat("Rebook",550,1500);
        System.out.println(bat);
        System.out.println("assigned hashCode : "+bat.hashCode());
        System.out.println("default : "+System.identityHashCode(bat));

        System.out.println();
        System.out.println("-------------------59----------------------------------");
        SocialMedia socialMedia = new SocialMedia("Instagram","110mb",600);
        System.out.println(socialMedia);
        System.out.println("assigned hashCode : "+socialMedia.hashCode());
        System.out.println("default : "+System.identityHashCode(socialMedia));

        System.out.println();
        System.out.println("-------------------60----------------------------------");
        NewsPaper newsPaper = new NewsPaper("Vijayavani","Karnataka",5);
        System.out.println(newsPaper);
        System.out.println("assigned hashCode : "+newsPaper.hashCode());
        System.out.println("default : "+System.identityHashCode(newsPaper));

        System.out.println();
        System.out.println("-------------------61----------------------------------");
        Cycle cycle = new Cycle("Herculus","Atom",5500);
        System.out.println(cycle);
        System.out.println("assigned hashCode : "+cycle.hashCode());
        System.out.println("default : "+System.identityHashCode(cycle));

        System.out.println();
        System.out.println("-------------------62----------------------------------");
        Spec spec = new Spec("LensKart","yellow",6000);
        System.out.println(spec);
        System.out.println("assigned hashCode : "+spec.hashCode());
        System.out.println("default : "+System.identityHashCode(spec));

        System.out.println();
        System.out.println("-------------------63----------------------------------");
        Sunglass sunglass = new Sunglass("Fastrack","fully tinted",3500);
        System.out.println(sunglass);
        System.out.println("assigned hashCode : "+sunglass.hashCode());
        System.out.println("default : "+System.identityHashCode(sunglass));

        System.out.println();
        System.out.println("-------------------64----------------------------------");
        AC ac = new AC("Samsung",4,48000);
        System.out.println(ac);
        System.out.println("assigned hashCode : "+ac.hashCode());
        System.out.println("default : "+System.identityHashCode(ac));

        System.out.println();
        System.out.println("-------------------65----------------------------------");
        Snacks snacks = new Snacks("Lays","Spring Onion",10);
        System.out.println(snacks);
        System.out.println("assigned hashCode : "+snacks.hashCode());
        System.out.println("default : "+System.identityHashCode(snacks));

        System.out.println();
        System.out.println("-------------------66----------------------------------");
        Pizza pizza = new Pizza("Paneer cheese","Cheese",150);
        System.out.println(pizza);
        System.out.println("assigned hashCode : "+pizza.hashCode());
        System.out.println("default : "+System.identityHashCode(pizza));

        System.out.println();
        System.out.println("-------------------67----------------------------------");
        Burger burger = new Burger("Chicken Burger","Chicken",150);
        System.out.println(burger);
        System.out.println("assigned hashCode : "+paste.hashCode());
        System.out.println("default : "+System.identityHashCode(paste));

        System.out.println();
        System.out.println("-------------------68----------------------------------");
        Door door = new Door("wood","brown",45000);
        System.out.println(door);
        System.out.println("assigned hashCode : "+door.hashCode());
        System.out.println("default : "+System.identityHashCode(door));

        System.out.println();
        System.out.println("-------------------69----------------------------------");
        PowerBank powerBank = new PowerBank("mi",5000,1500);
        System.out.println(powerBank);
        System.out.println("assigned hashCode : "+powerBank.hashCode());
        System.out.println("default : "+System.identityHashCode(powerBank));

        System.out.println();
        System.out.println("-------------------70----------------------------------");
        TV tv = new TV("Sony", 55, 55000);
        System.out.println(tv);
        System.out.println("assigned hashCode : "+tv.hashCode());
        System.out.println("default : "+System.identityHashCode(tv));

        System.out.println();
        System.out.println("-------------------71----------------------------------");
        Tablet tablet = new Tablet("Samsung", 6, 20000);
        System.out.println(tablet);
        System.out.println("assigned hashCode : "+tablet.hashCode());
        System.out.println("default : "+System.identityHashCode(tablet));

        System.out.println();
        System.out.println("-------------------72----------------------------------");
        Projector projector = new Projector("BenQ", "Full HD", 45000);
        System.out.println(projector);
        System.out.println("assigned hashCode : "+projector.hashCode());
        System.out.println("default : "+System.identityHashCode(projector));

        System.out.println();
        System.out.println("-------------------73----------------------------------");
        TabletStand tabletStand = new TabletStand("Metal", "Black", 500);
        System.out.println(tabletStand);
        System.out.println("assigned hashCode : "+tabletStand.hashCode());
        System.out.println("default : "+System.identityHashCode(tabletStand));

        System.out.println();
        System.out.println("-------------------74----------------------------------");
        Webcam webcam = new Webcam("Logitech", "1080p", 3000);
        System.out.println(webcam);
        System.out.println("assigned hashCode : "+webcam.hashCode());
        System.out.println("default : "+System.identityHashCode(webcam));

        System.out.println();
        System.out.println("-------------------75----------------------------------");
        Router router = new Router("TP-Link", 300, 1200);
        System.out.println(router);
        System.out.println("assigned hashCode : "+router.hashCode());
        System.out.println("default : "+System.identityHashCode(router));

        System.out.println();
        System.out.println("-------------------76----------------------------------");
        Tripod tripod = new Tripod("AmazonBasics", 170, 900);
        System.out.println(tripod);
        System.out.println("assigned hashCode : "+tripod.hashCode());
        System.out.println("default : "+System.identityHashCode(tripod));

        System.out.println();
        System.out.println("-------------------77----------------------------------");
        Mic mic = new Mic("Condenser", "Blue", 4500);
        System.out.println(mic);
        System.out.println("assigned hashCode : "+paste.hashCode());
        System.out.println("default : "+System.identityHashCode(paste));

        System.out.println();
        System.out.println("-------------------78----------------------------------");
        Stabilizer stabilizer = new Stabilizer("V-Guard", 230, 2500);
        System.out.println(stabilizer);
        System.out.println("assigned hashCode : "+stabilizer.hashCode());
        System.out.println("default : "+System.identityHashCode(stabilizer));

        System.out.println();
        System.out.println("-------------------79----------------------------------");
        Inverter inverter = new Inverter("Exide", 4, 18000);
        System.out.println(inverter);
        System.out.println("assigned hashCode : "+inverter.hashCode());
        System.out.println("default : "+System.identityHashCode(inverter));

        System.out.println();
        System.out.println("-------------------80----------------------------------");
        Mirror mirror = new Mirror("Oval", "Wall-mounted", 600);
        System.out.println(mirror);
        System.out.println("assigned hashCode : "+mirror.hashCode());
        System.out.println("default : "+System.identityHashCode(mirror));

        System.out.println();
        System.out.println("-------------------81----------------------------------");
        Mouse mouse = new Mouse("Logitech", "Wireless", 1200);
        System.out.println(mouse);
        System.out.println("assigned hashCode : "+mouse.hashCode());
        System.out.println("default : "+System.identityHashCode(mouse));

        System.out.println();
        System.out.println("-------------------82----------------------------------");
        Keyboard keyboard = new Keyboard("Dell", "QWERTY", 1500);
        System.out.println(keyboard);
        System.out.println("assigned hashCode : "+keyboard.hashCode());
        System.out.println("default : "+System.identityHashCode(keyboard));

        System.out.println();
        System.out.println("-------------------83----------------------------------");
        Television television = new Television("Sony", 42, 45000);
        System.out.println(television);
        System.out.println("assigned hashCode : "+television.hashCode());
        System.out.println("default : "+System.identityHashCode(television));

        System.out.println();
        System.out.println("-------------------84----------------------------------");
        Table table = new Table("Wood", "Brown", 2500);
        System.out.println(table);
        System.out.println("assigned hashCode : "+table.hashCode());
        System.out.println("default : "+System.identityHashCode(table));

        System.out.println();
        System.out.println("-------------------85----------------------------------");
        Chair chair = new Chair("Office", "Plastic", 800);
        System.out.println(chair);
        System.out.println("assigned hashCode : "+chair.hashCode());
        System.out.println("default : "+System.identityHashCode(chair));

        System.out.println();
        System.out.println("-------------------86----------------------------------");
        Cup cup = new Cup("Ceramic", "White", 150);
        System.out.println(cup);
        System.out.println("assigned hashCode : "+cup.hashCode());
        System.out.println("default : "+System.identityHashCode(cup));

        System.out.println();
        System.out.println("-------------------87----------------------------------");
        PenDrive penDrive = new PenDrive("Sandisk", 64, 700);
        System.out.println(penDrive);
        System.out.println("assigned hashCode : "+penDrive.hashCode());
        System.out.println("default : "+System.identityHashCode(penDrive));

        System.out.println();
        System.out.println("-------------------88----------------------------------");
        Monitor monitor = new Monitor("LG", 24, 9000);
        System.out.println(monitor);
        System.out.println("assigned hashCode : "+monitor.hashCode());
        System.out.println("default : "+System.identityHashCode(monitor));

        System.out.println();
        System.out.println("-------------------89----------------------------------");
        Wallet wallet = new Wallet("Levis", "Leather", 1200);
        System.out.println(wallet);
        System.out.println("assigned hashCode : "+wallet.hashCode());
        System.out.println("default : "+System.identityHashCode(wallet));

        System.out.println();
        System.out.println("-------------------90----------------------------------");
        FanRemote fanRemote = new FanRemote("Havells", 15, 500);
        System.out.println(fanRemote);
        System.out.println("assigned hashCode : "+fanRemote.hashCode());
        System.out.println("default : "+System.identityHashCode(fanRemote));

        System.out.println();
        System.out.println("-------------------91----------------------------------");
        Lamp lamp = new Lamp("Table", "Yellow", 750);
        System.out.println(lamp);
        System.out.println("assigned hashCode : "+lamp.hashCode());
        System.out.println("default : "+System.identityHashCode(lamp));

        System.out.println();
        System.out.println("-------------------92----------------------------------");
        Frame frame = new Frame("A4", "Wood", 300);
        System.out.println(frame);
        System.out.println("assigned hashCode : "+frame.hashCode());
        System.out.println("default : "+System.identityHashCode(frame));

        System.out.println();
        System.out.println("-------------------93----------------------------------");
        Clock clock = new Clock("Titan", "Wall", 1200);
        System.out.println(clock);
        System.out.println("assigned hashCode : "+clock.hashCode());
        System.out.println("default : "+System.identityHashCode(clock));

        System.out.println();
        System.out.println("-------------------94----------------------------------");
        FanStand fanStand = new FanStand("Bajaj", 120, 2000);
        System.out.println(fanStand);
        System.out.println("assigned hashCode : "+fanStand.hashCode());
        System.out.println("default : "+System.identityHashCode(fanStand));

        System.out.println();
        System.out.println("-------------------95----------------------------------");
        BagPack bagPack = new BagPack("SkyBag", 35, 1800);
        System.out.println(bagPack);
        System.out.println("assigned hashCode : "+bagPack.hashCode());
        System.out.println("default : "+System.identityHashCode(bagPack));

        System.out.println();
        System.out.println("-------------------96----------------------------------");
        PowerPlug powerPlug = new PowerPlug("Type-C", 220, 250);
        System.out.println(powerPlug);
        System.out.println("assigned hashCode : "+powerPlug.hashCode());
        System.out.println("default : "+System.identityHashCode(powerPlug));

        System.out.println();
        System.out.println("-------------------97----------------------------------");
        Ink ink = new Ink("Blue", "Camlin", 30);
        System.out.println(ink);
        System.out.println("assigned hashCode : "+ink.hashCode());
        System.out.println("default : "+System.identityHashCode(ink));

        System.out.println();
        System.out.println("-------------------98----------------------------------");
        SketchBook sketchBook = new SketchBook("Brustro", 100, 180);
        System.out.println(sketchBook);
        System.out.println("assigned hashCode : "+sketchBook.hashCode());
        System.out.println("default : "+System.identityHashCode(sketchBook));

        System.out.println();
        System.out.println("-------------------99----------------------------------");
        Globe globe = new Globe("Medium", "Blue", 900);
        System.out.println(globe);
        System.out.println("assigned hashCode : "+globe.hashCode());
        System.out.println("default : "+System.identityHashCode(globe));

        System.out.println();
        System.out.println("-------------------100----------------------------------");
        Smartwatch smartwatch = new Smartwatch("Boat", "160", 2400);
        System.out.println(smartwatch);
        System.out.println("assigned hashCode : "+smartwatch.hashCode());
        System.out.println("default : "+System.identityHashCode(smartwatch));

    }
}
