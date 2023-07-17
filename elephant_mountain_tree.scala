// 1
object OneStepAhead { 
  //2
  def main(args:Array[String]) { 
    //3
    println("Taking you one step ahead") 
    //4
    val characters = List("Cat", "Dog", "Lion", "Tiger", "Elephant") 
    //5
    characters.foreach(println) 
    //6
    val nums = List.range(1, 10) 
    //7
    nums.foreach(println) 
    //8
    val evens = nums.filter(_%2 == 0) 
    //9
    evens.foreach(println) 
    //10
    val odds = nums.filter(_%2 != 0) 
    //11
    odds.foreach(println) 
    //12
    def printEven(num:Int) { 
      //13
      println("This is an even number " + num) 
    } 
    //14
    evens.foreach(printEven) 
    //15
    val evensUpto = nums.takeWhile(_<= 6) 
    //16
    evensUpto.foreach(println) 
    //17
    val x = nums.map(_*2) 
    //18
    x.foreach(println) 
    //19
    val sum = nums.reduce(_+_) 
    //20
    println("Sum of all numbers is " + sum) 
    //21
    def addOne(num:Int) : Int = { 
      //22
      num + 1 
    } 
    //23
    val addList = nums.map(addOne) 
    //24
    addList.foreach(println) 
    //25
    val chars = List.fill(5)("Hello") 
    //26
    chars.foreach(println) 
    //27
    val result = nums.exists(_> 6) 
    //28
    println("Is there a number greater than 6 " + result) 
    //29
    val result1 = nums.forall(_ <= 11) 
    //30
    println("Are all the numbers less than or equal to 11 " + result1) 
    //31
    val result2 = nums.sorted 
    //32
    result2.foreach(println) 
    //33
    val result3 = nums.sortWith(_<_) 
    //34
    result3.foreach(println) 
    //35
    val result4 = nums.sortWith((i,j) => i < j) 
    //36
    result4.foreach(println) 
    //37
    val mergedList = nums ::: characters 
    //38
    mergedList.foreach(println) 
    //39
    def maxNum(num1:Int, num2:Int) = { 
      //40
      if (num1 > num2) 
        //41
        num1 
      //42
      else 
        //43
        num2 
    } 
    //44
    println("Maximum of two numbers is " + maxNum(3,4)) 
    //45
    def isEven(num:Int) = { 
      //46
      if (num % 2 == 0) 
        //47
        true 
      //48
      else 
        //49
        false 
    } 
    //50
    println("Is 4 even ? " + isEven(4)) 
    //51
    def isOdd(num:Int) = { 
      //52
      if (num % 2 != 0) 
        //53
        true 
      //54
      else 
        //55
        false 
    } 
    //56
    println("Is 4 odd ? "+ isOdd(4)) 
    //57
    val z = characters.map(_.length) 
    //58
    z.foreach(println) 
    //59
    def addNumbers(x:Int, y:Int) = { 
      //60
      x + y 
    } 
    //61
    println("Adding Two Numbers: " + addNumbers(3,4)) 
    //62
    def multiplyNumbers(x:Int, y:Int) = { 
      //63
      x * y 
    } 
    //64
    println("Multiplying two numbers: " + multiplyNumbers(3,4)) 
    //65
    val odd = List(1,3,5,7,9) 
    //66
    val even = List(2,4,6,8,10) 
    //67
    val ints = odd ::: even 
    //68
    ints.foreach(println) 
    //69
    val sortedInts = ints.sortWith((x,y) => x < y) 
    //70
    sortedInts.foreach(println) 
    //71
    val result5 = ints.distinct 
    //72
    result5.foreach(println) 
    //73
    def divideNumbers(x:Int, y:Int) = { 
      //74
      x / y 
    } 
    //75
    println("Dividing two numbers: " + divideNumbers(12,4)) 
    //76
    val result6 = ints.slice(2,5) 
    //77
    result6.foreach(println) 
    //78
    ints.splitAt(2)._1.foreach(println) 
    //79
    ints.splitAt(2)._2.foreach(println) 
    //80
    val numList = List(3,2,7,1,2,7,5,6,7,3,7) 
    //81
    val result7 = numList.span(_ <= 5) 
    //82
    result7._1.foreach(println) 
    //83
    result7._2.foreach(println) 
    //84
    val result8 = numList.dropWhile(_ <= 5) 
    //85
    result8.foreach(println) 
    //86
    val result9 = numList.reverse 
    //87
    result9.foreach(println) 
    //88
    def isDivisible(x:Int) = { 
      //89
      if (x % 3 == 0) 
        //90
        true 
      //91
      else 
        //92
        false 
    } 
    //93
    println("Is 9 divisible by 3? " + isDivisible(9)) 
    //94
    def isPrime(x:Int) = { 
      //95
      for (i <- 2 to (x -1)) { 
        //96
        if (x % i == 0) { 
          //97
          return false 
        } 
      } 
      //98
      true 
    } 
    //99
    println("Is 7 prime? "+ isPrime(7)) 
    //100
    val result10 = numList.partition(_ % 2 == 0) 
    //101
    println("Even Numbers:") 
    //102
    result10._1.foreach(println) 
    //103
    println("Odd Numbers:") 
    //104
    result10._2.foreach(println) 
    //105
    val result11 = numList.flatMap(x => List(x,x*2)) 
    //106
    result11.foreach(println) 
    //107
    val result12 = numList.collect { case x if (x%2 != 0) => x*2 } 
    //108 
    result12.foreach(println) 
    //109
    val numList2 = List(1,2,3,4,5) 
    //110
    val result13 = numList2.foldLeft(10)(_+_) 
    //111
    println("Fold Left result " + result13) 
    //112
    def cube(x:Int) = { 
      //113
      x * x * x 
    } 
    //114
    println("Cube of 4 is " + cube(4)) 
    //115
    val result14 = numList2.foldRight(10)(_+_) 
    //116
    println("Fold Right result " + result14) 
    //117
    val result15 = numList2.zip(nums) 
    //118
    println("Printing List of Tuple") 
    //119
    result15.foreach(println) 
    //120
    val result16 = numList2.zipWithIndex 
    //121
    println("Printing List of Tuple with Index") 
    //122
    result16.foreach(println) 
    //123
    def factorial(x:Int) = { 
      //124
      if (x == 0) 
        //125
        1 
      //126
      else 
        //127
        x * factorial(x - 1) 
    } 
    //128
    println("Factorial of 5 is " + factorial(5)) 
    //129
    def fibonacci(x:Int):Int = { 
      //130
      if (x <= 2) 
        //131
        1 
      //132
      else 
        //133
        fibonacci(x-1) + fibonacci(x-2) 
    } 
    //134
    println("The 5th fibonacci number is " + fibonacci(5)) 
    //135
    def isPalindrome(str:String) :Boolean = { 
      //136
      str == str.reverse 
    } 
    //137
    println("Is racecar a palindrome? "+ isPalindrome("racecar")) 
    //138
    def gcd(a:Int, b:Int):Int = { 
      //139
      if (b == 0) 
        //140
        a 
      //141
      else 
        //142
        gcd(b, a % b) 
    } 
    //143
    println("The GCD of 36 and 60 is " + gcd(36,60)) 
    //144
    def isEven2(x:Int) = { 
      //145
      x match { 
        //146
        case 0 => true 
        //147
        case _ => isOdd2(x-1) 
      } 
    } 
    //148
    def isOdd2(x:Int) = { 
      //149
      x match { 
        //150
        case 0 => false 
        //151
        case _ => isEven2(x-1) 
      } 
    } 
    //152
    println("Is 4 even? "+ isEven2(4)) 
    //153
    println("Is 5 even? "+ isEven2(5)) 
    //154
    println("Is 4 odd? "+ isOdd2(4)) 
    //155
    val str = "My name is John" 
    //156
    val listFromStr = str.split(" ").toList 
    //157
    listFromStr.foreach(println) 
    //158
    val listFromStr2 = str.split(" ").map(_.toUpperCase).toList 
    //159
    listFromStr2.foreach(println) 
    //160
    val str2 = "The quick brown fox jumps over the lazy dog" 
    //161
    println("Count of words in a sentence: "+ str2.split(" ").length) 
    //162
    def reverseString(str:String) = { 
      //163
      str.split("").reverse.mkString 
    } 
    //164
    println("Reversed String: "+ reverseString("I love Scala")) 
    //165
    val result17 = ints.grouped(3).toList 
    //166
    println("Grouped list in chunks of 3") 
    //167
    result17.foreach(println) 
    //168
    val result18 = ints.sliding(3).toList 
    //169
    println("Slided list in chunks of 3") 
    //170
    result18.foreach(println) 
    //171
    val result19 = numList.foldLeft(0)((x,y) => x + y*y) 
    //172
    println("Fold Left result is " + result19) 
    //173
    val result20 = numList.foldRight(0)((x,y) => x + y*y) 
    //174 
    println("Fold Right result is " + result20) 
    //175
    val result21 = numList.reduceLeft(_+_) 
    //176
    println("Reduce Left result is " + result21) 
    //177
    val result22 = numList.reduceRight(_+_) 
    //178
    println("Reduce right result is " + result22) 
    //179
    def isDivisibleByThree(num:Int):Boolean = { 
      //180
      num % 3 == 0 
    } 
    //181
    val result23 = numList.count(isDivisibleByThree) 
    //182
    println("Count of numbers divisible by 3 is " + result23) 
    //183
    val fruits = List("apple","mango","banana","orange") 
    //184
    val result24 = fruits.find(_.startsWith("o")) 
    //185
    println("Fruit beginning with o is " + result24.getOrElse("No fruit")) 
    //186
    val result25 = fruits.indexWhere(_.startsWith("o")) 
    //187
    println("Index of fruit beginning with o is " + result25) 
    //188
    def matchName(name:String) = { 
      //189
      name match { 
        //190
        case "John" => println("Hi John") 
        //191
        case "Doe" => println("Hi Doe") 
        //192
        case _ => println("Who are you ?") 
      } 
    } 
    //193
    matchName("John") 
    //194
    matchName("Doe") 
    //195
    matchName("Hanes") 
    //196
    val num