import java.util.Timer;

public class roundWait {
    public void waitR(int p){ //p - players
        Timer timer = new Timer();

        int round_4 =1;
        int round_3=1;
        int round_2=1;
        if (p == 4){
            int i = 0;
            while (i < round_4){
                i++;
            }
        } else if (p == 3){
            int i = 0;
            while (i < round_3){
                i++;
            }
        } else if (p == 2){
            int i = 0;
            while (i < round_2){
                i++;
            }
        }
    }
}
