import java.util.ArrayList;
import StreetPack.Street;

public class Client {
    String name;
    int balance = 0;
    ArrayList<Street> ownedStreets = new ArrayList<>();

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    public void addStreet(Street name){

        ownedStreets.add(name);
    }
    public void setBalance(int balance){this.balance = balance;}
}
