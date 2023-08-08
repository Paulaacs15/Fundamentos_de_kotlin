package com.paulaacs15.fundamentoskotlin.Reto1.Reto3

class Subasta {
}
fun main(){
    println("¿Desea subastar algo?")
    var res1:String= readLine()!!.toString().lowercase()
    var subasta= mutableListOf<MutableList<Int>>()

    while (res1.equals("si")) {
        println("¿Que tipo de articulo desea subastar?")
        var arti: String = readLine()!!.toString().lowercase()
        println("Ingresa el precio base del articulo")
        var precio: Int = readLine()!!.toInt()

        println("Alguien ofrece mas del precio base?")
        var res: String = readLine()!!.toString().lowercase()
        if (res == "si") {
            while (res.equals("si")) {

                println("¿Cuanto ofrece?")
                var ofer: Int = readLine()!!.toInt()
                println("¿Alguien ofrece mas?")
                res = readLine()!!.toString().lowercase()
                subasta.add(mutableListOf(ofer))
            }
            println("El articulo fue vendido al precio mas  alto")
        }else {
            println("E articulo se vendio a la casa de subasta por el precio base")
        }
        }
}
