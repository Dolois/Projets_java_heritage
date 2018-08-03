
public class AccountPEL extends Account implements InterfaceAccount
{
    public double taux_epargne;
    
    public void virer(double montant, AccountPEL compteCrediteur)
    {
    	// Création de la variable compteDebiteur
    	// a partir de l'instance AccountMain
    	// qui est passée en argument
    	
    	// Débiter le compte débiteur
    	compteCrediteur.setSolde(compteCrediteur.getSolde() + montant);
    	
    	// Créditer le compte créditeur
    	solde = solde - montant;
    }
}