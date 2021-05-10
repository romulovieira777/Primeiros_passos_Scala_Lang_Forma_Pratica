package com.hobbit.projeto.scala.lang.collections

object SetApp extends App {

  val numeroSet = Set(1, 1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10)
  numeroSet.foreach(println)

  println("ToString: " + numeroSet)
  println("Head: " + numeroSet.head)
  println("Last: " + numeroSet.last)
  println("Tail: " + numeroSet.tail)

  val profissoesSet = Set("Desenvolvedora", "Programadora")
  println("Profissoes 1: " + profissoesSet)

  val profissoesSet2 = Set("PO", "Analista de Dados", "QA")
  println("profissoes 2: " + profissoesSet2.toString())

  val todasProfissoesSet = profissoesSet ++ profissoesSet2
  println("Todas as profissoes: " + todasProfissoesSet)

}
