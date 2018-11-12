/*
Se crea la clase concreta Rectangle que implementa 
la interfaz de la clase Shape
*/

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }
}