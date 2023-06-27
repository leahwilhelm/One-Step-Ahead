fun main(args: Array<String>){
    println("One Step Ahead")
    var count = 0
    //Loop through 1 to 2000
    for(i in 1..2000){
        count += 1 
        when(i){
            in 1..100 -> println("Count is $count and value is $i")
            in 101..500 -> println("Count is $count and value is $i")
            in 501..1000 -> println("Count is $count and value is $i")
            in 1001..1500 -> println("Count is $count and value is $i")
            in 1501..2000 -> println("Count is $count and value is $i")
        }
    }
    println("Final count is $count")
}