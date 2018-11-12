/*
Esta es la clase Facade, la cual permite un funcionamiento
mucho más adecuado y entendible dado que solo debemos 
instanciar esta clase y que la clase ClientePrincipal2
utilice lo que aquí se ha implementado

*/

public class FacadeImpresoraNormal {

    Impresora impresora;
    
    public FacadeImpresoraNormal(String texto) {
        super();
        impresora = new Impresora();
        impresora.setColor(true);
        impresora.setHoja("A4");
        impresora.setTipoDocumento("PDF");
        impresora.setTexto(texto);
    }

    public void imprimir() {
        
        impresora.imprimirDocumento();
    }
    
}