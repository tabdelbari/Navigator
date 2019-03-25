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
public class Airoport extends NavObject{
    private String desc;

    public Airoport() {
        super();
        couleur = Color.WHITE;
        this.desc = "";
    }

    public Airoport(String titre, String adresse, int x, int y, Color couleur, int size, boolean etat,String desc) {
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
        g.fillOval(x-(size/2), y-(size/2), size, size);   
    }
    
}
