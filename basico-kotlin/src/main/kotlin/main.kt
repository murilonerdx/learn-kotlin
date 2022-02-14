

class Conta{
    private var titular: String = "Murilo"
    private var numeroConta: Int = 1000
    private var saldo: Double = -1.0
    private var contaAtiva: Boolean = true

    override fun toString(): String {
        return "Conta(titular='$titular', numeroConta=$numeroConta, saldo=$saldo, contaAtiva=$contaAtiva)"
    }

    fun getTitular(): String{
        return titular
    }

    fun getNumeroConta(): Int{
        return numeroConta
    }

    fun getSaldo(): Double{
        return saldo
    }

    fun getContaAtiva(): Boolean{
        return contaAtiva
    }

    fun setNumeroConta(numeroConta: Int){
        this.numeroConta = numeroConta
    }

    fun setSaldo(saldo: Double){
        this.saldo = saldo
    }

    fun setTitular(titular: String){
        this.titular = titular
    }

}

fun main() {
    print("Hello world")

    val titulo = "Homem aranha de volta para São Paulo"

    //val filme = titulo + " 2"
    //print(filme)

    println("$titulo 2")


    /**
    Val é um tipo de variavel imutavel
    val a = 1
    a = 2

     */

    //Var é um tipo de variavel mutavel
    var b = 1
    b = 2

    //Existem tipos para atribuir
    val conta = Conta()

    conta.setNumeroConta(2000)
    println("Titular: " + conta.getTitular())
    println("Numero da conta: " + conta.getNumeroConta())
    println("Saldo: " + conta.getSaldo())


    /**
    if(contaAtiva && saldo >= 0.0){
    println("A conta está ativa")
    }else if(saldo <= 0.0){
    println("A conta está negativa")
    }else{
    println("A conta não está ativa")
    }
     */

    testaCondicoes(conta)
    indicador()

//    for(i in 0..3){
//        println(i)
//    }

    //Step = contador + 3 e downTo decrement
    for (i in 6 downTo 0 step 3) {
        println(i)
    }

    var i = 0

    while (i < 5) {
        i++
        println(i)
    }

//    do{
//        i++
//        println(i)
//    }while(i < 5)

    val contaAlex = Conta()
    contaAlex.setTitular("Alex")
    contaAlex.setNumeroConta(1000)
    contaAlex.setSaldo(200.0)


    val contaFran = Conta()
    contaFran.setTitular("Fran")
    contaFran.setNumeroConta(1010)
    contaFran.setSaldo(300.0)

    println(contaFran.getTitular())
    println(contaFran.getNumeroConta())
    println(contaFran.getSaldo())

    println(contaAlex.getTitular())
    println(contaAlex.getNumeroConta())
    println(contaAlex.getSaldo())

    println("depositando na conta do Alex")
    deposita(contaAlex, 50.0)
    println(contaAlex.getSaldo())

    println("depositando na conta da Fran")
    deposita(contaFran, 70.0)
    println(contaFran.getSaldo())
}


fun testaCondicoes(conta: Conta) {
    when {
        conta.getContaAtiva() && conta.getSaldo() >= 0.0 -> {
            println("A conta está ativa")
        }
        conta.getSaldo() <= 0.0 -> {
            println("A conta está negativa")
        }
        else -> {
            println("A conta não está ativa")
        }
    }
}

fun indicador() {
    var i = 0;
    while (i < 5) {
        val titular: String = "Alex $i";
        val numeroConta: Int = 1000 + i;
        var saldo = i + 10.0;

        println("titular $titular");
        println("número da conta $numeroConta");
        println("saldo da conta $saldo");
        println();
        i++;
    }
}

fun deposita(conta: Conta, valor: Double){
    conta.setSaldo(conta.getSaldo() + valor)
}

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.setTitular("João")
    var contaMaria = Conta()
    contaMaria.setTitular("Maria")
    contaJoao.setTitular("João")

    println("titutar conta joao: ${contaJoao.getTitular()}")
    println("titutar conta maria: ${contaMaria.getTitular()}")

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos(){
    var i = 0
    while(i < 5){
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}