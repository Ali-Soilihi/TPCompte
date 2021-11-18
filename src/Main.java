public class Main {
    public static void main(String[] args) {
        /* j'ai estimé qu'il faut un depot minimum pour crée un compte
        * j'ai malheuresement pas géré la question du decouvert
        * si tu a des question sur le code j'y repondrais j'ai fait de mon mieux
        * */
        //initialisé les compte
        Compte compteAsimple=new CompteSimple(500,CarteBancaire.VISA);
        Compte compteBpayant=new ComptePayant(1000,CarteBancaire.MASTERCARD);

        //affiché l'etat des comptes
        compteAsimple.etatCompte();
        compteBpayant.etatCompte();

        //retrait dans les comptes
        compteAsimple.retrait(50);
        compteBpayant.retrait(100);

        //depot dans les comptes
        compteAsimple.depot(70);
        compteBpayant.depot(120);

        //virement comptes
        compteAsimple.virement(compteBpayant,20);

        //affiché l'etat des comptes
        compteAsimple.etatCompte();
        compteBpayant.etatCompte();

        //afficher l'etat de la banque
        System.out.println("*******************************************");
        System.out.println("la banque est riche de "+Bank.getCapital());

    }
}
