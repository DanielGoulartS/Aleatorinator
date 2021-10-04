/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteinator;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import jdk.dynalink.linker.support.Guards;

/**
 *
 * @author Daniel
 */
public class Sorteinator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        JLabel label1 = new JLabel();
        Random rand = new Random();
        String texto;
        StringBuilder str = new StringBuilder("<br>");
        int r1, r2, range = 15;
        ArrayList<String> substantivos = new ArrayList<String>();
        ArrayList<String> adjetivos = new ArrayList<String>();
        substantivos.add("Espada");
        substantivos.add("Elmo");
        substantivos.add("Fantasma");
        substantivos.add("Soldado");
        substantivos.add("Réptil");
        substantivos.add("Dragão");
        substantivos.add("Seu Personagem Preferido");
        substantivos.add("Golem");
        substantivos.add("Felino");
        substantivos.add("Lich");
        substantivos.add("Super-Herói");
        substantivos.add("Entidade(Folclore, Mitologia...)");
        substantivos.add("Quimera");
        substantivos.add("Pokémon");
        substantivos.add("Super-Vilão");
        adjetivos.add("Multi-Colorido");
        adjetivos.add("Sombrio");
        adjetivos.add("da Galáxia");
        adjetivos.add("Selvagem");
        adjetivos.add("Velho Oeste");
        adjetivos.add("Praiano");
        adjetivos.add("Gótico");
        adjetivos.add("de Inverno");
        adjetivos.add("em Chamas");
        adjetivos.add("Fashion");
        adjetivos.add("Oriental");
        adjetivos.add("Brasileiro");
        adjetivos.add("Oakley");
        adjetivos.add("Cristal");
        adjetivos.add("Churrasco");

        for (int i = 0; i < 10; i++) {
            r1 = rand.nextInt(range);
            r2 = rand.nextInt(range);
            texto = ((i+1) + ": " + substantivos.get(r1) + " " + adjetivos.get(r2) + " !<br>");
            str.append(texto);
            substantivos.remove(r1);
            adjetivos.remove(r2);
            range--;
            r1--;
            r2--;
        }
        
        janela.setBounds(500, 200, 500, 500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setResizable(false);
        
        label1.setBounds(0,40,500,460);
        label1.setFont(new java.awt.Font("Dialog", 5, 20));
        label1.setForeground(new java.awt.Color(14,14,82));
        label1.setText("<html>   Aleatorinator Challenge:<br>"
                + "   Desenhe os conteúdos gerados pelo Aleatorinator! <br>"
                + "   Ou não,"
                + "   sou só um algoritmo, não seu patrão.<br>"
                + "------------------------------------------------<br>"
                + str
                + "------------------------------------------------<br>"
                + "Printe-me, não salvo dados!</html>");
        
        janela.add(label1);
        janela.setVisible(true);
    }
}
