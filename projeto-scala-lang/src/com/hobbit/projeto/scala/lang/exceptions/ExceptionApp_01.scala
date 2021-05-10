package com.hobbit.projeto.scala.lang.exceptions

object ExceptionApp_01 extends App {

  try{
    //println(23 / 5)
    val a = "Carro"
    println(a.toString)
  } catch{
    case e: ArithmeticException => println("Foi uma ArithmeticException")
    case _ : Exception => println("Foi uma outra Exception!!")
  }finally {
    println("Sempre vai passar por aqui!!!!")
  }

}
