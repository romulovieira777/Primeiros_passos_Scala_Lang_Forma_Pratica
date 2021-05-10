package com.hobbit.projeto.scala.lang.oop.heranca

class Leao extends SerVivo {
  override val nome: String = "Leao"
  override val especie: String = "Felino"
  override val quantidadeNoMundo: Double = 321231232.32
  override def alimentacao(): Unit = println("Carne")
  override def locomocao(): Unit = println("Anda com as 4 patas")
  override def trabalho(): Unit = println("Cacar")
}
