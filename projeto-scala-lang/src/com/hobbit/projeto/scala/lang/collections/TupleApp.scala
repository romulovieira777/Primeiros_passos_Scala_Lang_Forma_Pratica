package com.hobbit.projeto.scala.lang.collections

object TupleApp extends App {

  val variosTiposJuntos = (12334, 3433l, 232d, "Ola tuple", Array("Item 1", "Item 2"))
  println(variosTiposJuntos)
  println("Elemento 01: " + variosTiposJuntos._1)
  println("Elemento 02: " + variosTiposJuntos._2)
  println("Elemento 03: " + variosTiposJuntos._3)
  println("Elemento 04: " + variosTiposJuntos._4)
  println("Elemento 05: " + variosTiposJuntos._5(0))
  println("Elemento 05: " + variosTiposJuntos._5(1))

  val itemArray = variosTiposJuntos._5
  itemArray.foreach(println)

}
