package main

import "fmt"

func main() {
	// Define variables
	var i int
	var j float32
	var k string
	var x []int
	var y []float32
	
	// Initialize variables
	i = 0
	j = 0.0
	k = ""
	x = []int{}
	y = []float32{}

	// Loop until 10
	for i < 10 {
		// Increment i
		i++

		// Print current i
		fmt.Printf("i = %d\n", i)

		// Add i to x
		x = append(x, i)

		// Convert i to float32 and add to y
		y = append(y, float32(i))

		// Increment j
		j += 0.1

		// Print j
		fmt.Printf("j = %f\n", j)

		// Concatenate i and j as string
		k += fmt.Sprintf("%d%f", i, j)

		// Print k
		fmt.Printf("k = %s\n", k)
	}

	// Print x and y
	fmt.Printf("x = %v\n", x)
	fmt.Printf("y = %v\n", y)
}