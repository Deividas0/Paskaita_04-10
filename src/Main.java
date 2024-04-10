

public class Main {
    public static <Int> void main(String[] args) throws ArgumentIsZero {

        inputManager inputManager = new inputManager();
        intDivider intDivider = new intDivider();

        String[] masyvas = inputManager.askForInput();
        System.out.println(masyvas[0] + " / " + masyvas[1] + " = " + intDivider.divide(masyvas));
    }
}