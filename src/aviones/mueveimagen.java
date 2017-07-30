/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviones;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class mueveimagen extends JFrame {

    public mueveimagen() {
        super("Santos serna Rivera");
        initUI();
    }
    
    private void initUI() {
        
        add(new tablero());
        
        setSize(600,500);
        setResizable(false);
        
        setTitle("Santos serna Rivera");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                mueveimagen ex = new mueveimagen();
                ex.setVisible(true);
            }
        });
    }
}