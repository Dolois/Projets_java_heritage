
public class AccountMain extends Account 
{
	/* D�biter le compte d�biteur
	 * 
	 * Cr�diter le compte cr�diteur
	 */
	
    public void virer(double montant, AccountMain compteDebiteur)
    {
    	// Cr�ation de la variable compteDebiteur
    	// a partir de l'instance AccountMain
    	// qui est pass�e en argument
    	
    	// D�biter le compte d�biteur
    	compteDebiteur.setSolde(compteDebiteur.getSolde() - montant);
    	
    	// Cr�diter le compte cr�diteur
    	solde = solde + montant;
    }

}