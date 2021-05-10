package com.hobbit.projeto.scala.lang.oop.heranca

class Humano extends SerVivo {

  override val nome: String = "Ser Vivo"
  override val especie: String = "Ser Humano"
  override val quantidadeNoMundo: Double = 5354353534443.64
  override def alimentacao(): Unit = println("carnes, Vegetais e Doces")
  override def locomocao(): Unit = println("De Carro, a peh")
  override def trabalho(): Unit = println("Programadoras, Professoras, Presidentas, etc")
}
