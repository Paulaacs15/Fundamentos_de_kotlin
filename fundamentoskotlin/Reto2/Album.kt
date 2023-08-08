package com.paulaacs15.fundamentoskotlin.Reto1.Reto2

class Album {
}
fun main(){

    println("Que tipo de musica es el Albúm?")
    var al:String= readLine()!!.toString().lowercase()

    println("¿Cuantas canciones tiene el Albúm?")
    var can:Int=readLine()!!.toInt()

    var album= mutableListOf<MutableList<Any>>()
    for(i in 1..can){
        println("Ingresa el nombre de la canción")
        var nom:String= readLine()!!.toString().lowercase()
        println("Ingresa el Artista de la canción")
        var ar:String= readLine()!!.toString().lowercase()
        println("Ingresa el año de publicación de la canción")
        var pub:Int= readLine()!!.toInt()
        println("Ingresa el recuento de reproducciones")
        var repro:Int= readLine()!!.toInt()
        album.add(mutableListOf(nom,ar,pub,repro))

        for (i in 1..album.size) {
            var Repro = album[i][3] as Int
            if (Repro>= 1000) {
                println("${album[i][0]}  popular")
            }else{
                println("${album[i][0]} no es  popular")
            }
        }
        for (i in album.withIndex()){
            println(i)
        }
    }
}