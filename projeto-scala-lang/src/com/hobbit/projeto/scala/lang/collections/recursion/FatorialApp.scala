package com.hobbit.projeto.scala.lang.collections.recursion

object FatorialApp extends App {

  def fatorial(numero: Int): Int = {
    if(numero == 1)
      1
    else
      numero * fatorial(numero - 1)
  }

  var numero = 4
  println("O fatorial do numero: " + numero + " eh " + fatorial(numero))

}
