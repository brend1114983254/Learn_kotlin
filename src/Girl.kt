
class Girl (var chactor:String,var voice:String){
    fun smile(){
        print("hahaha smile")
    }

    fun cry(){
        println("wuwuwu cry")
    }

}

fun main() {
    var girl1 = Girl("彪悍","甜美")
    println("girl的声音：${girl1.voice}")
    girl1.cry()
    girl1.smile()
}