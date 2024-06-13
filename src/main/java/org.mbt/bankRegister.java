package org.mbt;

public class bankRegister {
    input input = new input();
    bankFlex flex = new bankFlex();
    int maxClients;
    int minClients = 2;
    Client cl1 = flex.cl1;
    Client cl2 = flex.cl2;
    Client cl3 = flex.cl3;
    Client cl4 = flex.cl4;
    String nan = "Name and number ";
    String acc = " account: ";

    public void getClients(){
        System.out.println(
                nan+1+acc+ cl1.name +" / "+flex.card1+
                "\n"+nan+2+acc+ cl2.name+" / "+flex.card2+
                "\n"+nan+3+acc+ cl3.name+" / "+flex.card3+
                "\n"+nan+4+acc+ cl4.name+" / "+flex.card4+
                "\nУспешно!"
        );
    }

    public void Register(){
        maxClients = Integer.parseInt(input.getString("Введите кол-во счетов: "));
        switch (maxClients){
            case 1:
                System.out.println("Число счетов не может быть меньше " + minClients);
                break;
            case 2:
                cl1.setName(input.getString("Введите имя счета 1: "));
                cl2.setName(input.getString("Введите имя счета 2: "));
                break;
            case 3:
                cl1.setName(input.getString("Введите имя счета 1: "));
                cl2.setName(input.getString("Введите имя счета 2: "));
                cl3.setName(input.getString("Введите имя счета 3: "));
                break;
            case 4:
                cl1.setName(input.getString("Введите имя счета 1: "));
                cl2.setName(input.getString("Введите имя счета 2: "));
                cl3.setName(input.getString("Введите имя счета 3: "));
                cl4.setName(input.getString("Введите имя счета 4: "));
                break;
        }
    }

}
