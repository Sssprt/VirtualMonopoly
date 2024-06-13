package org.mbt.StreetPack;

public class Street {
    public String name;
    public String owner;
    int price = 0;
//    public void parseStreetName(String s){
//        if (s.chars().equals(name.chars())){
//            System.out.println(s);
//        }
//    }
    public boolean equalsAnyName(String name){
        if (name.equals(this.name)){
            return true;
        } else {
            return false;
        }
    }
//    public Street(String name, int price, String owner){
//        this.name = name;
//        this.price = price;
//        this.owner = owner;
//    }
//    public Street(String name, int price){
//        this.name = name;
//        this.price = price;
//        this.owner = owner;
//    }
}
