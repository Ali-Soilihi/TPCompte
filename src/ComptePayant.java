public class ComptePayant extends Compte{


    private Integer interetBank=1;
    private Integer taxeCreation=50;
    private Integer decouvert=-1000;


    public ComptePayant(Integer solde, CarteBancaire compteCarte) {
        super(solde, compteCarte);
        this.setSolde((getSolde()-50));
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
