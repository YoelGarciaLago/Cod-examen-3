/**
 * el main
 */
//aaaaaaa
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Singleton
         */
        Datos dato1 = Datos.getInstance();
        Datos dato2 = Datos.getInstance();
        Datos dato3 = Datos.getInstance();
        
        dato2.setNumero(4);
        
        System.out.println(dato1.getNumero());
        System.out.println(dato2.getNumero());
    
    
    }
}