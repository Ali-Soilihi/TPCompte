
public class Bank {

    private static Integer capital=0;

    public static void credite(Integer montant) {

        Bank.capital = Bank.capital + montant;
//        System.out.println("*******************Bank************************");
//        String message = "Une opperation a été effectuer sur une banque" + montant + "€ a été credité sur le capital.  capital actuel " + Bank.capital +
//                "€";
//        System.out.println(message);
    }

    public static Integer getCapital() {
        return capital;
    }
}
