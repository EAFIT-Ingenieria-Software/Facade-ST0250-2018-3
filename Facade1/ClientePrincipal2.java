/*
Esta clase se encarga de utilizar la clase Facade
para mostrar el funcionamiento del patrón, donde
de manera simple, se instancia la clase Facade y 
se llaman el o los métodos allí implementados.
*/

public class ClientePrincipal2 {

    public static void main(String[] args) {
              
        FacadeImpresoraNormal fachada1 = new FacadeImpresoraNormal("Texto1");
        fachada1.imprimir();
        
        FacadeImpresoraNormal fachada2 = new FacadeImpresoraNormal("Texto2");
        fachada2.imprimir();
        
        Impresora i3 = new Impresora();
        i3.setHoja("A4");
        i3.setColor(true);
        i3.setTipoDocumento("Excel");
        i3.setTexto("Texto3");
        i3.imprimirDocumento();
             
    }

}
