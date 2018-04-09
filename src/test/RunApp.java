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
//      
        String outra = "";
        String regex = "([a-zA-Z]+:)?([0-9]{2})([a-zA-Z]{3})([0-9]{4})\\(([a-zA-Z]{3,4})\\)+";
        String string = "Rewards:26Mar2009(thur),27Mar2009(fri),28Mar2009(sat),28Mar2009(sat),28Mar2009(sat)";
        Pattern padrao = Pattern.compile(regex);
        Matcher mat = padrao.matcher(string);
        while(mat.find()){
            outra+=(mat.group());    
        }
        System.out.println(outra);
//        Expressoes ex = new Expressoes("Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)");
//        System.out.println(ex.validaPadrao());
    }
}
