package com.hobbit.projeto.scala.lang.caseclass

object ConhecendoCaseClass extends App {

  case class Funcionario(var nome: String, idade: Int, telefoneComercial: String = "+55 11 3322-0000"){}

  val carl = new Funcionario(nome = "Felicity Smoke", idade = 38)
  println("Nome funcionario 1 " + carl.nome)
  println("Idade da Felicity " + carl.idade)
  println("Telefone " + carl.telefoneComercial)

  carl.nome = "Novo nome para Felicity"
  println("Felicity Smoke tem um novo nome ---> " + carl.nome)
  println(carl)

}
