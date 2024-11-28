package Kiosk;

public class MenuItem {

    //속성
    public String name;
    public double price;
    public String description;

    //생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
    //기능
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

}


