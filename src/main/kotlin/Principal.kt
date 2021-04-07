fun main(parametro: Array<String>) {

    ej1()
    //ej2()
    //ej3()
    //ej4()
    //ej5 ->No es una func. Se ejecuta ingreso y calculo
    //ingreso()
    //calculo()

    //ej6 se llama 2 veces
    //ej6()
    //ej6()

}

//Ejercicio 1
fun ej1() {
    var acreedor: Int = 0
    var deudor: Int = 0
    var nulo: Int = 0
    var sumaacreedores: Int = 0
    var numerocuenta: Int = 1

    while (numerocuenta > 0) {
        println("Ingrese numero de cuenta: ")
        numerocuenta = readLine()!!.toInt()

        if (numerocuenta > 0) {
            println("Ingrese Saldo: ")
            var saldo: Int = readLine()!!.toInt()
            println("Numero de cuenta: $numerocuenta")
            println("Saldo disponible: $saldo")
            when {
                saldo > 0 -> {
                    println("Cliente es Acreedor")
                    acreedor++
                    sumaacreedores = sumaacreedores + saldo
                }
                saldo < 0 -> {
                    println("Cliente es Deudor")
                    deudor++
                }
                saldo == 0 -> {
                    println("Cliente sin deudas")
                    nulo++
                }
            }
        } else {
            numerocuenta = -1
            println("Registro Terminado!")
            println("Existen $deudor deudores en el sistema")
            println("Existen $nulo nulo en el sistema")
            println("Existen $acreedor ACREEDORES en el sistema")
            println("La suma total de los acreedores es de: $sumaacreedores")

        }
    }
}

//Ejercicio 2
fun ej2() {
    var pricuadrante: Int = 0
    var segcuadrante: Int = 0
    var tercuadrante: Int = 0
    var cuacuadrante: Int = 0
    var sincuadrante: Int = 0
    var cantidad: Int = 0

    println("Cuantos Puntos se ingresaran?: ")
    cantidad = readLine()!!.toInt()

    for (i in 1..cantidad) {
        println("Ingrese coordenada X: ")
        var x = readLine()!!.toInt()
        println("Ingrese coordenada Y: ")
        var y = readLine()!!.toInt()
        println("Punto ingresado")
        println("**Nuevo punto**")

        when {
            x > 0 && y > 0 -> pricuadrante++
            x < 0 && y > 0 -> segcuadrante++
            x < 0 && y < 0 -> tercuadrante++
            x > 0 && y < 0 -> cuacuadrante++
            x == 0 && y == 0 -> sincuadrante++
        }
    }
    println("$pricuadrante puntos en el primer cuadrante")
    println("$segcuadrante puntos en el segundo cuadrante")
    println("$tercuadrante puntos en el tercer cuadrante")
    println("$cuacuadrante puntos en el cuarto cuadrante")
    println("$sincuadrante puntos en (0.0)")

}

//Ejercicio 3
fun ej3() {

    var valor: Int
    var ingreso: Int = 10
    var contadorpos: Int = 0
    var contadorneg: Int = 0
    var contadormultiplos: Int = 0
    var acumupares: Int = 0

    for (i in 1..ingreso) {
        println("Ingresa Valor: ")
        valor = readLine()!!.toInt()
        when {
            valor > 0 -> {
                contadorpos++
                when {
                    valor % 2 == 0 && valor % 15 == 0 -> {
                        contadormultiplos++
                        acumupares = acumupares + valor
                    }
                    valor % 2 == 0 -> acumupares = acumupares + valor
                    valor % 15 == 0 -> contadormultiplos++
                }
            }
            valor < 0 -> contadorneg++
        }
    }

    println("Cantidad de numeros positivos: $contadorpos")
    println("Cantidad de numeros negativos: $contadorneg")
    println("Cantidad de numeros multiplos de 15 son:  $contadormultiplos")
    println("Suma total de numeros pares: $acumupares")
}

//Ejercicio 4
fun ej4() {
    var lado1: Int
    var lado2: Int
    var lado3: Int
    var cantidad: Int
    var contadorequil: Int = 0
    var contadorescaleno: Int = 0
    var contadorisoceles: Int = 0

    println("Cuantos triangulos ingresara: ")
    cantidad = readLine()!!.toInt()

    for (i in 1..cantidad) {

        println("Valor lado1: ")
        lado1 = readLine()!!.toInt()
        println("Valor lado2: ")
        lado2 = readLine()!!.toInt()
        println("Valor lado3: ")
        lado3 = readLine()!!.toInt()

        if (lado1 == lado2 && lado2 == lado3) {
            println("Triangulo Equilatero")
            contadorequil++
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {                        //tienen que evaluar todos los casos y solo nesecita que 2 lados sean iguales.
            println("Triangulo Isoceles")
            contadorisoceles++
        } else {
            println("Triangulo Escaleno")
            contadorescaleno++
        }
    }
    println("Cantidad de triangulos equilateros: $contadorequil")
    println("Cantidad de triangulos Isoceles: $contadorisoceles")
    println("Cantidad de triangulos Escalenos: $contadorescaleno")
}

//Ejercicio 5

fun ingreso() {
    var resultado: Int = 0

    println("Ingrese valor para mostrar su cuadrado: ")
    var valor: Int = readLine()!!.toInt()
    resultado = valor * valor
    println("El resultado es: $resultado")
}

fun calculo() {
    println("Ingrese primer valor: ")
    var valor1: Int = readLine()!!.toInt()
    println("Ingrese segundo valor: ")
    var valor2: Int = readLine()!!.toInt()

    var resultado: Int

    resultado = valor1 * valor2
    println("El producto es: $resultado")

}

//Ejercicio 6
fun ej6() {
    println("CALCULO DEL MENOR VALOR DE TRES")
    println("Ingrese primer valor: ")
    var valor1: Int = readLine()!!.toInt()
    println("Ingrese segundo valor: ")
    var valor2: Int = readLine()!!.toInt()
    println("Ingrese segundo valor: ")
    var valor3: Int = readLine()!!.toInt()

    when {
        valor1 < valor2 && valor1 < valor3 -> println("El menor valor es $valor1")
        valor2 < valor1 && valor2 < valor3 -> println("El menor valor es $valor2")
        valor3 < valor1 && valor3 < valor2 -> println("El menor valor es $valor3")
    }
}

//FIN