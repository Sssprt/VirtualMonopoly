public class Street {
    String name;
    String owner;
    int price = 0;
    public Street(String name, int price, String owner){
        this.name = name;
        this.price = price;
        this.owner = owner;
    }
    public Street(String name, int price){
        this.name = name;
        this.price = price;
        this.owner = owner;
    }
}
