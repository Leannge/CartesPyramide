/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartepyramide;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Menu extends JFrame
{	
        JPanel       p1, p2, p3, p4, p5;
	JLabel       jLabel1;
	JRadioButton jRadioButton1;
	JRadioButton jRadioButton2;
	JButton      btok;
        JButton      btnQuit;
    
    public Menu ()
    {
        //Définir la frame avec 5 lignes (pour les 5 pannels) et 1 colonne 
        setLayout(new GridLayout(5,1));
        
        // Création des objets
        JLabel jLabel1 = new JLabel("Choix du nombre de joueurs :");
	JRadioButton jRadioButton1 = new JRadioButton("Nouvelle une partie");
	JRadioButton jRadioButton2 = new JRadioButton("Charger une partie");
        JRadioButton jRadioButton3 = new JRadioButton("Sauvegarder une partie");
	JButton      btok          = new JButton("Ok");
        JButton      btnQuit       = new JButton("Annuler");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        //Evenement bouton annuler
        ActionListener actionAnnuler = new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(1);
            }
	};
        btnQuit.addActionListener(actionAnnuler);

        // Ajout des boutons dans le panel
	p1.add(jLabel1);
        p2.add(jRadioButton1);
        p3.add(jRadioButton2);
        p4.add(jRadioButton3);
        p5.add(btok);
        p5.add(btnQuit);
                
	// Ajout pannel à la frame
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
    }
    
}