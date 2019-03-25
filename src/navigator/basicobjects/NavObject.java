/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator.basicobjects;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author abdel
 */
public abstract class NavObject {
    protected String titre;
    protected String adresse;
    
    /**
     * position x
     */
    protected int x;
    /**
     * position y
     */
    protected int y;
    /**
     * la coleur d'objet
     */
    protected Color couleur;
    /**
     * taille d'objet
     */
    protected int size;
    /**
     * visibilite
     */
    protected boolean etat;

    public NavObject() {
        this.titre = "";
        this.adresse = "";
        this.x = 0;
        this.y = 0;
        this.couleur = Color.GRAY;
        this.size = 10;
        this.etat = true;
    }

    
    
    
    /**
     *
     */
    public NavObject(String titre, String adresse, int x, int y, Color couleur, int size, boolean etat) {    
        this.titre = titre;
        this.adresse = adresse;
        this.x = x;
        this.y = y;
        this.couleur = couleur;
        this.size = size;
        this.etat = etat;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
    public boolean apartient(int x, int y){
        return Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2))<=(size/2);
    }
    
    
    /**
     * methode qui permet de dissiner l'objet
     * @param g  objet du context graphique ou on va dissiner l'objet
     */
    public abstract void draw(Graphics g);
    
    
}
