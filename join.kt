fun main(args: Array<String>) {
	var name = "Geeks"
	var name2 = "forGeeks"
	
	// traversing string without using index property
	for (alphabet in name) print("$alphabet ")

	// traversing string with using index property
	for (i in name2.indices) print(name2[i]+" ")
	println(" ")
	
	// traversing string using withIndex() library function
	for ((index,value) in name.withIndex())
	println("Element at $index th index is $value")
}
