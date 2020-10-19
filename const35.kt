
class outerClass { 
    var str = "Outer class"
    // nested class declaration 
    class nestedClass { 
        val firstName  = "Praveen"
        val lastName = "Ruhil"
    } 
} 
fun main(args: Array<String>) { 
    // accessing member of Nested class 
    print(outerClass.nestedClass().firstName) 
    print(" ") 
    println(outerClass.nestedClass().lastName) 
}     
