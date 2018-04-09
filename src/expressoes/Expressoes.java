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
        if(string.matches("^(?i)[a-z].*") && string.matches(".*[)]$"))
            return true;
        return false;
    }
    
    public String retiraEspacos(String string){
        string.replace(" ", "").trim();
        return string;
    }
}
