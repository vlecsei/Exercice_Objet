package com.vladimir.vivant;

public class Chats extends Vivants{
    
    
    private int nbrePattes;

    public int getNbrePattes() {
        return nbrePattes;
    }

    public void setNbrePattes(int nbrePattes) {
        this.nbrePattes = nbrePattes;
    }

    public Chats(String nourriture, String boisson, String communication, String surnom, int nbrePattes) {
	super(nourriture, boisson, communication, surnom);
	this.nbrePattes = nbrePattes;
    }

    @Override
    public String toString() {
	return "Chats [nbrePattes=" + nbrePattes + ", nourriture=" + nourriture + ", boisson=" + boisson
		+ ", communication=" + communication + ", surnom=" + surnom + "]";
    }
    
    
    
    
    
    
    
    

}
