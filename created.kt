//outer class declaration 
class outerClass { 
	var str = "Outer class"
	// nested class declaration 
	class nestedClass { 
		var s1 = "Nested class"
		// nested class member function 
		fun nestfunc(str2: String): String { 
			var s2 = s1.plus(str2) 
			return s2 
		} 
	} 
} 
fun main(args: Array<String>) { 

	// creating object of Nested class 
	val nested = outerClass.nestedClass() 
	// invoking the nested member function by passing string 
	var result = nested.nestfunc(" member function call successful") 
	println(result) 
} 
