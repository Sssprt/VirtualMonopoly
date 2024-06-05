import java.io.InputStreamReader;
import java.util.Scanner;

public class input {
    Scanner scan = new Scanner(System.in);
    public String getString(String prompt){
        System.out.print(prompt);
        return scan.nextLine();
    }
    public int getInt(String prompt){
        System.out.print(prompt);
        return scan.nextInt();
    }
//    public Streets getStreetName(String prompt){
//        System.out.print(prompt);
//        return str;
//    }
    public boolean getBool(String prompt){
        System.out.print(prompt);
        return scan.nextBoolean();
    }
    public float getFloat(String prompt){
        System.out.print(prompt);
        return scan.nextFloat();
    }
}
