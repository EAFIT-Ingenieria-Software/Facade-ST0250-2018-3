/*
Se crea la clase concreta Square que implementa 
la interfaz de la clase Shape
*/

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Square::draw()");
   }
}