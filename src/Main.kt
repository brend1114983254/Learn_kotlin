//今天天气晴朗，万里无云，我们去中山公园游玩
//首先映入眼帘的是，中山公园4个镏金大字
/*
fun diaryGenerate(placeName:String):String{
    var temple = """ 
今天天气晴朗，万里无云，我们去${placeName}游玩
首先映入眼帘的是，${placeName}${placeName.length}个镏金大字        
    """.trimIndent()

    return temple
}

fun main(args:Array<String>){
    var diary = diaryGenerate(placeName = "北京公园")
    println(diary)

    diary = diaryGenerate(placeName = "北京公园")
    println(diary)

}

 */

/*
//颜值判断器
fun checkFace(score:Int){
    if(score>80) println("这是一个帅哥")
    else println("这是一个衰哥")
}

fun main(args:Array<String>){
    var score = 70
    checkFace(score)
}

 */

/*
//返回两个数中较大的一个
fun returnBig(a:Int,b:Int):Int {
    if(a>b) return a else return b
}

fun main(args:Array<String>) {
    var a = 8
    var b = 10

    println("${a}和${b}较大的那个值为${returnBig(a,b)}")
}

 */

/*
//字符串比较
fun main(args:Array<String>){
    var str1 = "Anna"
    var str2 = "anna"
    println(str1 == str2)
    println(str1.equals(str2))
    println(str1.equals(str2,true))  //Boolean 为true 表示忽略字母大小写
}

 */


/*
//接受一个参数，参数是非空的String类型, 加上问号，代表参数可以为空
fun heat(str:String?):String{
    return "热" + str
}


fun main(args:Array<String>){
//    var str = "狗"
//    println(heat(str))
    var result = heat("狗")
    println(result)

    var str2 = null
    println(heat(str2))
}
 */


/*
//When
//10分 满分， 9 分 干的不错， 8分 还可以， 7分 ， 6分 刚好及格， 其他（）

fun gradeStudent(score:Int){
    when(score){
        10 -> println("满分")
        9 -> println("干的不错")
        8 -> println("还可以")
        7 -> println("还需努力")
        6 -> println("刚好及格")
        else -> println("需要加油")

    }
}

fun main(args:Array<String>){
gradeStudent(3)
}

 */

/*
//今天天气晴朗，万里无云，我们去${placeName}游玩
//首先映入眼帘的是，${placeName} ${numToChinese(placeName.length)}个镏金大字
fun diaryGenerate(placeName: String) {
var diary = """天天气晴朗，万里无云，我们去${placeName}游玩, 首先映入眼帘的是，${placeName} ${numToChinese(placeName.length)}个镏金大字"""
    println(diary)

}


fun numToChinese(num:Int):String{
    var result = when(num){
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "四"
        5 -> "五"
        else -> num.toString()
    }
    return result
}

fun main(args:Array<String>){
    diaryGenerate("颐和园")
}

 */

/*
fun main(args: Array<String>){
    var nums = 1.. 100  //[1,100]
    var result = 0
    for (num in nums){
        result = result + num

    }
    println("结果：${result}")
}

 */

/*

fun main(args:Array<String>){
//    var nums = 1 until 100 //[1,100)
//    for (num in nums){
//        println(num)
//    }

    var nums2 = 1..16
//    for (a in nums2 step 2){
//        println(a)
//    }

    var nums3 = nums2.reversed()
    for (a in nums3)
    println(a)
}

 */