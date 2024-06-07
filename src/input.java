import java.io.InputStreamReader;
import java.util.Scanner;
import StreetPack.Street;

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
//    public Street getStreetName(String prompt){
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
