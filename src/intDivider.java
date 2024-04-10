import com.sun.jdi.connect.Connector;

import java.util.InputMismatchException;

public class intDivider {

    public int divide(String[] skaiciai) {
        int sk1 = Integer.parseInt(skaiciai[0]);
        int sk2 = Integer.parseInt(skaiciai[1]);
        int rezultatas = 0;

        try {
            if(sk2==0){
                throw new ArgumentIsZero("0 dalyba negalima");
            }
            rezultatas = sk1 / sk2;
        } catch (ArgumentIsZero e) {
            System.out.println(e);

        }
        finally{
            return rezultatas;
        }

    }
}
