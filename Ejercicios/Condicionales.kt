// Ejercicios KOTLIN

// La tienda "Mis Zapatos" está de aniversario, por esa razón se está realizando un descuento del 30% en compras mayores o iguales a los $ 100.000. Haga un algoritmo que permita validar cuando se debe aplicar un descuento a un cliente, en caso de que el descuento sea valido se debe informar al usuario indicando el valor descontado.

// fun main(){
//     println("Ingrese el valor de la compra")
//     var valorCompra=readLine()!!.toDouble()
//     if(valorCompra>=100000){
//         var descuento =valorCompra*0.3
//         valorCompra-=descuento
//         println("El valor del descuento es de: $descuento")
//     }
//     println("Valor final: $valorCompra")
// }

// Programa para determinar si un numero es par o impar.

// fun main() {
//     println("Ingrese un número: ")
//     val num = readLine()!!.toInt()
//     if (num % 2 == 0) {
//         println("El número es par")
//     } else {
//         println("El número es impar")
//     }
// }

// Programa para determinar el tipo de triángulo que se forma con tres números:

// fun main() {
//     println("Ingrese el primer lado: ")
//     val side1 = readLine()!!.toInt()
//     println("Ingrese el segundo lado: ")
//     val side2 = readLine()!!.toInt()
//     println("Ingrese el tercer lado: ")
//     val side3 = readLine()!!.toInt()
//     if(side1 == side2 && side2==side3){
//         println("Es un triángulo equilátero")
//     } else if(side1==side2 || side2==side3 || side1==side3){
//         println("Es un triángulo isósceles")
//     } else {
//         println("Es un triángulo escaleno")
//     }
// }

// Dado un menu de los 7 dias de la semana, haga un algoritmo que solicite el ingreso de un número e indique el dia correspondiente, valide si el código no existe.

// fun main(){
//     var dayNum=5
//     when (dayNum) {
//         1 -> println("Lunes")
//         2 -> println("Martes")
//         3 -> println("Miércoles")
//         4 -> println("Jueves")
//         5 -> println("Viernes")
//         6 -> println("Sábado")
//         7 -> println("Domingo")
//         else -> println("Día inválido")
//     }
// }

// Programa para calcular la suma de los números ingresados por el usuario hasta que ingrese el número cero:

// fun main() {
//     var sum = 0
//     var num: Int
//     println("Ingrese el numero 0 para terminar la suma")
//     do {
//         println("Ingrese un número: ")
//         num = readLine()!!.toInt()
//         sum += num
//     } while (num != 0)
//     println("La suma de los números ingresados es $sum")
// }

// Haga un algoritmo que solicite un número y halle su potencia, realice este proceso n cantidad de veces.

// fun main() {
//     var numero: Int
//     var continuar = "si"
//     while (continuar.uppercase() == "SI"){
//         print("Ingrese un número: ")
//         numero = readLine()!!.toInt()
//         println("La potencia del numero $numero es ${numero*numero}")
//         print("¿Desea ingresar otro número? (si/no): ")
//         continuar = readLine()!!
//     }
// }

// Programa para calcular la suma de los números del 1 al 100:

// fun main() {
//     var sum = 0
//     for (num in 1..100) {
//         sum += num
//     }
//     println("La suma de los números del 1 al 100 es $sum")
// }