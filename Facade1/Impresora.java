/*
Esta es una clase sencilla que imprime documentos en uno 
u otro formato. El código de la clase cliente nos ayudará a 
entender mejor su funcionamiento.
*/

public class Impresora {

    private String tipoDocumento;
    private String hoja;
    private boolean color;
    private String texto;
    

    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getHoja() {
        return hoja;
    }
    public void setHoja(String hoja) {
        this.hoja = hoja;
    }
    public boolean isColor() {
        return color;
    }
    public void setColor(boolean color) {
        this.color = color;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void imprimirDocumento() {
        System.out.println("Imprimiendo: "+ texto + " ,Color: "
        + color+" ,Tipo: "+tipoDocumento+" ,Hoja: "+hoja);
    }
}
