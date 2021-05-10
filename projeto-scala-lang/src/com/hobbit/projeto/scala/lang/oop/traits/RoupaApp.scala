package com.hobbit.projeto.scala.lang.oop.traits

import com.hobbit.projeto.scala.lang.oop.classes.Roupa

object RoupaApp extends App {

  val dao = new RoupaDao

  val vestido = dao.salvar(new Roupa(nome = "Vestido", tamanho = 46, marca = "Levis"))
  println(vestido.nome)
  println(vestido.marca)
  println(vestido.tamanho)

  // Excluir
  println("Foi excluido? " + dao.excluir(id = 26))

}
