package com.vladimir.vivant;

public class Humains extends Vivants {
    
    
    private String nom;
    private int nbrePieds;
    private boolean emploi;
    
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNbrePieds() {
        return nbrePieds;
    }
    public void setNbrePieds(int nbrePieds) {
        this.nbrePieds = nbrePieds;
    }
    public boolean isEmploi() {
        return emploi;
    }
    public void setEmploi(boolean emploi) {
        this.emploi = emploi;
    }
    public Humains(String nourriture, String boisson, String communication, String surnom, String nom, int nbrePieds,
	    boolean emploi) {
	super(nourriture, boisson, communication, surnom);
	this.nom = nom;
	this.nbrePieds = nbrePieds;
	this.emploi = emploi;
    }
    @Override
    public String toString() {
	return "Humains [nom=" + nom + ", nbrePieds=" + nbrePieds + ", emploi=" + emploi + ", nourriture=" + nourriture
		+ ", boisson=" + boisson + ", communication=" + communication + ", surnom=" + surnom + "]";
    }
    
    
    
    
    
    
    
}
