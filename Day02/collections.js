let numbers = [1,2,3,4,5,6,7,8];
//Print the square of all the even numbers

numbers
	.filter(num => num % 2 == 0)
	.map(num => num * num)
	.forEach(num => console.log(num))
