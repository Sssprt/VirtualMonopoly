import java.util.Scanner;

public class bankFlex {
    Scanner in = new Scanner(System.in);

    Bank bank1;
    Bank bank2;
    Bank bank3;
    Bank bank4;

    String client1;
    String client2;
    String client3;
    String client4;

    final int card1 = 101224;
    final int card2 = 202424;
    final int card3 = 303624;
    final int card4 = 404824;

    int balance1 = 0;
    int balance2 = 0;
    int balance3 = 0;
    int balance4 = 0;
//    int balanceTo = 0;
//    int flexBalance = 900000;

    public void success(){System.out.println("Успешно!");}

    public void claimCash(){
        System.out.print("Введите номер счёта: ");
        int card = in.nextInt();
        System.out.print("Введите сумму: ");
        int cash = in.nextInt();
        in.nextLine();

        if (card == card1){
            balance1 = balance1 - cash;
            success();
        }
        if (card == card2){
            balance2 = balance2 - cash;
            success();
        }
        if (card == card3){
            balance3 = balance3 - cash;
            success();
        }
        if (card == card4){
            balance4 = balance4 - cash;
            success();
        }
    }
    public void addCash(){
        System.out.print("Введите номер счёта: ");
        int card = in.nextInt();
        System.out.print("Введите сумму: ");
        int cash = in.nextInt();
        in.nextLine();

        if (card == card1){
            balance1 = balance1 + cash;
            success();
        }
        if (card == card2){
            balance2 = balance2 + cash;
            success();
        }
        if (card == card3){
            balance3 = balance3 + cash;
            success();
        }
        if (card == card4){
            balance4 = balance4 + cash;
            success();
        }
    }
    public void moveCash(){
        System.out.print("Введите номер счёта: ");
        int card = in.nextInt();
        System.out.print("Введите номер счёта куда перевести: ");
        int cardTo = in.nextInt();
        System.out.print("Введите сумму: ");
        int cash = in.nextInt();
        in.nextLine();

        if (card == card1){
            balance1-=cash;
            switch (cardTo) {
                case card1:
                    System.out.println("Нельзя перевести на тот-же счёт!");
                    break;
                case card2:
                    balance2 += cash;
                    break;
                case card3:
                    balance3 += cash;
                    break;
                case card4:
                    balance4 += cash;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            success();
        }
        if (card == card2){
            balance2-=cash;
            switch (cardTo) {
                case card1:
                    balance1 += cash;
                    break;
                case card2:
                    System.out.println("Нельзя перевести на тот-же счёт!");
                    break;
                case card3:
                    balance3 += cash;
                    break;
                case card4:
                    balance4 += cash;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            success();
        }
        if (card == card3){
            balance3-=cash;
            switch (cardTo) {
                case card1:
                    balance1 += cash;
                    break;
                case card2:
                    balance2 += cash;
                    break;
                case card3:
                    System.out.println("Нельзя перевести на тот-же счёт!");
                    break;
                case card4:
                    balance4 += cash;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            success();
        }
        if (card == card4){
            balance4-=cash;
            switch (cardTo) {
                case card1:
                    balance1 += cash;
                    break;
                case card2:
                    balance2 += cash;
                    break;
                case card3:
                    balance3 += cash;
                    break;
                case card4:
                    System.out.println("Нельзя перевести на тот-же счёт!");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            success();
        }
    }

    public void getCash(){
        System.out.print("Введите номер счёта: ");
        int card = in.nextInt();

        if (card == card1){
            System.out.println("Баланс счёта с номером: " + card1 + ": " + balance1);
        }
        if (card == card2){
            System.out.println("Баланс счёта с номером: " + card2 + ": " + balance2);
        }
        if (card == card3){
            System.out.println("Баланс счёта с номером: " + card3 + ": " + balance3);
        }
        if (card == card4){
            System.out.println("Баланс счёта с номером: " + card4 + ": " + balance4);
        }
    }
}
