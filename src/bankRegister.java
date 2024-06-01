import java.util.Scanner;

public class bankRegister {
    Scanner in = new Scanner(System.in);
    bankClients db = new bankClients();
    int maxClients;
    int minClients = 2;

    public void getClients(){
        System.out.println("Имя 1 счёта: "+ db.client1 + "\nИмя 2 счёта: "+ db.client2+"\nИмя 3 счёта: "+db.client3+"\nИмя 4 счёта: "+db.client4);
    }

    public void Register(){
        System.out.print("Введите кол-во счетов: ");
        maxClients = in.nextInt();
        db.client1 = in.nextLine();
        switch (maxClients){
            case 1:
                System.out.println("Число счетов не может быть меньше " + minClients);
                break;
            case 2:
                System.out.print("Введите имя счета 1: ");
                db.client1 = in.nextLine();
                db.bank1 = new Bank(db.client1);
                System.out.print("Введите имя счета 2: ");
                db.client2 = in.nextLine();
                db.bank2 = new Bank(db.client2);
                break;
            case 3:
                System.out.print("Введите имя счета 1: ");
                db.client1 = in.nextLine();
                db.bank1 = new Bank(db.client1);
                System.out.print("Введите имя счета 2: ");
                db.client2 = in.nextLine();
                db.bank2 = new Bank(db.client2);
                System.out.print("Введите имя счета 3: ");
                db.client3 = in.nextLine();
                db.bank3 = new Bank(db.client3);
                break;
            case 4:
                System.out.print("Введите имя счета 1: ");
                db.client1 = in.nextLine();
                db.bank1 = new Bank(db.client1);
                System.out.print("Введите имя счета 2: ");
                db.client2 = in.nextLine();
                db.bank2 = new Bank(db.client2);
                System.out.print("Введите имя счета 3: ");
                db.client3 = in.nextLine();
                db.bank3 = new Bank(db.client3);
                System.out.print("Введите имя счета 4: ");
                db.client4 = in.nextLine();
                db.bank4 = new Bank(db.client4);
                break;
        }
    }

}
