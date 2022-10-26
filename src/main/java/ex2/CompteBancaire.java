package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	protected double decouvert;

	//
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	// private String type;

	protected CompteBancaire() {
	}

	/**
	 * @param solde
	 * @param decouvert
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		// this.solde += montant;
		setSolde(getSolde() + montant);
	}

	/**
	 * Debite un montant au solde
	 * si le résultat de l'opération ne dépasse pas le découvert
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (getSolde() - montant > getDecouvert()) {
			setDecouvert(getSolde() - montant);
		}
	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
