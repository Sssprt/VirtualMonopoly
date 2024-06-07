import static java.lang.System.*;

public class CTM {
    boolean open = true;
    String operation;
    input input = new input();
    bankRegister reg = new bankRegister();
    bankFlex flex = new bankFlex();

    public void launch(){
        while (open){
            operation = input.getString("Введите команду: ");
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
                case "getBank":
                    flex.getBank();
                    break;
//                case "getStreet":
//                    flex.addStreet();
//                    break;
                case "casino":
                    flex.casino();
                    break;
                case "getCredit":
                    flex.credit();
                    break;
                case "help":
                    out.println(
                            """
                                    claim -- забрать деньги с счёта,\

                                    add -- пополнить счёт,\
                                    
                                    get -- номера счетов,\

                                    getCash -- узнать баланс определённого счёта,\
                                    
                                    getBank -- узнать баланс банка,\
                                    
                                    getStreet -- узнать какими уицами вледеет счёт,\
                                    
                                    casino -- казино,\
                                    
                                    getCredit -- взять кредит,\

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
