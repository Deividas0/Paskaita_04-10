public class ArgumentIsZero extends Exception {
    @Override
    public String toString(){
        return "Klaida: Dalyba iš 0 negalima ";
    }

    public ArgumentIsZero(String zinute){
        super(zinute);

    }
}
