package com.hobbit.projeto.scala.lang.oop.objects

import com.hobbit.projeto.scala.lang.oop.classes.Colaborador

object ColaboradorObject {

  def main(args: Array[String]): Unit = {
    //print("Bem vindo a classe Object")

    val colaborador = new Colaborador
    colaborador.descricao()

    println(colaborador.mensagem(nome = "Felicity"))

  }


}
