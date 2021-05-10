package com.hobbit.projeto.scala.lang.collections

object MapApp extends App {

  var coresMap: Map[Char, String] = Map('A' -> "Azul", 'M' -> "Marrom")
  coresMap.foreach(println)
  coresMap += ('R' -> "Roxo")
  coresMap.foreach(println)

  // Usando filtro para tirar a cor Azul
  val coresMap2 = coresMap.filterKeys(_ != 'A')
  coresMap2.foreach(println)

  // Transformando o map em list
  val maptoList = coresMap2.toList
  println(maptoList)

}
