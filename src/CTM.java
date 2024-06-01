import java.util.Scanner;
public class CTM {
    boolean open = true;
    String operation;
    Scanner in = new Scanner(System.in);
    bankRegister reg = new bankRegister();
    bankOperations op = new bankOperations();
    String client;
    int cash;

    public void launch(){
        while (open){
            System.out.print("Введите комманду: ");
            operation = in.nextLine();
            switch (operation){
                case "reg":
                    reg.Register();
                    break;
                case "add":
                    System.out.print("Введите имя счёта: ");
                    client = in.nextLine();
                    System.out.print("Введите сумму: ");
                    cash = in.nextInt();
                    in.nextLine();
                    op.addCash(client, cash);
                    break;
                case "claim":
                    System.out.print("Введите имя счёта: ");
                    client = in.nextLine();
                    System.out.print("Введите сумму: ");
                    cash = in.nextInt();
                    in.nextLine();
                    op.claimCash(client, cash);
                    break;
                case "get":
                    reg.getClients();
                    break;
                case "getCash":
                    System.out.print("Введите имя счёта: ");
                    client = in.nextLine();
                    op.getCash(client);
                    break;
                case "help":
                    System.out.println("claim, add, get, reg, exit");
                    break;
                case "exit":
                    System.out.println("Выход...");
                    open = false;
                    break;
                default:
                    System.out.println("при ошибке -- `help`");
                    break;
            }
        }
    }
}
