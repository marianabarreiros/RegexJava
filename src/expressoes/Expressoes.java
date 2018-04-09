/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;





/**
 *
 * @author Win-7
 */
public class Expressoes {
    private String string;
    private String regex = "([a-zA-Z]{1})+:";
    private Pattern padrao;
    private Matcher matcher;
    

    public Expressoes(String string) {
        this.string = string;
    }
    
    public boolean validaPadrao(){
        this.comecaETermina();
        
            return true;  
    }
    
    private boolean comecaETermina(){
        this.retiraEspacos(string);
        if(string.matches("^[a-zA-Z].*") && string.matches(".*[)]$"))
            return true;
        else{
            System.out.println("A string não começa com letra e termina com o caracter ´)´. Favor corrigir!");
            return false;
        }
    }
    
    private String retiraEspacos(String string){
        string.replace(" ", "").trim();
        return string;
    }
}
