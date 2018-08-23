package Vivants;

public class Chats {
    
    
    int nbrePattes;
    String surnom;
    String nourriture;
    String boisson;
    String communication;
    
    
    
    //DECLARATION DES GETTERS ET SETTERS---------------------------------------------------------------------------------------------------------
    
    //NOMBRE DE PATTES----------------
    public int getNbrePattes() {
        return nbrePattes;
    }
    public void setNbrePattes(int nbrePattes) {
        this.nbrePattes = nbrePattes;
    }
    
    
    //SURNOM--------------------------
    public String getSurnom() {
        return surnom;
    }
    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }
    
    
    //NOURRITURE-----------------------
    public String getNourriture() {
        return nourriture;
    }
    public void setNourriture(String nourriture) {
        this.nourriture = nourriture;
    }
    
    
    //BOISSON----------------------------
    public String getBoisson() {
        return boisson;
    }
    public void setBoisson(String boisson) {
        this.boisson = boisson;
    }
    
    
    //COMMUNICATION-----------------------
    public String getCommunication() {
        return communication;
    }
    public void setCommunication(String communication) {
        this.communication = communication;
    }
   
    
  //-----------------------------------------------------------------------------------------------------------------------------------------------
    
    
    //DECLARATION DU CONSTRUCTEUR-------------------------------------------------------------------------------------------------------------------
    
     public Chats(int nbrePattes, String surnom, String nourriture, String boisson, String communication) {
	super();
	this.nbrePattes = nbrePattes;
	this.surnom = surnom;
	this.nourriture = nourriture;
	this.boisson = boisson;
	this.communication = communication;
    }
    
    //----------------------------------------------------------------------------------------------------------------------------------------------
    
    
    
    
    
}
