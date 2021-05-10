package com.hobbit.projeto.scala.lang.collections

object ListasApp extends App {

  val rangeNumeros = (1 to 10).toList
  println(rangeNumeros)

  val rangeLetrasMinusculas = ('a' to 'z').toList
  println(rangeLetrasMinusculas)

  val rangeLetrasMaiusculas = ('A' to 'Z').toList
  println(rangeLetrasMaiusculas)

  val rangeApartirDaList = List.range(1, 21)
  println(rangeApartirDaList)

  val listaDeLongs = List(234l, 34l, 67l)
  println(listaDeLongs)

  val listaBoolean = List(true, false, true, true, true)
  println(listaBoolean)

}
