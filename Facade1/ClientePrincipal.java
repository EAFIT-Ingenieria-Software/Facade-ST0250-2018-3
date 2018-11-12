/*
La clase cliente se encarga de invocar a la impresora, 
y configurarla para después imprimir varios documentos.
Ahora bien, prácticamente todos los documentos que 
escribimos tienen la misma estructura (formato A4, Color , PDF). 

Estamos continuamente repitiendo código. Vamos a construir una nueva clase 
FacadeImpresoraNormal que simplifique la impresión de documentos que sean 
los más habituales.
*/

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