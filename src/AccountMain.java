
public class AccountMain extends Account 
{
	/* Débiter le compte débiteur
	 * 
	 * Créditer le compte créditeur
	 */
	
    public void virer(double montant, AccountMain compteDebiteur)
    {
    	// Création de la variable compteDebiteur
    	// a partir de l'instance AccountMain
    	// qui est passée en argument
    	
    	// Débiter le compte débiteur
    	compteDebiteur.setSolde(compteDebiteur.getSolde() - montant);
    	
    	// Créditer le compte créditeur
    	solde = solde + montant;
    }

}