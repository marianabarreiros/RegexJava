/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import expressoes.Expressoes;

/**
 *
 * @author Win-7
 */
public class RunApp {
    public static void main(String[] args) {
        Expressoes ex = new Expressoes("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)");
        System.out.println(ex.comecaETermina());
    }
}
