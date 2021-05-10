import scala.runtime.BooleanRef

// Criando variaveis utilizando o comando match
val tipoComunicacao = "email"

val executaComunicacao = tipoComunicacao match {
  case "email" => "Enviar email ao cliente"
  case "celular" => "ligar para o cliente via celular"
  case _ => "Erro! o tipo de comunicacao não eh valido"
}


// Criando uma função utilizando o comando match
def executaComunicacao(tipoComunicacao: String): String = tipoComunicacao match {
  case "email" => "Enviar email ao cliente"
  case "celular" => "ligar para o cliente via celular"
  case _ => "Erro! o tipo de comunicacao não eh valido"
}

println(executaComunicacao(tipoComunicacao = "email"))


/*
* Match para Any
* */

// Criando uma função
def descobrirTipo(tipo: Any): Unit = tipo match {
  case s: String => println("O tipo informado foi String")
  case f: Float => println("O tipo informado foi Float")
  case i: Int => println("O tipo informado foi Int")
  case _ => println("Tipo nao reconhecido")
}

descobrirTipo(tipo = "Uma mensagem")
descobrirTipo(tipo = 222.22f)
descobrirTipo(tipo = 214)
descobrirTipo(tipo = 'A')


// Criando uma função Boolean com Math
def menorDeIdade(validacao: Boolean): Unit = validacao match {
  case true => println("Eh menor de idade")
  case false => println("Parabens eh maior de idade!!!")
}

menorDeIdade(validacao = 12 < 18)
menorDeIdade(validacao = 19 < 18)


// Criando uma função com Case Expression
def selecionarNomeDoMes(mes: Any): Unit = mes match {
  case 1 | "Jan" => println("Janeiro")
  case 2 | "Fev" => println("Fevereiro")
  case _ => println("Mes desconhecido")
}

selecionarNomeDoMes(1)
selecionarNomeDoMes("Fev")
selecionarNomeDoMes("2")
selecionarNomeDoMes(2)
