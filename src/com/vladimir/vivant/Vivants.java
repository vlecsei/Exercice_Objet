package com.vladimir.vivant;

public class Vivants {
    
 
    static String nourriture;
    static String boisson;
    static String communication;
    static String surnom;
   
    
    
  // GETTERS ET SETTERS---------------------------------------------------------------------------------------------------
    //NOURRITURE------------------------------
    public static String getNourriture() {
        return nourriture;
    }
    public static void setNourriture(String nourriture) {
        Vivants.nourriture = nourriture;
    }

    //BOISSON-----------------------------------
    public static String getBoisson() {
        return boisson;
    }
    public static void setBoisson(String boisson) {
        Vivants.boisson = boisson;
    }

    //COMMUNICATION---------------------------------
    public static String getCommunication() {
        return communication;
    }
    public static void setCommunication(String communication) {
        Vivants.communication = communication;
    }

    //SURNOM-----------------------------------------
    public static String getSurnom() {
        return surnom;
    }
    public static void setSurnom(String surnom) {
        Vivants.surnom = surnom;
    }

//--------------------------------------------------------------------------------------------------------------------------------

//CONSTRUCTEUR----------------------------------------------------------------------------------------------------------
   public Vivants(String nourriture, String boisson, String communication, String surnom) {
    super();
    Vivants.nourriture = nourriture;
    Vivants.boisson = boisson;
    Vivants.communication = communication;
    Vivants.surnom = surnom;
}


    public static void main(String[] args) {
	
	
	Chats minou = new Chats("des croquettes", " de l'eau", "miaulant", "Minou", 4);
	
	System.out.println("Minou : "+minou);
	
	Humains paul = new Humains( "de la viande", "du coca cola", "parlant", "Paulo", "Dupont", 2, false);
	
	System.out.println("Paul :"+paul);

    }


}
