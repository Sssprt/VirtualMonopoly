import java.util.Scanner;
public class bankOperations {
    Scanner in = new Scanner(System.in);
    bankFlex flex = new bankFlex();

    public void claimCash(String client, int cash){
        if (client.equals(flex.client1)){
            flex.cl1cash = flex.cl1cash - cash;
        }
        if (client.equals(flex.client2)){
            flex.cl2cash = flex.cl2cash - cash;
        }
        if (client.equals(flex.client3)){
            flex.cl3cash = flex.cl3cash - cash;
        }
        if (client.equals(flex.client4)){
            flex.cl4cash = flex.cl4cash - cash;
        }
    }

    public void addCash(String client, int cash){
        if (client.equals(flex.client1)){
            flex.cl1cash = flex.cl1cash + cash;
        }
        if (client.equals(flex.client2)){
            flex.cl2cash = flex.cl2cash + cash;
        }
        if (client.equals(flex.client3)){
            flex.cl3cash = flex.cl3cash + cash;
        }
        if (client.equals(flex.client4)){
            flex.cl4cash = flex.cl4cash + cash;
        }

    }
    public void getCash(String client){
        if (client.equals(flex.client1)){
            System.out.println("Баланс " + client + ": " + flex.cl1cash);
        }
        if (client.equals(flex.client2)){
            System.out.println("Баланс " + client + ": " + flex.cl2cash);
        }
        if (client.equals(flex.client3)){
            System.out.println("Баланс " + client + ": " + flex.cl3cash);
        }
        if (client.equals(flex.client4)){
            System.out.println("Баланс " + client + ": " + flex.cl4cash);
        }
    }
}
