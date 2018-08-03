
public class AccountMain extends Account implements InterfaceAccount
{
	/* D�biter le compte d�biteur
	 * 
	 * Cr�diter le compte cr�diteur
	 */
	
    public void virer(double montant, AccountMain compteCrediteur)
    {
    	// Cr�ation de la variable compteDebiteur
    	// a partir de l'instance AccountMain
    	// qui est pass�e en argument
    	
    	// D�biter le compte d�biteur
    	compteCrediteur.setSolde(compteCrediteur.getSolde() + montant);
    	
    	// Cr�diter le compte cr�diteur
    	solde = solde - montant;
    }

}