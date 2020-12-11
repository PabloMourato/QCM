package Projet;


import java.util.ArrayList;

public abstract class Questionnaire {
public String nom;
public ArrayList<Question> questions;
public ArrayList<Reponse> reponses;
private Question Q;
private Reponse R;

//création du nom du questionnaire 
public Questionnaire(String nom) {
	this.nom=nom;
}

/*
Constructeur avec source pour la  BD via JDBC  

public Questionnaire() {//pas sur 
  source = new SourceJdbc();  
  init();
  }  

 methode pour constructeurs : recuperation des questions-reponses depuis la bdd */
//private void init() {  





//création des getters et setters 
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public ArrayList<Question> getQuestions() {
	return questions;
}
public void setQuestions(ArrayList<Question> questions) {
	this.questions = questions;
}

//on ajoute des QUESTIONS au questionnaire 
public void addQuestions(Question question) {
	questions.add(question);
}
	
//afficher question suivante , l'acces se fait de maniere aléatoire 
public void questionSuivante() {
int nb = questions.size();
 if (nb > 0) {
  int index = (int)(Math.random()* (questions.size()-1));
  Q = (Question)questions.get(index);//elementAt
  R = (Reponse)reponses.get(index);
 // suppression des questions deja selectionnees et pretes a poser ainsi que les reponses correspondantes
  questions.remove(index);
  reponses.remove(index);
  
 }
} 

public int nombreDeQuestions() {
    return questions.size();
}
/**
renvoit la question 
*/
public Question getQuestion() {
    return Q;
}


/**
renvoit la reponse 
*/
public Reponse getReponse() {
    return R;
}

//renvoit vrai si le questionnaire est vide, c'est a dire s'il n'y a plus de questions

public boolean isEmpty() {
 return (reponses.size()==0) ;
}
// pour le timer il faut le faire en swing 

public abstract void choisir_Question();
}
