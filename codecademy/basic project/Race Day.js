// This program will register runners for the race and give them instructions on race day.

// Race number:
// Early adults receive a race number at or above 1000.
// All others receive a number below 1000.

// Start time:
// Adult registrants run at 9:30 am or 11:00 am.
// Early adults run at 9:30 am.
// Late adults run at 11:00 am.
// Youth registrants run at 12:30 pm (regardless of registration).


// 랜덤 값 생성 하기
// 999 까지 생성 된다.
let raceNumber = Math.floor(Math.random() * 1000);

let registeredEarly = false;
const age = 29;

// 조건문 생성
if (age > 18 && registeredEarly === true) {
    raceNumber += 1000;

    console.log(`${raceNumber} will race at 9:30 am`)

} else if (age > 18 && registeredEarly === false) {
    console.log(`${raceNumber} will race at 11:00 am`);

} else if (age < 18){
    console.log(`${raceNumber} will race at 12:30 am`);

} else {
    console.log("To see the registration desk")
}