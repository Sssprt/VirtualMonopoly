import java.util.Scanner;

import static java.lang.System.*;

public class CTM {
    boolean open = true;
    String operation;
    Scanner in = new Scanner(System.in);
    bankRegister reg = new bankRegister();
    bankFlex flex = new bankFlex();

    public void launch(){
        while (open){
            out.print("Введите команду: ");
            operation = in.nextLine();
            switch (operation){
                case "reg":
                    reg.Register();
                    break;
                case "add":
                    flex.addCash();
                    break;
                case "claim":
                    flex.claimCash();
                    break;
                case "get":
                    reg.getClients();
                    break;
                case "getCash":
                    flex.getCash();
                    break;
                case "move":
                    flex.moveCash();
                    break;
                case "help":
                    out.println(
                            """
                                    claim -- забрать деньги с счёта,\

                                    add -- пополнить счёт,
                                    get -- номера счетов,\

                                    getCash -- узнать баланс определённого счёта,\

                                    move -- перевести средства,\

                                    reg -- зарегистрировать счета от 2 до 4,\

                                    exit -- выйти\
                                    !У других команд не ошибайтесь с цифрами и буквами!"""
                    );
                    break;
                case "exit":
                    out.println("Выход...");
                    open = false;
                    break;
                default:
                    out.println("при ошибке -- `help`");
                    break;
            }
        }
    }
}
