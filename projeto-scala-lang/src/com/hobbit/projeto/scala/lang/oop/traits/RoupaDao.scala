package com.hobbit.projeto.scala.lang.oop.traits

import com.hobbit.projeto.scala.lang.oop.classes.Roupa

class RoupaDao extends DaoTrait [Roupa] {
  override def salvar(t: Roupa): Roupa = t
  override def excluir(id: Int): Boolean = true
}
