import java.math.BigInteger

//演示递归
//Int
/*
fun main() {
    var num = 30
    println(fact(num))
}

fun fact(num:Int):Int{
    if(num==1){
        return 1
    }else
        return num*fact(num-1)
}

 */

fun main() {
    var num = BigInteger.valueOf(100)
    //var num = BigInterger("100")
    println(fact(num))
}

fun fact(num:BigInteger):BigInteger{
    if(num == BigInteger.ONE){
        return BigInteger.ONE
    }else{
        return num*fact(num -BigInteger.ONE)
    }
}