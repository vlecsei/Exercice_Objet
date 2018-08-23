package Vivants;

import javax.swing.JOptionPane;

public class Humains {
    
    
  //VARIABLES  
    boolean emploi;
    int nbrePieds;
    String nom;
    String surnom;
    String nourriture;
    String boisson;
    String communication;
    
    
  //DECLARATION DE MES SETTERS ET GETTERS------------------------------------------------------------------------------
    
    
    //EMPLOI-------------------------
    public boolean isEmploi() {
        return emploi;
    }
    public void setEmploi(boolean emploi) {
        
        //JOptionPane.showInputDialog(null, "A-t-il un emploi ?", "Emploi", JOptionPane.QUESTION_MESSAGE);
        this.emploi = emploi;         
    }
    
    
    //NOMBRE DE PIEDS-------------------
    public int getNbrePieds() {
        return nbrePieds;
    }
    public void setNbrePieds(int nbrePieds) {
        this.nbrePieds = nbrePieds;
        Integer.parseInt(JOptionPane.showInputDialog(null, "Combien a-t-il de pieds ?", "Pieds", JOptionPane.QUESTION_MESSAGE));
    }
    
    
    //NOM--------------------------------
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
        JOptionPane.showInputDialog(null, "Quel est son nom ?", "Nom", JOptionPane.QUESTION_MESSAGE);
    }
    
    
    //SURNOM------------------------------
    public String getSurnom() {
        return surnom;
    }
    public void setSurnom(String surnom) {
        this.surnom = surnom;
        JOptionPane.showInputDialog(null, "Quel est son surnom ?", "Surnom", JOptionPane.QUESTION_MESSAGE);
    }
    
    
    //NOURRITURE----------------------------
    public String getNourriture() {
        return nourriture;
    }
    public void setNourriture(String nourriture) {
        this.nourriture = nourriture;
        JOptionPane.showInputDialog(null, "Que mange-t-il ?", "Nourriture", JOptionPane.QUESTION_MESSAGE);
    }
    
    
    //BOISSON------------------------------
    public String getBoisson() {
        return boisson;
    }
    public void setBoisson(String boisson) {
        this.boisson = boisson;
        JOptionPane.showInputDialog(null, "Que boit-il ?", "Boisson", JOptionPane.QUESTION_MESSAGE);
    }
    
    
    //COMMUNICATION--------------------------
    public String getCommunication() {
        return communication;
    }
    public void setCommunication(String communication) {
        this.communication = communication;
        JOptionPane.showInputDialog(null, "Comment communique-t-il ?", "Communication", JOptionPane.QUESTION_MESSAGE);
    }
   
    
  //-------------------------------------------------------------------------------------------------------------------  
    
    
    //DECLARATION DE MON CONSTRUCTEUR
    public Humains(boolean emploi, int nbrePieds, String nom, String surnom, String nourriture, String boisson,
	    String communication) {
	super();
	this.emploi = emploi;
	this.nbrePieds = nbrePieds;
	this.nom = nom;
	this.surnom = surnom;
	this.nourriture = nourriture;
	this.boisson = boisson;
	this.communication = communication;
    }
    @Override
    public String toString() {
	return "Un humain " + emploi + ", il possède " + nbrePieds + " pour marcher, il s'appelle " + nom + ", et son surnom est " + surnom
		+ ", il mange " + nourriture + ", boit de " + boisson + " et communique en " + communication;
    }
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
}
