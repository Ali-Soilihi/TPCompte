public class CompteSimple extends Compte{


    private Integer interetBank=5;
    private Integer taxeCreation=0;
    private Integer decouvert=0;


    public CompteSimple(Integer solde, CarteBancaire compteCarte) {
        super(solde, compteCarte);

    }
/* A chaque tansaction la banque gagne des sous */
    @Override
    public void retrait(Integer montant) {
        super.retrait(montant);
        Bank.credite(this.interetBank);
    }

    @Override
    public void depot(Integer montant) {
        super.depot(montant);
        Bank.credite(this.interetBank);
    }

    @Override
    public void virement(Compte compteCediter, Integer montant) {
        super.virement(compteCediter, montant);
        Bank.credite(this.interetBank);
    }
}
