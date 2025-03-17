class WaterBall {
    
    String material;
    String color;
    String shape;
    int diameter;
    int price;
    int weight;
    
    public WaterBall() {
        super();
    }
    
    public WaterBall(String material) {
        this();
        this.material = material;
    }
    
    public WaterBall(String material, String color) {
        this(material);
        this.color = color;
    }
    
    public WaterBall(String material, String color, String shape) {
        this(material, color);
        this.shape = shape;
    }
    
    public WaterBall(String material, String color, String shape, int diameter) {
        this(material, color, shape);
        this.diameter = diameter;
    }
    
    public WaterBall(String material, String color, String shape, int diameter, int price) {
        this(material, color, shape, diameter);
        this.price = price;
    }
    
    public WaterBall(String material, String color, String shape, int diameter, int price, int weight) {
        this(material, color, shape, diameter, price);
        this.weight = weight;
    }
    
    public void display() {
        System.out.println("Material  :" + material);
        System.out.println("Color     :" + color);
        System.out.println("Shape     :" + shape);
        System.out.println("Diameter  :" + diameter + " cm");
        System.out.println("Price     :" + price + " INR");
        System.out.println("Weight    :" + weight + " grams");
    }
}
