/*
Se crea la clase concreta Circle que implementa 
la interfaz de la clase Shape
*/

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Circle::draw()");
   }
}