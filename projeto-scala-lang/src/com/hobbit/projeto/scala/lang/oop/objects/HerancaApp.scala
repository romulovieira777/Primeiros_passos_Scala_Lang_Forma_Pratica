package com.hobbit.projeto.scala.lang.oop.objects

import com.hobbit.projeto.scala.lang.oop.heranca.{Humano, Leao}

object HerancaApp extends App {

  val humano = new Humano
  println(humano.nome)
  humano.trabalho()

  val leao = new Leao
  println(leao.nome)
  leao.trabalho()
  leao.alimentacao()

}
