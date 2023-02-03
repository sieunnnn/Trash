/*
This program for account dog growth compared to a human of the same age
- The first two years of a dog's life count as 10.5 dog years each
- Each year following equates to 4 dog years.
 */



// human age and name
let myAge = 28;
let myName = 'sieun';

// first two years of a dog's life
let earlyYears = 2;
earlyYears *= 10.5;

// later years of a dog's life
let laterYears = myAge - 2;
laterYears *= 4

// check the values
console.log(earlyYears);
console.log(laterYears);

// result
let myAgeInDogYears = earlyYears + laterYears;

// print
console.log(`My name is ${myName}. I am ${myAge} years old in human years which is ${myAgeInDogYears} years old in dog years.`);