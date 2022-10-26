package ex2;

public class LivretA extends CompteBancaire {

	// attribut mis au depart dans la class CompteBancaire
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	protected double tauxRemuneration;

	/**
	 * @param solde
	 * @param decouvert
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double tauxRemuneration) {
		this.solde = solde;
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	@Override
	public void ajouterMontant(double montant) {
		super.ajouterMontant(montant);
	}

	/**
	 * Debite un montant au solde en vérifiant que le compte
	 * soit supérieur à 0 après opération
	 * Les découverts ne sont pas autorisés.
	 * 
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant) {
		if (getSolde() - montant > 0) {
			setSolde(getSolde() - montant);
		}
	}

	/**
	 * Méthode calcule le nouveau solde après application du taux de rémunération
	 * annuelle
	 */
	public void appliquerRemuAnnuelle() {
		setSolde(getSolde() + getSolde() * getTauxRemuneration() / 100);
	}

	/**
	 * Getter
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
