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
public class Hopital extends NavObject{
    private String desc;

    public Hopital() {
        super();
        couleur = Color.RED;
        this.desc = "";
    }

    public Hopital(String titre, String adresse, int x, int y, Color couleur, int size, boolean etat,String desc) {
        super(titre, adresse, x, y, couleur, size, etat);
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(couleur);
        int[] xPoints= {x-(size/6),x+(size/6),x+(size/6),x+(size/2),x+(size/2),x+(size/6),x+(size/6),x-(size/6),x-(size/6),x-(size/2),x-(size/2),x-(size/6)};
        int[] yPoints= {y-(size/2),y-(size/2),y-(size/6),y-(size/6),y+(size/6),y+(size/6),y+(size/2),y+(size/2),y+(size/6),y+(size/6),y-(size/6),y-(size/6)};
        g.fillPolygon(xPoints, yPoints, xPoints.length);   
    }
    
}
