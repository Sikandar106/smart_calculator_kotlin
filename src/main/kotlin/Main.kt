fun main() {
    println("Enter two number to perform operation")
    var takeNumber = readLine()!!.toInt()
    var takeNumber2 = readLine()!!.toInt()
    println("Enter your operation for following input eg : +,-,/,*")
    var getOp = readLine()
    if (getOp == "+") {
        var result = takeNumber + takeNumber2
        println("adding $takeNumber + $takeNumber2 = $result")
    } else if (getOp == "*") {
        var result = takeNumber * takeNumber2
        println("product of $takeNumber * $takeNumber2 = $result")
    } else if (getOp == "/") {
        var result = takeNumber / takeNumber2
        println("dividing $takeNumber / $takeNumber2 = $result")
    } else if (getOp == "-") {
        var result = takeNumber - takeNumber2
        if (takeNumber >= takeNumber2){
            print("substraction of $takeNumber - $takeNumber2 = $result")
        }else{
            println("for subtraction first input must be bigger than second input")
        }
    }else {
        println("Invalid command")
    }
}
