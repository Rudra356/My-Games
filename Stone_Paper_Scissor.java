import java.util.*;

public class Stone_Paper_Scissor {
    public static void main(String[] args) {
        System.out.println(" 0 = ROCK \n 1 = PAPER\n 2 = SCISSIORS");
        Scanner sh = new Scanner(System.in);
        byte input; byte n=5;
        byte USERPOINT = 0, COMPUTERPOINT = 0;
        for (int i = 1; i < n; i++) {
            byte AI = (byte) (Math.random() * ((2 - 0 + 1) + 0));
            System.out.print("COMPUTER :" + AI + "   USER : ");
            input = sh.nextByte();
            
            // System.out.println("USER :"+input);
            if (AI == 0 && input == 1)
                USERPOINT++;
            else if (AI == 1 && input == 2)
                USERPOINT++;
            if (AI == 2 && input == 0)
                USERPOINT++;
            if (AI == 1 && input == 0)
                COMPUTERPOINT++;
            if (AI == 2 && input == 1)
                COMPUTERPOINT++;
            if (AI == 0 && input == 2)
                COMPUTERPOINT++;

                if (USERPOINT==COMPUTERPOINT) {
                    n++;
                }
        }sh.close();
    
        System.out.printf("AIPOINT  IS : %d  USERPOINT IS : %d", COMPUTERPOINT, USERPOINT);

    }
}
