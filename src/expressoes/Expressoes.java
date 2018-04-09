/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressoes;





/**
 *
 * @author Win-7
 */
public class Expressoes {
    private String string;

    public Expressoes(String string) {
        this.string = string;
    }
    
    
    public boolean comecaETermina(){
        this.retiraEspacos(string);
        if(string.matches("^[a-zA-Z].*") && string.matches(".*[)]$"))
            return true;
        else{
            System.out.println("A string não começa com letra e termina com o caracter ´)´. Favor corrigir!");
            return false;
        }
    }
    
    public String retiraEspacos(String string){
        string.replace(" ", "").trim();
        return string;
    }
}
