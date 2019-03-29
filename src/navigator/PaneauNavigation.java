/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JList;
import javax.swing.JPanel;
import navigator.basicobjects.NavObject;

/**
 *
 * @author abdel
 */
public class PaneauNavigation extends JPanel{
    private ArrayList<NavObject> objetsNavigation;
    private JList types_visibles;
    Image image=null;
    int scale;

    public void setImage(Image image) {
        this.image = image;
        setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
        
    }

    public void setScale(int scale) {
        this.scale = scale;
    }
    
    
    
    public PaneauNavigation(JList types_visibles) {
        super();
        this.types_visibles=types_visibles;
        objetsNavigation = new ArrayList<>();
        scale=1;
        setPreferredSize(new Dimension(600, 600));
        repaint();
    }

    public ArrayList<NavObject> getObjetsNavigation() {
        return objetsNavigation;
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d= (Graphics2D)g;
        g2d.scale(scale, scale);
        g2d.drawImage(image, 0, 0,null);
        objetsNavigation.forEach((next) -> {
            boolean v=false;
            for (int typeV : types_visibles.getSelectedIndices()) {
                if(next.getType()==typeV){v=true;break;}
            }
            if(next.isVisibilite() && v)next.draw(g2d);
        });
    }
    
    
    
    
}
