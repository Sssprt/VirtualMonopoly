public class bankRegister {
    input input = new input();
    bankFlex flex = new bankFlex();
    int maxClients;
    int minClients = 2;
    Client cl1 = flex.cl1;
    Client cl2 = flex.cl2;
    Client cl3 = flex.cl3;
    Client cl4 = flex.cl4;

    public void getClients(){
        System.out.println(
                "Имя и номер 1 счёта: "+ cl1 +" - "+flex.card1+
                "\nИмя и номер 2 счёта: "+ cl2+" - "+flex.card2+
                "\nИмя и номер 3 счёта: "+ cl3+" - "+flex.card3+
                "\nИмя и номер 4 счёта: "+ cl4+" - "+flex.card4
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
