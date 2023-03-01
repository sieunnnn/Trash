// Practice Functions with rock paper or scissors game


// 함수 생성
const getUserChoice = userInput => {

    // Rock 을 입력 받아도 rock 으로 인식할 수 있게 R 을 소문자로 바꿔준다.
    userInput = userInput.toLowerCase();

    // 가위, 바위, 보 만 입력 되어야 한다.
    if (userInput === 'rock' || userInput === 'paper' || userInput === 'scissors') {
        return userInput
    } else {
        console.log('Error!')
    }
}

// 함수 생성
const getComputerChoice = computerInput => {

    // Rock 을 입력 받아도 rock 으로 인식할 수 있게 R 을 소문자로 바꿔준다.
    computerInput = computerInput.toLowerCase();

    // 가위, 바위, 보 만 입력 되어야 한다.
    if (computerInput === 'rock' || computerInput === 'paper' || computerInput === 'scissors') {
        return computerInput
    } else {
        console.log('Error!')
    }
}

// // 함수 검증
// console.log(getUserChoice('paper'))


// 함수 생성
const determineWinner = (userChoice, computerChoice) => {

    if (userChoice === computerChoice) {
        return 'The game is a tie!'
    } else if (userChoice === 'rock') {
        if (computerChoice === 'paper') {
            return 'The computer won!'
        } else {
            return 'You won!'
        }

    } else if (userChoice === 'paper') {
        if (computerChoice === 'scissors') {
            return 'The computer won!'
        } else {
            return 'You won!'
        }
    } else {
        if (computerChoice === 'rock') {
            return 'The computer won!'
        } else {
            return 'You won!'
        }
    }
}

// // 함수 테스트
// console.log(determineWinner('paper','rock'));


// 함수 생성
const playGame = () => {
    const userChoice = getUserChoice('rock');
    const computerChoice = getComputerChoice('paper');

    console.log('You threw: ' + userChoice);
    console.log('The computer threw: ' + computerChoice);

    console.log(determineWinner(userChoice, computerChoice))
}

// 함수 테스트
playGame();