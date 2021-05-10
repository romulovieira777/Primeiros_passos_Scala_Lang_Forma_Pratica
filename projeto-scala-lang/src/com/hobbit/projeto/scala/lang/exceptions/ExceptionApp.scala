package com.hobbit.projeto.scala.lang.exceptions

object ExceptionApp extends App {

  def divide(a: Int, b: Int): Double = {

    if(b <= 0) throw new MinhaException("Não e possivel fazer a divisao por zero")
    a / b
  }

  println("Resultado da divisao: " + divide(80, 0))

}
