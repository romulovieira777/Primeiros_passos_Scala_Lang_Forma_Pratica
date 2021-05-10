def aFunction(): String = "Criando uma function em Scala"
aFunction
println(aFunction)


def soma(n1: Double, n2: Double): Double = n1 + n2
val result = soma(n1 = 5, n2 = 9)
println("Resultado da soma: " + result)
println("outra chamada a soma: " + soma(n1 = 7, n2 = 20))


def criaNomeCompleto(nome: String, nomeDoMeio: String, sobrenome: String): String = {
  var nomecompleto = nome.concat(nomeDoMeio)
  nomecompleto = nomecompleto.concat(sobrenome)
  nomecompleto
}

val nomeCompleto = criaNomeCompleto(nome = "Felicty ", nomeDoMeio = "Smoke ", sobrenome = "Arqueiro")


def functionRecebeAny(v: Any) = println("O valor recebido foi: " + v)

functionRecebeAny("Felicity")
functionRecebeAny(6453435.78d)
functionRecebeAny(false)
val aByte: Byte = 34
functionRecebeAny(aByte)


type Texto = String
def aviso(mensagem: Texto): String = "Atencao: " + mensagem

println(aviso(mensagem = "Scala nao precisa de ponto e virgula no final da linha"))
