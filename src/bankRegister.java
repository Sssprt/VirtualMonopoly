import java.util.Scanner;

public class bankRegister {
    Scanner in = new Scanner(System.in);
    bankFlex flex = new bankFlex();
    int maxClients;
    int minClients = 2;

    public void getClients(){
        System.out.println(
                "Имя и номер 1 счёта: "+ flex.client1 +" - "+flex.card1+
                "\nИмя и номер 2 счёта: "+ flex.client2+" - "+flex.card2+
                "\nИмя и номер 3 счёта: "+ flex.client3+" - "+flex.card3+
                "\nИмя и номер 4 счёта: "+ flex.client4+" - "+flex.card4
        );
    }

    public void Register(){
        System.out.print("Введите кол-во счетов: ");
        maxClients = in.nextInt();
        flex.client1 = in.nextLine();
        switch (maxClients){
            case 1:
                System.out.println("Число счетов не может быть меньше " + minClients);
                break;
            case 2:
                System.out.print("Введите имя счета 1: ");
                flex.client1 = in.nextLine();
                flex.bank1 = new Bank(flex.client1);
                System.out.print("Введите имя счета 2: ");
                flex.client2 = in.nextLine();
                flex.bank2 = new Bank(flex.client2);
                break;
            case 3:
                System.out.print("Введите имя счета 1: ");
                flex.client1 = in.nextLine();
                flex.bank1 = new Bank(flex.client1);
                System.out.print("Введите имя счета 2: ");
                flex.client2 = in.nextLine();
                flex.bank2 = new Bank(flex.client2);
                System.out.print("Введите имя счета 3: ");
                flex.client3 = in.nextLine();
                flex.bank3 = new Bank(flex.client3);
                break;
            case 4:
                System.out.print("Введите имя счета 1: ");
                flex.client1 = in.nextLine();
                flex.bank1 = new Bank(flex.client1);
                System.out.print("Введите имя счета 2: ");
                flex.client2 = in.nextLine();
                flex.bank2 = new Bank(flex.client2);
                System.out.print("Введите имя счета 3: ");
                flex.client3 = in.nextLine();
                flex.bank3 = new Bank(flex.client3);
                System.out.print("Введите имя счета 4: ");
                flex.client4 = in.nextLine();
                flex.bank4 = new Bank(flex.client4);
                break;
        }
    }

}
