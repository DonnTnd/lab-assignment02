public class AirCondition {

    private String brand;
    private String modelcode ;
    private String color;
    private int price;

    public AirCondition(String brand,String modelcode, String color, int price){
        this.brand = brand;
        this.modelcode = modelcode ;
        this.color = color;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public String getModelcode(){
        return modelcode;
    }

    public String getColor(){
        return color;
    }

    public int getPrice(){
        return price;
    }
}
