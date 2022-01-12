import javax.swing.*;  
import java.awt.event.*;  
class PopupMenuExample  
{  
     PopupMenuExample(){  
         final JFrame f= new JFrame("PopupMenu Example");  
         final JPopupMenu popupmenu = new JPopupMenu("Edit");   
         JMenuItem file = new JMenuItem("File");  
         JMenuItem view = new JMenuItem("View");  
         JMenuItem open = new JMenuItem("Open");  
         popupmenu.add(file); popupmenu.add(view); popupmenu.add(open);        
         f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
         });  
         f.add(popupmenu);   
         f.setSize(300,300);  
         f.setLayout(null);  
         f.setVisible(true);  
     }  
public static void main(String args[])  
{  
        new PopupMenuExample();  
}}  
