# CalculadoraCucumber

En este repositorio se va a realizar la implementación de la clase Calculadora y sus pruebas unitarias usando Cucumber y Gherkin.

Para ello, he creado cinco escenarios para cada uno de los métodos dentro de la clase Calculadora. Estos son suma, resta, multiplicación, división y factorial. Cada escenario realiza su correspondiente operación y consta de ejemplos para poder comprobar que el resultado sea correcto y pase los test.

El escenario suma consta de dos variables double las cuales, se suman y nos muestra el resultado guardado en una variable value.

El escenario resta consta de dos variables double que se restan y nos muestra el resultado guardado en una variable value.

El escenario multiplicación consta de dos variables double que se multiplican y nos muestra el resultado guardado en una variable value.

El escenario división consta de dos variables double que se dividen. Pero en este caso si se divide por 0 un número, nuestro test salta con un FAIL, ya que el resultado sería infinito y en nuestra calculadora eso no es posible.

Por último, el escenario factorial consta de una única variable de tipo entero que nos realiza la operación de factorial y nos la muestra.

(El código se encuentra en la rama master).
