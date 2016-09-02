
package excecoes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main (String [] args){
        MinhaClasse mc = new MinhaClasse();
        
        try {
            mc.meuMetodo();
        } catch (Exception ex) {
            System.out.println("Deu erro " + ex.getMessage());
        }
    }
}
