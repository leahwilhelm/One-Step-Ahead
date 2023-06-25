--This is a Lua program that will
--"One Step Ahead"

--Define the basic math functionality
function add(op1, op2)
	return op1 + op2
end

function subtract(op1, op2)
	return op1 - op2
end

function multiply(op1, op2)
	return op1 * op2
end

function divide(op1, op2)
	return op1 / op2
end

--Define the core functions of the program
function oneStepAhead(op1, op2)
	return subtract(add(op1, op2), 1)
end

function twoStepsAhead(op1, op2)
	return subtract(add(op1, op2), 2)
end

function threeStepsAhead(op1, op2)
	return subtract(add(op1, op2), 3)
end

function fourStepsAhead(op1, op2)
	return subtract(add(op1, op2), 4)
end

--Define the display function
function displayResult(result)
	print("Result: "..result)
end

--Define the main function
function main()
	--Prompt user for input
	op1Input = tonumber(io.read("*n"))
	op2Input = tonumber(io.read("*n"))
	
	--Responsible for calling the functions
	resultOneStepAhead   = oneStepAhead(op1Input, op2Input)
	resultTwoStepsAhead  = twoStepsAhead(op1Input, op2Input)
	resultThreeStepsAhead = threeStepsAhead(op1Input, op2Input)
	resultFourStepsAhead = fourStepsAhead(op1Input, op2Input)
	
	--Display the results
	displayResult(resultOneStepAhead)
	displayResult(resultTwoStepsAhead)
	displayResult(resultThreeStepsAhead)
	displayResult(resultFourStepsAhead)
end

--Finally, call the main function
main()