package Projet;

public class PersonnageJoueur extends Personnage {
public String pointdevie;

public PersonnageJoueur(String pointdevie,String mdp,String role,String nom_utilisateur) {
	super(mdp,role, nom_utilisateur);
	this.pointdevie=pointdevie;
}

//je pense qu'il faut la faire avec l'interface 
public void choisir_Question() {
	
	}


}
