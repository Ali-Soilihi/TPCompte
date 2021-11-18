public class Compte {

    private Integer idCompte;
    private static Integer compteCode=0;
    private Integer solde;
    private Integer interetBank;
    private Integer decouvert;
    private Integer taxeCreation;
    private CarteBancaire compteCarte;

    //constructeurs


    public Compte(Integer solde, CarteBancaire compteCarte) {
        if (compteCarte==CarteBancaire.VISA) {

            this.solde = solde - 5;
        } else if (compteCarte==CarteBancaire.MASTERCARD) {

            this.solde = solde - 10;
        } else {

            this.solde = solde;
        }
        Compte.compteCode++;
        idCompte=Compte.compteCode;
        this.compteCarte = compteCarte;
    }

    //les methodes
    public void retrait(Integer montant) {

        this.solde=this.solde-montant;
        System.out.println("******************Compte*************************");
        System.out.println("compte n° "+idCompte+" retrait effectuer solde acteur  "+ this.solde);

    }
    public void depot(Integer montant) {

        this.solde=this.solde-montant;
        System.out.println("******************Compte*************************");
        System.out.println("compte n° "+idCompte+" depot effectuer solde acteur  "+ this.solde);

    }

    public void virement(Compte compteCediter,Integer montant) {

        this.solde=this.solde-montant;

        compteCediter.depot(montant);

        System.out.println("******************Compte*************************");
        System.out.println("compte n° "+idCompte+" Virement effectuer solde acteur  "+ this.solde);

    }

    public void etatCompte() {
        System.out.println("******************Compte*************************");
        System.out.println("votre numero de compte est le  "+ idCompte);
        System.out.println("votre solde est de "+solde);
        System.out.println("votre  carte est une  "+ compteCarte);
        System.out.println("votre decouver autorisé est de  "+ decouvert);
    }


    //les getter Setter
    public CarteBancaire getCompteCarte() {
        return compteCarte;
    }

    public void setCompteCarte(CarteBancaire compteCarte) {
        this.compteCarte = compteCarte;
    }

    public Integer getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Integer idCompte) {
        this.idCompte = idCompte;
    }

    public static Integer getCompteCode() {
        return compteCode;
    }

    public static void setCompteCode(Integer compteCode) {
        Compte.compteCode = compteCode;
    }

    public Integer getSolde() {
        return solde;
    }

    public void setSolde(Integer solde) {
        this.solde = solde;
    }

    public Integer getInteretBank() {
        return interetBank;
    }

    public void setInteretBank(Integer interetBank) {
        this.interetBank = interetBank;
    }

    public Integer getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(Integer decouvert) {
        this.decouvert = decouvert;
    }

    public Integer getTaxeCreation() {
        return taxeCreation;
    }

    public void setTaxeCreation(Integer taxeCreation) {
        this.taxeCreation = taxeCreation;
    }
}
