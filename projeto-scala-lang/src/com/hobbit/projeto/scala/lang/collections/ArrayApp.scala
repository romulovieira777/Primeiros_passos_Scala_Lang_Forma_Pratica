package com.hobbit.projeto.scala.lang.collections

object ArrayApp extends App {

  val aArray: Array[String] = new Array[String](2)
  println(aArray.length)

  // Outra maneira com o mesmo valor
  //val aArray = new Array[String](2)
  //println(aArray.length)

  /*val frutasArray = Array("Pera", "Uva", "Maca", "Laranja")
  println("Length: " + frutasArray.length)
  println("Size: " + frutasArray.size)
  println("Empty: " + frutasArray.isEmpty)
  println("Elemento 0: " + frutasArray(0))*/

  val frutasArray = Array("Pera", "Uva", "Maca", "Laranja")
  frutasArray.foreach(println(_))
  frutasArray.foreach(fruta => {
    print(fruta + ", ")
    fruta
  })

  // Criando um Array de números
  val numerosArray = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  numerosArray.foreach(println(_))

  // Filter
  val numerosPares = numerosArray.filter(numero => numero % 2 == 0)
  numerosPares.foreach(println(_))

  // Map
  val numeroMultiplicandoPorTres = numerosArray.map(_ * 3)
  numeroMultiplicandoPorTres.foreach(println(_))

}
