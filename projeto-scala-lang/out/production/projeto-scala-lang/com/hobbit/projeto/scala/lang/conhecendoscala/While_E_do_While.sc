// Declarando uma variavel
var numero = 0

// Criando um laço de repetição utilizando o while
while(numero <= 10){
  println("Numero eh: " + numero)
  numero = numero + 1
}


// Criando uma lista de roupas
val roupas = List("Camiseta", "Calca", "Shorts", "Bermuda")

// Criando um laço de repetição utilizando o while
var contador = 0

while(contador < roupas.size){
  println("Roupa: " + roupas(contador))
  contador = contador + 1
}


// Criando uma variavel
var connected = false

// Criando uma laço de repetição usando do While

def toConnect(): Unit = {
  println("Tentando conectar ao banco de dados")
  connected = true
  println("Conexao efetuada com sucesso!")
}

do{
  toConnect()
} while(!connected)
