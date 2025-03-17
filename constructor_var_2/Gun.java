class Gun {
    
    String model;
    String color;
    String type;
    int magazineCapacity;
    int price;
    int weight;
    
    public Gun() {
        super();
    }
    
    public Gun(String model) {
        this();
        this.model = model;
    }
    
    public Gun(String model, String color) {
        this(model);
        this.color = color;
    }
    
    public Gun(String model, String color, String type) {
        this(model, color);
        this.type = type;
    }
    
    public Gun(String model, String color, String type, int magazineCapacity) {
        this(model, color, type);
        this.magazineCapacity = magazineCapacity;
    }
    
    public Gun(String model, String color, String type, int magazineCapacity, int price) {
        this(model, color, type, magazineCapacity);
        this.price = price;
    }
    
    public Gun(String model, String color, String type, int magazineCapacity, int price, int weight) {
        this(model, color, type, magazineCapacity, price);
        this.weight = weight;
    }
    
    public void display() {
        System.out.println("Model        : " + model);
        System.out.println("Color        : " + color);
        System.out.println("Type         : " + type);
        System.out.println("Magazine Cap : " + magazineCapacity + " rounds");
        System.out.println("Price        : " + price + " INR");
        System.out.println("Weight       : " + weight + " grams");
    }
}
