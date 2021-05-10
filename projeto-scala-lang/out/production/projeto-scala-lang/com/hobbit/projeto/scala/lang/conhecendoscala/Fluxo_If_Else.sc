def tipoDeComunicacao(tipo: String): Unit = {
  if(tipo == "email"){
    println("Enviar email ao cliente")
  } else if(tipo == "Celular"){
    println("Ligar para o cliente via celular")
  }
  else{
  println("Erro! esse eh outro tipo de comunicacao")
  }
}

tipoDeComunicacao(tipo = "Celular")
tipoDeComunicacao(tipo = "email")


// if ternary
val autorizacao = 18
var idade = 10
val result = if(idade< autorizacao) "Nao autorizado" else "Sim! Esta autorizado"
