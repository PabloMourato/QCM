package Projet;
import java.util.ArrayList;
import java.util.List;

public class Reponse extends Question {
	private String reponse1;
	private String reponse2;
	private String reponse3;
	private String reponse4;
	private List<Reponse> reponses = new ArrayList<>();

public Reponse(String reponsea,String reponseb,String reponsec,String reponsed,List<Reponse> reponses, List<Question> questionnaire) {
	super(reponsed, reponsed, reponsed, reponsed, reponsed, reponsed, questionnaire);
	this.reponse1=reponsea;
	this.reponse2=reponseb;
	this.reponse3=reponsec;
	this.reponse4=reponsed;
	this.reponses=reponses;
}
//Création des getteurs et setters
public String getReponse1() {
	return reponse1;
}

public String getReponse2() {
	return reponse2;
}
public String getReponse3() {
	return reponse3;
}
public String getReponse4() {
	return reponse4;
}
public void setReponse1(String reponsea) {
	this.reponse1=reponsea;
}
public void setReponse2(String reponseb) {
	this.reponse2=reponseb;
}
public void setReponse3(String reponsec) {
	this.reponse3=reponsec;
}
public void setReponse4(String reponsed) {
	this.reponse4=reponsed;
}
//Mettre les 4 réponses dans une liste (Je sais pas si on fait comme ça)

public void addreponse(Reponse reponse) {
	if(reponses.size() >= 4) {
		throw new IllegalArgumentException("Nombres de r�ponses atteinte");
	}
	reponses.add(reponse);
}

}
