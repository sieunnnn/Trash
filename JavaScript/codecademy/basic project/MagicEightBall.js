// This program will output a random fortune to a question that user input


let userName = 'sieun';

userName ? console.log(`Hello, ${userName}`) : console.log('Hello!')

// 값 입력받기
const userQuestion = console.log('Will I be a good developer?');

// 랜덤 값 생성하기 (0 ~ 7)
randomNumber = Math.floor(Math.random() * 8);

let eightBall = '';

if (randomNumber === 0) {
    console.log('It is certain');
} else if (randomNumber === 1) {
    console.log('It is decidedly so')
} else if (randomNumber === 2) {
    console.log('Reply hazy try again')
} else if (randomNumber === 3) {
    console.log('Cannot predict now')
} else if (randomNumber === 4) {
    console.log('Do not count on it')
} else if (randomNumber === 5) {
    console.log('My sources say no')
} else if (randomNumber === 6) {
    console.log('Outlook not so good')
} else if (randomNumber === 7) {
    console.log('Signs point to yes')
}

