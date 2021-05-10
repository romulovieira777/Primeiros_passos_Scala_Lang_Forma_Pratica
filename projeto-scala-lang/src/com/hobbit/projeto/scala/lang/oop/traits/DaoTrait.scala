package com.hobbit.projeto.scala.lang.oop.traits

trait DaoTrait[T] {

  def salvar(t: T): T
  def excluir(id: Int): Boolean

}
