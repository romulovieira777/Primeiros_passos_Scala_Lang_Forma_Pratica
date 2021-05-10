package com.hobbit.projeto.scala.lang.oop.objects

import com.hobbit.projeto.scala.lang.oop.classes.Roupa

object RoupaObject extends App {

  val roupa = new Roupa(nome = "Calçaaa", tamanho = 48, marca = "Hobbit")
  println("Valor 1 para nome " + roupa.nome)

  roupa.nome = "Calça"

  println("Valor 2 para nome " + roupa.nome)
  println("Marca: " + roupa.marca)
  println("Tamanho: " + roupa.tamanho)

}
