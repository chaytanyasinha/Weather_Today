//main function 
fun main(args: Array<String>) 
{ 
	Add(5, 6) 
} 
//class with one secondary constructor 
class Add 
{ 
	constructor(a: Int, b:Int) 
	{ 
		var c = a + b 
		println("The sum of numbers 5 and 6 is: ${c}") 
	} 
} 
