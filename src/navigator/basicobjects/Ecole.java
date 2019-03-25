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
public class Ecole extends NavObject{
    private String desc;

    public Ecole() {
        super();
        couleur = Color.BLUE;
        this.desc = "";
    }

    public Ecole(String titre, String adresse, int x, int y, Color couleur, int size, boolean etat,String desc) {
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
        int[] xPoints= {x           ,x+(size/2),x+(size/3),x+(size/3)  ,x-(size/3)  ,x-(size/3),x-(size/2)};
        int[] yPoints= {y-(3*size/5),y-(size/5),y-(size/5),y+(2*size/5),y+(2*size/5),y-(size/5),y-(size/5)};
        g.fillPolygon(xPoints, yPoints, xPoints.length);
        g.setColor(Color.RED);
        g.fillOval(x-(size/12), y, (size/6), (size/5));
        g.fillRect(x, y, (2*size/6), (size/5));
        g.setColor(Color.GREEN);
        g.fillOval(x-(size/12), y+(size/5), (size/6), (size/5));
        g.fillRect(x, y+(size/5), (2*size/6), (size/5));
    }
    
}
