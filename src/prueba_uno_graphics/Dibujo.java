/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_uno_graphics;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author Uriel
 */
public class Dibujo extends Canvas implements ActionListener, MouseListener, MouseMotionListener{
    ArrayList lineas  = new ArrayList();
    boolean m_alzada= true, is_beginning= true,to_save=false;
    int uX,uY,x,y;
    Dibujo()
    {
        
    }
    @Override
    public void paint(Graphics g)
    {
        //super.paint(g);
        Graphics2D draw = (Graphics2D) g;
        if(this.is_beginning || this.to_save)
        {
            draw.setColor(Color.white);
            draw.fillRect(0, 0, this.getWidth(), this.getHeight());
            this.is_beginning= false;
        }
        if(this.m_alzada)
        {
            draw.setColor(Color.red);
            draw.drawLine(uX, uY, x, y);
            
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.uX = e.getX();
        this.uY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.x = e.getX();
        this.y = e.getY();
        this.paint(this.getGraphics());
        ArrayList ayuda = new ArrayList();
        ayuda.add(uX);
        ayuda.add(uY);
        ayuda.add(x);
        ayuda.add(y);
        this.lineas.add(ayuda);
        uX = x;
        uY = y;
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
