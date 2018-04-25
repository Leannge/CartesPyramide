/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartepyramide;

/**
 *
 * @author lea.fraioli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Menu compo = new Menu();
            compo.setTitle("Jeu de carte Pyramide : ");
            compo.setLocation(50, 50);
            compo.setSize(400,200);
            compo.setVisible(true);
            compo.setLocationRelativeTo(null);
            //compo.pack();
	}
    
}
