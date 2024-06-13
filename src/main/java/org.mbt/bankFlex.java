package org.mbt;

import org.mbt.lang.language;
import org.mbt.lang.ru_ru;
import org.mbt.lang.en_us;

public class bankFlex {
    // LANGUAGES
    String cur_lang_string;
    language cur_lang;
    ru_ru ru = new ru_ru();
    en_us us = new en_us();

    // VARS
    input input = new input();
    roundWait r = new roundWait();

    Client cl1 = new Client();
    Client cl2 = new Client();
    Client cl3 = new Client();
    Client cl4 = new Client();

    final int card1 = 101224;
    final int card2 = 202424;
    final int card3 = 303624;
    final int card4 = 404824;

    int flexBalance = 900000;

    // Set and get language
    public void setLang(){
        cur_lang_string = input.getString(ru.question_lang);
        if (cur_lang_string.equals("ru")) {
            cur_lang = ru;
        }
    }
    public String getLang(){
        return cur_lang_string;
    }
    //
    public int randomCash(int cash){
        return (int) (Math.random() * cash * 2);
    }
    public void success(){System.out.println("Успешно!");}
    public void casino(){
        int card = input.getInt(ru.defPrompt);
        int cash = input.getInt(ru.cashQ);
        int resCash = 0;
        switch (card){
            case card1:
                cl1.balance-=cash;
                resCash = randomCash(cash);
                cl1.balance+=resCash;
                System.out.println("Вы вложили: "+cash+", вы выиграли: "+resCash);
                break;
            case card2:
                cl2.balance-=cash;
                resCash = randomCash(cash);
                cl2.balance+=resCash;
                System.out.println("Вы вложили: "+cash+", вы выиграли: "+resCash);
                break;
            case card3:
                cl3.balance-=cash;
                resCash = randomCash(cash);
                cl3.balance+=resCash;
                System.out.println("Вы вложили: "+cash+", вы выиграли: "+resCash);
                break;
            case card4:
                cl4.balance-=cash;
                resCash = randomCash(cash);
                cl4.balance+=resCash;
                System.out.println("Вы вложили: "+cash+", вы выиграли: "+resCash);
                break;
        }
    }
    public void credit(){
        int owner = input.getInt(ru.defPrompt);
        int cash = input.getInt(ru.cashQCredit);
        int cashPercent = input.getInt(ru.cshPrcnt);
        switch (owner){
            case card1:
                r.waitR(4);
                cl1.balance-=cash;
                break;
            case card2:
                cl2.balance-=cash;
                break;
            case card3:
                cl3.balance-=cash;
                break;
            case card4:
                cl4.balance-=cash;
                break;
        }
    }
//    public void addStreet(){
//        int owner = Integer.parseInt(input.getString("Введите номер счёта: "));
//        String streetName = input.getString("Введите имя улицы: ");
//        Street name = new Arbat();
//        switch (owner){
//            case card1:
//                cl1.addStreet(name);
//                break;
//            case card2:
//                cl2.addStreet(name);
//                break;
//            case card3:
//                cl3.addStreet(name);
//                break;
//            case card4:
//                cl4.addStreet(name);
//                break;
//
//        }
//    }
    public void claimCash(){
        int card = input.getInt(ru.defPrompt);
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
        int card = input.getInt(ru.defPrompt);
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
        int card = input.getInt(ru.defPrompt);

        if (card == card1){
            System.out.println("Баланс счёта с номером: " +cl1.getName()+ " " + card1 + ": " + cl1.balance);
        }
        if (card == card2){
            System.out.println("Баланс счёта с номером: " +cl2.getName() + " " + card2 + ": " + cl2.balance);
        }
        if (card == card3){
            System.out.println("Баланс счёта с номером: " +cl3.getName() + " " + card3 + ": " + cl3.balance);
        }
        if (card == card4){
            System.out.println("Баланс счёта с номером: " +cl4.getName() + " " + card4 + ": " + cl4.balance);
        }
    }
}
