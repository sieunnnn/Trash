// This program convert Kelvin temperature to Celsius then to Fahrenheit.


// the forecast today
let kelvin = 293;

// convert Kelvin to Celsius
let celsius = kelvin - 273;

// convert celsius to fahrenheit
let fahrenheit = celsius * (9/5) + 32;

// convert decimal number to whole number
fahrenheit = Math.floor(fahrenheit);

// print the result
console.log(`The temperature is ${fahrenheit} degree Fahrenheit.`);


// what's 0 Kelvin in Fahrenheit?
kelvin = 0;
celsius = kelvin - 273;
fahrenheit = celsius * (9/5) + 32;
console.log(`The temperature is ${Math.floor(fahrenheit)} degree Fahrenheit.`);


/////////////////////////////////////////////////////////////////////////////////////////////////////////


// extra practice

celsius = 10
let newton = celsius * (33/100)

console.log(`The temperature is ${Math.floor(newton)} degrees Newton.`);
