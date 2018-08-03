
public class AccountMain extends Account implements InterfaceAccount
{
	/* Débiter le compte débiteur
	 * 
	 * Créditer le compte créditeur
	 */
	
    public void virer(double montant, AccountMain compteCrediteur)
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