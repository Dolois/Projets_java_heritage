
public class CreateAccount {
	
	public static void main(String[] args)
	{
		AccountMain accountMainPierre = new AccountMain();
		AccountMain accountMainAurelia = new AccountMain();
		
		accountMainPierre.setSolde(200);
		accountMainAurelia.setSolde(100);
		
		System.out.println("Ancien solde de Pierre : " + 
				accountMainPierre.getSolde());
		System.out.println("Ancien solde de Aurelia : " + 
				accountMainAurelia.getSolde());
		
		// créditer le solde de Pierre
		// avec le montant passé en argument
		// et l'instance Aurelia passée en argument
		accountMainPierre.virer(25.0, accountMainAurelia);
		
		System.out.println("Nouveau solde de Pierre : " + 
					accountMainPierre.getSolde());
		System.out.println("Nouveau solde de Aurelia : " + 
				accountMainAurelia.getSolde());
		
		System.out.println();
		
		System.out.println("Ancien solde de Pierre : " + 
				accountMainPierre.getSolde());
		System.out.println("Ancien solde de Aurelia : " + 
				accountMainAurelia.getSolde());
		
		accountMainAurelia.virer(25.0, accountMainPierre);
		
		System.out.println("Nouveau solde de Pierre : " + 
				accountMainPierre.getSolde());
		System.out.println("Nouveau solde de Aurelia : " + 
			accountMainAurelia.getSolde());
		
		AccountPEL accountPELPierre = new AccountPEL();
		AccountPEL accountPELAurelia = new AccountPEL();
		
		accountPELPierre.setSolde(1000);
		accountPELAurelia.setSolde(2000);
	}
}