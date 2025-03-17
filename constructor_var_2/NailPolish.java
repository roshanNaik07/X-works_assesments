class NailPolish {
    
    String brand;
    String color;
    String finish;
    int volume;
    int price;
    int durability;
    
    public NailPolish() {
        super();
    }
    
    public NailPolish(String brand) {
        this();
        this.brand = brand;
    }
    
    public NailPolish(String brand, String color) {
        this(brand);
        this.color = color;
    }
    
    public NailPolish(String brand, String color, String finish) {
        this(brand, color);
        this.finish = finish;
    }
    
    public NailPolish(String brand, String color, String finish, int volume) {
        this(brand, color, finish);
        this.volume = volume;
    }
    
    public NailPolish(String brand, String color, String finish, int volume, int price) {
        this(brand, color, finish, volume);
        this.price = price;
    }
    
    public NailPolish(String brand, String color, String finish, int volume, int price, int durability) {
        this(brand, color, finish, volume, price);
        this.durability = durability;
    }
    
    public void display() {
        System.out.println("Brand       : " + brand);
        System.out.println("Color       : " + color);
        System.out.println("Finish      : " + finish);
        System.out.println("Volume      : " + volume + " ml");
        System.out.println("Price       : " + price + " INR");
        System.out.println("Durability  : " + durability + " days");
    }
}
