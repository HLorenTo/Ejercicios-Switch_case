/*
Desarrollar una calculadora, la cual, en base a un operador, realice una 
operación con dos números enteros ya definidos y mostrar el resultado, 
los operadores a tener en cuenta son los vistos en la tabla de 
operadores aritméticos, sí deseas agregar más operadores, siéntete en 
libertad de hacerlo.
 */
package ejerciciosswitchcase;
public class Ejercicio2 {
public static void main(String[] args) {
    int numeroUno = 2;
    int numeroDos = 7;
    int operacion = 5;
    double resultado;
    switch (operacion)
    {
        case 0:
            resultado = numeroUno+numeroDos;
            System.out.println("El resultado de la suma es: " + resultado);
            break;
        case 1:
            resultado = numeroUno-numeroDos;
            System.out.println("El resultado de la resta es: " + resultado);
            break;
        case 2:
            resultado = numeroUno*numeroDos;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
            break;
        case 3:
            resultado = numeroUno/numeroDos;
            System.out.println("El resultado de la division es: " + resultado);
            break;
        case 4:
            resultado = numeroUno%numeroDos;
            System.out.println("El modulo de los numeros" +numeroUno +" y "+ numeroDos +" es: " + resultado);
            break;    
        default:
            System.out.println("No existe un valor valido");
                
    }
}    
}
