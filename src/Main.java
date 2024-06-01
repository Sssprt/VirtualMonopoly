import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CTM ctm = new CTM();
        Scanner in = new Scanner(System.in);
        bankRegister reg = new bankRegister();
        bankOperations op = new bankOperations();

        ctm.launch();
    }
}