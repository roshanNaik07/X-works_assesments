class Water {
    
    String brand;
    String color;
    String source;
    int volume;
    int price;
    int purityLevel;
    
    public Water() {
        super();
    }
    
    public Water(String brand) {
        this();
        this.brand = brand;
    }
    
    public Water(String brand, String color) {
        this(brand);
        this.color = color;
    }
    
    public Water(String brand, String color, String source) {
        this(brand, color);
        this.source = source;
    }
    
    public Water(String brand, String color, String source, int volume) {
        this(brand, color, source);
        this.volume = volume;
    }
    
    public Water(String brand, String color, String source, int volume, int price) {
        this(brand, color, source, volume);
        this.price = price;
    }
    
    public Water(String brand, String color, String source, int volume, int price, int purityLevel) {
        this(brand, color, source, volume, price);
        this.purityLevel = purityLevel;
    }
    
    public void display() {
        System.out.println("Brand       : " + brand);
        System.out.println("Color       : " + color);
        System.out.println("Source      : " + source);
        System.out.println("Volume      : " + volume + " ml");
        System.out.println("Price       : " + price + " INR");
        System.out.println("Purity Level: " + purityLevel + "%");
    }
}
