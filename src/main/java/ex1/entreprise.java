package ex1;

import java.util.Date;

/**
 * Informations sur une entreprise
 * 
 * @author Carolanne
 *
 */

public class entreprise {

	// mauvaise pratique
//	public int Siret;
//	public String Nom;
//	public String adresse;
//	public Date date_Creation;
//	
//	public static final int capitalMax = 3000000;
//	
//	public void Afficher_statut(){
//		
//	}

	/** numéro de siret de l'entreprise */
	public int siret;
	/** nom de l'entreprise */
	public String nom;
	/** adresse de l'entreprise */
	public String adresse;
	/** date de creation de l'entreprise */
	public Date dateCreation;

	/** Constante qui donne le capital maximum de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;

	/** Méthode qui affiche le statut de l'entreprise */
	public void afficherStatut() {
	}

	/** Getter
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/** Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	
	

}
