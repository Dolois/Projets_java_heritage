
public class AccountPEL extends Account implements InterfaceAccount
{
    public double taux_epargne;
    
    public void virer(double montant, AccountPEL compteCrediteur)
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