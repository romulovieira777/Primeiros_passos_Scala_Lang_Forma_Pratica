package com.hobbit.projeto.scala.lang.oop.heranca

abstract class SerVivo {

  // Declarando variaveis constantes
  val nome: String = "Ser Vivo"
  val especie: String
  val quantidadeNoMundo: Double

  // Declarando métodos
  def alimentacao(): Unit
  def locomocao(): Unit
  def trabalho(): Unit
  def extinto(): Boolean = false
}
