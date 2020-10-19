class employee {// Constructor Declaration of Class 

	var name: String = ""
	var age: Int = 0
	var gender: Char = 'M'
	var salary: Double = 0.toDouble() 

	fun insertValues(n: String, a: Int, g: Char, s: Double) { 
		name = n 
		age = a 
		gender = g 
		salary = s 
		println("Name of the employee: $name") 
		println("Age of the employee: $age") 
		println("Gender: $gender") 
		println("Salary of the employee: $salary") 
	} 
	fun insertName(n: String) { 
		this.name = n 
	} 

} 
fun main(args: Array<String>) { 
	// creating multiple objects 
	var obj = employee() 
	// object 2 of class employee 
	var obj2 = employee() 

	//accessing the member function 
	obj.insertValues("Praveen", 50, 'M', 500000.00) 

	// accessing the member function 
	obj2.insertName("Aliena") 

	// accessing the name property of class 
	println("Name of the new employee: ${obj2.name}") 

} 
