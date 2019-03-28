/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator.basicobjects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.Serializable;

/**
 *
 * @author abdel
 */
public class NavObject implements Comparable<NavObject>,Serializable,Cloneable{
    
    private int type;
    private String titre;
    private String adresse;
    private Image image;
    private String description;
    private int x;
    private int y;
    private int size;
    //in the futur SCALE
    private boolean visibilite;

    
    public static final String[] types={"Hopital","Ecole","Pharmacie","Etablissement Public","Sation","Parc"};
    
    public NavObject() {
        this.type = 0;
        this.titre = "";
        this.adresse = "";
        this.image = null;
        this.description = "";
        this.x = 0;
        this.y = 0;
        this.size = 30;
        this.visibilite = true;
    }

    public NavObject(int type, String titre, String adresse, Image image, String description, int x, int y, int size, boolean visibilite) {
        this.type = type;
        this.titre = titre;
        this.adresse = adresse;
        this.image = image;
        this.description = description;
        this.x = x;
        this.y = y;
        this.size = size;
        this.visibilite = visibilite;
    }

    public static String[] getTypes() {
        return types;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isVisibilite() {
        return visibilite;
    }

    public void setVisibilite(boolean visibilite) {
        this.visibilite = visibilite;
    }

    public boolean apartient(int x, int y){
        return Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2))<=(size/2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ")
                .append(types[type]).append("::").append(titre)
                .append("@").append(adresse)
                .append(", position:(").append(x).append(", ").append(y).append(")]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof NavObject){
            NavObject o2 =(NavObject)obj;
            return (this.apartient(o2.x, o2.y) && this.type==o2.type);
        }else return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.type;
        hash = 23 * hash + this.x;
        hash = 23 * hash + this.y;
        return hash;
    }
    
    public void draw(Graphics g){
        int[] xPoints = null;
        int[] yPoints = null;
        switch(type){
            case 0: //"Hopital"
                g.setColor(Color.RED);
                xPoints= new int[]{x-(size/6),x+(size/6),x+(size/6),x+(size/2),x+(size/2),x+(size/6),x+(size/6),x-(size/6),x-(size/6),x-(size/2),x-(size/2),x-(size/6)};
                yPoints= new int[]{y-(size/2),y-(size/2),y-(size/6),y-(size/6),y+(size/6),y+(size/6),y+(size/2),y+(size/2),y+(size/6),y+(size/6),y-(size/6),y-(size/6)};
                g.fillPolygon(xPoints, yPoints, xPoints.length); 
                break;
            case 1: //"Ecole"
                g.setColor(Color.BLUE);
                xPoints= new int[]{x           ,x+(size/2),x+(size/3),x+(size/3)  ,x-(size/3)  ,x-(size/3),x-(size/2)};
                yPoints= new int[]{y-(3*size/5),y-(size/5),y-(size/5),y+(2*size/5),y+(2*size/5),y-(size/5),y-(size/5)};
                g.fillPolygon(xPoints, yPoints, xPoints.length);
                g.setColor(Color.RED);
                g.fillOval(x-(size/12), y, (size/6), (size/5));
                g.fillRect(x, y, (2*size/6), (size/5));
                g.setColor(Color.GREEN);
                g.fillOval(x-(size/12), y+(size/5), (size/6), (size/5));
                g.fillRect(x, y+(size/5), (2*size/6), (size/5));
                break;
            case 2: //"Pharmacie"
                g.setColor(Color.GREEN);
                xPoints= new int[]{x-(size/6),x+(size/6),x+(size/6),x+(size/2),x+(size/2),x+(size/6),x+(size/6),x-(size/6),x-(size/6),x-(size/2),x-(size/2),x-(size/6)};
                yPoints= new int[]{y-(size/2),y-(size/2),y-(size/6),y-(size/6),y+(size/6),y+(size/6),y+(size/2),y+(size/2),y+(size/6),y+(size/6),y-(size/6),y-(size/6)};
                g.fillPolygon(xPoints, yPoints, xPoints.length); 
                break;
            case 3: //"Etablissement Public"
                g.setColor(Color.GREEN);
                xPoints= new int[]{x           ,x+(size/2),x+(size/3),x+(size/3)  ,x-(size/3)  ,x-(size/3),x-(size/2)};
                yPoints= new int[]{y-(3*size/5),y-(size/5),y-(size/5),y+(2*size/5),y+(2*size/5),y-(size/5),y-(size/5)};
                g.fillPolygon(xPoints, yPoints, xPoints.length);
                break;
            case 4: //"Sation"
                g.setColor(Color.YELLOW);
                xPoints= new int[]{     x    ,x+(size/2),    x     ,x-(size/2)};
                yPoints= new int[]{y-(size/2),     y    ,y+(size/2),     y    };
                g.fillPolygon(xPoints, yPoints, xPoints.length);
                break;
            case 5: //"Parc"
                g.setColor(Color.green);
                g.fillRect(x-(size/4), y-(size/4), (size/2), (size/2));
                g.fillOval(x-(size/2), y-(size/4), (size/2), (size/2));
                g.fillOval(x-(size/4), y-(size/2), (size/2), (size/2));
                g.fillOval(x, y-(size/4), (size/2), (size/2));
                g.fillOval(x-(size/4), y, (size/2), (size/2));
                break;
            
        }
    }

    @Override
    public int compareTo(NavObject o) {
        return (this.type>o.type)?-1:1;
    }

    @Override
    protected Object clone() {
        return new NavObject(type, "", "", null, "", x, y, size, visibilite);
    }    
}
