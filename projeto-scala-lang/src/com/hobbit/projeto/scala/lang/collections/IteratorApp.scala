package com.hobbit.projeto.scala.lang.collections

object IteratorApp extends App {

  val comprasIterator = Iterator("Boneh", "Calca", "Sapato", "Blusa", "Jaqueta")
  comprasIterator.foreach(println)

  while(comprasIterator.hasNext)
    print(comprasIterator.next() +", ")

}
