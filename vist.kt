fun main(args: Array<String>) {
	var planets = arrayOf("Earth", "Mars", "Venus", "Jupiter", "Saturn")

	for ((index,value) in planets.withIndex()) {
		println("Element at $index th index is $value")
	}
}
