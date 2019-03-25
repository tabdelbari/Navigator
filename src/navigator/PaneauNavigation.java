/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JPanel;
import navigator.basicobjects.NavObject;

/**
 *
 * @author abdel
 */
public class PaneauNavigation extends JPanel{
    private ArrayList<NavObject> objetsNavigation;
    Image image=null;

    public void setImage(Image image) {
        this.image = image;
        setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
        
    }
    
    
    
    public PaneauNavigation() {
        super();
        objetsNavigation = new ArrayList<>();
        setPreferredSize(new Dimension(600, 600));
        repaint();
    }

    public ArrayList<NavObject> getObjetsNavigation() {
        return objetsNavigation;
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0,null);
        objetsNavigation.forEach((next) -> {
            next.draw(g);
        });
    }
    
    
    
    
}
