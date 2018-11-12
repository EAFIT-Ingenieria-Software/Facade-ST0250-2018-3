

public class ClientePrincipal {

    public static void main(String[] args) {
        
        
        Impresora i = new Impresora();
        i.setHoja("A4");
        i.setColor(true);
        i.setTipoDocumento("PDF");
        i.setTexto("Texto 1");
        i.imprimirDocumento();
        
        Impresora i2 = new Impresora();
        i2.setHoja("A4");
        i2.setColor(true);
        i2.setTipoDocumento("PDF");
        i2.setTexto("Texto 2");
        i2.imprimirDocumento();
        
        Impresora i3 = new Impresora();
        i3.setHoja("A3");
        i3.setColor(false);
        i3.setTipoDocumento("Excel");
        i3.setTexto("Texto 3");
        i3.imprimirDocumento();
    }

}