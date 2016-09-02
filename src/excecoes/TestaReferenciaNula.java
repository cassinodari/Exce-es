
package excecoes;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TestaReferenciaNula {
    public static void main (String[] args){
        Scanner scanner = null;
        int i = scanner.nextInt();
        System.out.println("O resultado é " + i);
    }
}
