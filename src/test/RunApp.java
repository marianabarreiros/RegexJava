/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import expressoes.Expressoes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Win-7
 */
public class RunApp {
    public static void main(String[] args) {
        String regex = "([a-zA-Z]{1})+:";
        String string = "Rewards: Especial:26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";
        Pattern padrao = Pattern.compile(regex);
        Matcher mat = padrao.matcher(string);
        
        while(mat.find()){
            System.out.println(mat.group());
        }
//        Expressoes ex = new Expressoes("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)");
//        System.out.println(ex.validaPadrao());
    }
}
