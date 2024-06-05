import java.util.ArrayList;

public class Client {
    String name;
    int balance = 0;
    ArrayList<Streets> ownedStreets = new ArrayList<>();

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}

    public void addStreet(Streets name){
        ownedStreets.add(name);
    }
    public void setBalance(int balance){this.balance = balance;}
}
