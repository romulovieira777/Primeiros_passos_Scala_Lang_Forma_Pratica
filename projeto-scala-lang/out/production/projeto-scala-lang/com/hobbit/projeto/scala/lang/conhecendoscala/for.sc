// Criando um looping utilizando o for
for(numero <- 0 to 10) println("o valor do numero eh: " + numero)


// Criando uma função for para imprimir somente os numeros pares
for(numero <- 0 to 10 by 2) {
  println("Imprimindo o numero par desta vez: " + numero)
}


// Criando uma lista
val frutas = List("Banana", "Amora", "Abacaxi", "Uva")


// Criando um looping for para ler a lista
for(fruta <- frutas) println("Fruta: " + fruta)


// Criando uma lista de frutas que começam com a letra A
val frutasComecandoComLetraA = for{
  fruta <- frutas
  if(fruta.startsWith("A"))
} yield fruta.toUpperCase()

println(frutasComecandoComLetraA)
