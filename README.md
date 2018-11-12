## 1. Integrantes del Equipo

> + Manuela Valencia Toro
> + Laura Sánchez Córdoba
> + Orlando Montoya Benítez

## 2. Nombre del Patrón
>Facade Pattern

## 3. Problemática del patrón
> Facade es un tipo de patrón de diseño estructural. Viene motivado por la necesidad de estructurar un entorno de programación y reducir su complejidad con la división en subsistemas, minimizando las comunicaciones y dependencias entre estos.

## 4. Modelo de Clases o Secuencia del Ejemplo
>![Facade.png](https://github.com/omontoy/softwareExposition/blob/master/Facade.png?raw=true)
## 5. Lenguaje de programación del patrón
>Java

## 6. Descripción de ejecución del código
>Se crea una interfaz Shape y clases concretas que implementen la interfaz Shape. Una clase de fachada ShapeMaker se define como un siguiente paso.

>La clase ShapeMaker usa las clases concretas para delegar las llamadas de los usuarios a estas clases. FacadePattern, nuestra clase de demostración, usará la clase ShapeMaker para mostrar los resultados.

## 7. Sitios web  consultados
>[Patrón Facade](http://patronesdediseno.blogspot.com/2009/05/patronfacade.html)

>[Facade Pattern](http://jargon.js.org/_glossary/FACADE_PATTERN.md)

>[Pattern Video](https://www.youtube.com/watch?v=B1Y8fcYrz5o)
