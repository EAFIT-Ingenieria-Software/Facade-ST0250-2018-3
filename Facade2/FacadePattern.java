/*
Esta clase usa la clase Facade ShapeMaker 
para dibujar varios tipos de formas (Shapes)
*/

public class FacadePattern {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();    
   }
}