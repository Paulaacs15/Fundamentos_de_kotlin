package com.paulaacs15.fundamentoskotlin.Reto1.Reto5
import kotlin.random.Random
class Nequi {
}
fun main(){
    var celCo:Int=312382771
    var conCo:Int=1234
    var saldo:Int=4500
    var cont=3

    println("Ingrese su numero de celular")
    var cel: Int= readLine()!!.toInt()

    println("Ingrese su contraseña")
    var con:Int= readLine()!!.toInt()
    cont=cont-1
    do {
        if (celCo == cel && conCo == con) {
            println("Que función deseas utilizar 1.Sacar 2.Enviar 3.Recarga 4.Cerrar sesión")
            var res: Int = readLine()!!.toInt()
            if (res == 1) {
                println("Deseas retirar en 1.Cajero 2.Punto Fisico")
                var re: Int = readLine()!!.toInt()
                println("Cuanto dinero desea retirar")
                var retirar: Int = readLine()!!.toInt()
                if (retirar <= saldo) {
                    var retiro = Random.nextInt(900000, 1000000)
                    println("Retire en ${re}, con su codigo que es ${retiro}")
                } else if (retirar > saldo) {
                    println("No puedes retirar, saldo insuficiente")
                }
            } else if (res == 2) {
                println("Ingresa el numero de telefono al que deseas realizar el envio")
                var tel: Int = readLine()!!.toInt()
                println("Cuanto dinero desea enviar")
                var enviar: Int = readLine()!!.toInt()
                if (enviar <= saldo) {
                    println("El dinero fue envio, un total de ${enviar}")
                } else if (enviar > saldo) {
                    println("No puedes enviar, saldo insuficiente")
                }
            } else if (res == 3) {
                println("Ingresa el valor que deseas recargar")
                var re: Int = readLine()!!.toInt()
                println("deseas realizar la recarga")
                var res1: String = readLine()!!.toString().lowercase()
                if (res1 == "si") {
                    saldo = saldo + re
                    println("Tu recarga fue exitosa, tienes un valor de ${saldo}")
                } else if (res1 == "no") {
                    println("Tu recarga fue cancelada")
                }

            } else if (res == 4) {
                println("Saliendo")
            }
            println("Desea elegir otra opcion")
            var op: String = readLine()!!.toString().lowercase()
        }
    }while(op.equals("si"))
}