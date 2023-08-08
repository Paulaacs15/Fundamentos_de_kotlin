package com.paulaacs15.fundamentoskotlin.Reto1

class Notificaciones {
}
fun main(){
    var cont=0
    do{
        println("¿Recibiste alguna notificacion?")
        var res: String = readLine()!!.toString().lowercase()

        cont=cont+1
        println("¿Recibiste otra notificacion?")
        var res1:String=readLine()!!.toString().lowercase()

    }while(res1.equals("si"))
        if (cont<=100){
            println("La cantidad de noticificaciones que recibiste fueron ${cont}")

        }else if(cont>=99){
            println("99+ mas notificaciones")

        }else if(cont <=0){
            println("No tienes notificaciones")
        }
    println("Gracias por utilizar el programa")
}
