public class bankFlex {
    input input = new input();

    Client cl1 = new Client();
    Client cl2 = new Client();
    Client cl3 = new Client();
    Client cl4 = new Client();

    final int card1 = 101224;
    final int card2 = 202424;
    final int card3 = 303624;
    final int card4 = 404824;

    int flexBalance = 900000;

    public void success(){System.out.println("Успешно!");}

    public void claimCash(){
        int card = input.getInt("Введите номер счёта: ");
        int cash = input.getInt("Введите сумму: ");

        if (card == card1){
            cl1.balance-=cash;
            flexBalance+=cash;
            success();
        }
        if (card == card2){
            cl2.balance-=cash;
            flexBalance+=cash;
            success();
        }
        if (card == card3){
            cl3.balance-=cash;
            flexBalance+=cash;
            success();
        }
        if (card == card4){
            cl4.balance-=cash;
            flexBalance+=cash;
            success();
        }
    }
    public void addCash(){
        int card = input.getInt("Введите номер счёта: ");
        int cash = input.getInt("Введите сумму: ");

        if (card == card1){
            flexBalance-=cash;
            cl1.balance+=cash;
            success();
        }
        if (card == card2){
            flexBalance-=cash;
            cl2.balance+=cash;
            success();
        }
        if (card == card3){
            flexBalance-=cash;
            cl3.balance+=cash;
            success();
        }
        if (card == card4){
            flexBalance-=cash;
            cl4.balance+=cash;
            success();
        }
    }
    public void moveCash(){
        int card = input.getInt("Введите номер счёта: ");
        int cardTo = input.getInt("Введите номер счёта куда перевести: ");
        int cash = input.getInt("Введите сумму: ");

        if (card == card1){
            cl1.balance-=cash;
            switch (cardTo) {
                case card1:
                    System.out.println("Нельзя перевести на тот-же счёт!");
                    break;
                case card2:
                    cl2.balance += cash;
                    break;
                case card3:
                    cl3.balance += cash;
                    break;
                case card4:
                    cl4.balance += cash;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            success();
        }
        if (card == card2){
            cl2.balance-=cash;
            switch (cardTo) {
                case card1:
                    cl1.balance += cash;
                    break;
                case card2:
                    System.out.println("Нельзя перевести на тот-же счёт!");
                    break;
                case card3:
                    cl3.balance += cash;
                    break;
                case card4:
                    cl4.balance += cash;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            success();
        }
        if (card == card3){
            cl3.balance-=cash;
            switch (cardTo) {
                case card1:
                    cl1.balance += cash;
                    break;
                case card2:
                    cl2.balance += cash;
                    break;
                case card3:
                    System.out.println("Нельзя перевести на тот-же счёт!");
                    break;
                case card4:
                    cl4.balance += cash;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            success();
        }
        if (card == card4){
            cl4.balance-=cash;
            switch (cardTo) {
                case card1:
                    cl1.balance += cash;
                    break;
                case card2:
                    cl2.balance += cash;
                    break;
                case card3:
                    cl3.balance += cash;
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
    public void getBank(){System.out.println("Баланс банка: "+flexBalance);}
    public void getCash(){
        int card = input.getInt("Введите номер счёта: ");

        if (card == card1){
            System.out.println("Баланс счёта с номером: " +cl1.name+ card1 + ": " + cl1.balance);
        }
        if (card == card2){
            System.out.println("Баланс счёта с номером: " +cl2.name+ card2 + ": " + cl2.balance);
        }
        if (card == card3){
            System.out.println("Баланс счёта с номером: " +cl3.name+ card3 + ": " + cl3.balance);
        }
        if (card == card4){
            System.out.println("Баланс счёта с номером: " +cl4.name+ card4 + ": " + cl4.balance);
        }
    }
}
