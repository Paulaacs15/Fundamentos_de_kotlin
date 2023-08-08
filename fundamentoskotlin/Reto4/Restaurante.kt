package com.paulaacs15.fundamentoskotlin.Reto1.Reto4

class Restaurante {
}
fun main() {
    var entrada = mutableListOf<MutableList<String>>()
    var platosFuertes = mutableListOf<MutableList<String>>()
    var postres = mutableListOf<MutableList<String>>()
    var bebidas = mutableListOf<MutableList<String>>()

    /*ENTRADA*/
    println("Ingresa el nombre del plato")
    var nomEn: String = readLine()!!.toString().lowercase()
    println("Ingresa una descripcion del plato")
    var desEn: String = readLine()!!.toString().lowercase()
    println("Ingresa el precio del plato")
    var precioEn: String = readLine()!!.toString().lowercase()
    entrada.add(mutableListOf(nomEn, desEn, precioEn))

    for (i in entrada.withIndex()) {
        println(i)
    }
    println("Ingrese el codigo que quiere visualizar")
    var codEn: String = readLine()!!.toString()
    for (restaurante in entrada) {
        if (codEn == restaurante[1]) {
            println("La entrada es:${restaurante}")
            break
        }
    }
    println("Ingrese la posición de la entrada que quiere remplazar")
    var remEntrada:Int= readLine()!!.toInt()

    println("Ingresa el nombre del plato")
    var nomReEn:String= readLine()!!.toString()
    println("Ingresa una descripcion del plato")
    var desReEn:String= readLine()!!.toString()
    println("Ingresa el precio del plato")
    var preReEn:String= readLine()!!.toString()
    var nuevaEntrada=mutableListOf(nomReEn, desReEn,preReEn)

    entrada[remEntrada] = nuevaEntrada.toMutableList()
    println("La entrada fue reemplazada exitosamente")

    println("Ingrese la posición de la entrada que quiere eliminar")
    var eliEn:Int= readLine()!!.toInt()

    if(eliEn >= 0){
        entrada.removeAt(eliEn)
        println("La entrada fue eliminada exitosamente")
    } else {
        println("No se encontró ninguna entrada")
    }

    /*PLATO FUERTE*/
    println("Ingresa el nombre del plato")
    var nomPla: String = readLine()!!.toString().lowercase()
    println("Ingresa una descripcion del plato")
    var desPla: String = readLine()!!.toString().lowercase()
    println("Ingresa el precio del plato")
    var precioPla: String = readLine()!!.toString().lowercase()
    platosFuertes.add(mutableListOf(nomPla, desPla, precioPla))

    for (i in platosFuertes.withIndex()) {
        println(i)
    }
    println("Ingrese el codigo que quiere visualizar")
    var codPla: String = readLine()!!.toString()
    for (restaurante in platosFuertes) {
        if (codPla == restaurante[1]) {
            println("El plato fuerte es:${restaurante}")
            break
        }
    }
    println("Ingrese la posición del plato fuerte que quiere remplazar")
    var remPlato:Int= readLine()!!.toInt()

    println("Ingresa el nombre del plato fuerte")
    var nomRePla:String= readLine()!!.toString()
    println("Ingresa una descripcion del plato fuerte")
    var desRePla:String= readLine()!!.toString()
    println("Ingresa el precio del plato fuerte")
    var preRePla:String= readLine()!!.toString()
    var nuevaPlato=mutableListOf(nomPla,desPla,preRePla)

    platosFuertes[remPlato] = nuevaPlato.toMutableList()
    println("El plato fuerte fue reemplazada exitosamente")

    println("Ingrese la posición del plato fuerte que quiere eliminar")
    var eliPla:Int= readLine()!!.toInt()

    if(eliPla >= 0){
        platosFuertes.removeAt(eliPla)
        println("El plato fuerte fue eliminado exitosamente")
    } else {
        println("No se encontró ningún plato fuerte")
    }

    /*POSTRES*/
    println("Ingresa el nombre del plato")
    var nomPos: String = readLine()!!.toString().lowercase()
    println("Ingresa una descripcion del plato")
    var desPos: String = readLine()!!.toString().lowercase()
    println("Ingresa el precio del plato")
    var precioPos: String = readLine()!!.toString().lowercase()
    postres.add(mutableListOf(nomPos, desPos, precioPos))

    for (i in postres.withIndex()) {
        println(i)
    }

    println("Ingrese el codigo que quiere visualizar")
    var codPos: String = readLine()!!.toString()
    for (restaurante in postres) {
        if (codPos == restaurante[1]) {
            println("El postre es:${restaurante}")
            break
        }
    }
    println("Ingrese la posición del plato fuerte que quiere remplazar")
    var remPos:Int= readLine()!!.toInt()
    println("Ingrese la posición del postre que quiere remplazar")
    var nomRePos:String= readLine()!!.toString()
    println("Ingresa una descripcion del plato fuerte")
    var desRePos:String= readLine()!!.toString()
    println("Ingresa el precio del plato fuerte")
    var preRePos:String= readLine()!!.toString()
    var nuevaPostre=mutableListOf(nomRePos,desRePos,preRePos)

    postres[remPos] = nuevaPostre.toMutableList()
    println("El postre fue reemplazada exitosamente")

    println("Ingrese la posición del postre que quiere eliminar")
    var eliPos:Int= readLine()!!.toInt()

    if(eliPos >= 0){
        postres.removeAt(eliPos)
        println("El postre fue eliminado exitosamente")
    } else {
        println("No se encontró ningún postre")
    }

    /*BEBIDAS*/
    println("Ingresa el nombre del plato")
    var nomBe: String = readLine()!!.toString().lowercase()
    println("Ingresa una descripcion del plato")
    var desBe: String = readLine()!!.toString().lowercase()
    println("Ingresa el precio del plato")
    var precioBe: String = readLine()!!.toString().lowercase()
    bebidas.add(mutableListOf(nomBe, desBe, precioBe))

    for (i in bebidas.withIndex()) {
        println(i)
    }

    println("Ingrese el codigo que quiere visualizar")
    var codBe: String = readLine()!!.toString()
    for (restaurante in bebidas) {
        if (codBe == restaurante[1]) {
            println("La bebida es:${restaurante}")
            break
        }
    }
    println("Ingrese la posición de la bebida que quiere remplazar")
    var remBe:Int= readLine()!!.toInt()
    println("Ingrese la posición de la bebida que quiere remplazar")
    var nomReBe:String= readLine()!!.toString()
    println("Ingresa una descripcion de la bebida")
    var desReBe:String= readLine()!!.toString()
    println("Ingresa el precio de la bebida")
    var preReBe:String= readLine()!!.toString()
    var nuevaBebida=mutableListOf(nomReBe,desReBe,preReBe)

    postres[remBe] = nuevaBebida.toMutableList()
    println("La bebida fue reemplazada exitosamente")

    println("Ingrese la posición de la bebida que quiere eliminar")
    var eliBe:Int= readLine()!!.toInt()

    if(eliBe >= 0){
        bebidas.removeAt(eliBe)
        println("La bebida fue eliminada exitosamente")
    } else {
        println("No se encontró ninguna bebida")
    }
}