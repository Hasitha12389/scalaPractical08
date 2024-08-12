object patternMatching{

def matchPattern(num : Int):String = num match{

    case x if x % 3 == 0 && x % 5 == 0 => "Multiple of Both Three and Five."
    case x if x % 5 == 0 => "Multiple of Five."
    case x if x % 3 == 0 => "Multiple of Three."
    case _ => "Not a Multiple of Three or Five."

}

def main(args: Array[String]): Unit={

    print("\nEnter your Number : ")
    val inputNum = scala.io.StdIn.readInt()
    val output = matchPattern(inputNum)
    println(s"$inputNum is a $output\n")
}
}

