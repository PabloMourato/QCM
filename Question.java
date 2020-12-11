package Projet;
import java.util.List;
import java.util.ArrayList;

public class Question {
    private String question;
    private String type;   //cet attribut je pense que ça serait mieux si
    //c'est un attribut de type Type
    private String reponse1;
    private String reponse2;
    private String reponse3;
    private String reponse4;
    private List <Question> questionnaire = new ArrayList<> ();

 

    public Question(String question , String type,String reponse1,String reponse2,String reponse3,String reponse4,List<Question> questionnaire) {
        this.question=question;
        this.type=type;
        this.reponse1=reponse1;
        this.reponse2=reponse2;
        this.reponse3=reponse3;
        this.reponse4=reponse4;
        this.questionnaire=questionnaire;
    }

    //getter pr recup la question 
    public String getQuestion() {
        return question;
    }

    //on peut aussi ajouter un getter pour le type mais les autres ça sert pas a grand chose 
   // public String bonneReponse() {
		//return question;//methode qui utilise les 4 reponses
   // }
}