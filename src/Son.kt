/*
孩子
 */
class Son: Father() {
    //子类重写父类的action()方法
    override fun action(){
        println("儿子很乖，在公共场合很有礼貌")
    }

}