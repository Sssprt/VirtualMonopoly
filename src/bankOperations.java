import java.util.Scanner;
public class bankOperations {
    Scanner in = new Scanner(System.in);
    bankClients db = new bankClients();

    public void claimCash(String client, int cash){
        if (client.equals(db.client1)){
            db.cl1cash = db.cl1cash - cash;
        }
        if (client.equals(db.client2)){
            db.cl2cash = db.cl2cash - cash;
        }
        if (client.equals(db.client3)){
            db.cl3cash = db.cl3cash - cash;
        }
        if (client.equals(db.client4)){
            db.cl4cash = db.cl4cash - cash;
        }
    }

    public void addCash(String client, int cash){
        if (client.equals(db.client1)){
            db.cl1cash = db.cl1cash + cash;
        }
        if (client.equals(db.client2)){
            db.cl2cash = db.cl2cash + cash;
        }
        if (client.equals(db.client3)){
            db.cl3cash = db.cl3cash + cash;
        }
        if (client.equals(db.client4)){
            db.cl4cash = db.cl4cash + cash;
        }

    }
    public void getCash(String client){
        if (client.equals(db.client1)){
            System.out.println("Баланс " + client + ": " + db.cl1cash);
        }
        if (client.equals(db.client2)){
            System.out.println("Баланс " + client + ": " + db.cl2cash);
        }
        if (client.equals(db.client3)){
            System.out.println("Баланс " + client + ": " + db.cl3cash);
        }
        if (client.equals(db.client4)){
            System.out.println("Баланс " + client + ": " + db.cl4cash);
        }
    }
}
