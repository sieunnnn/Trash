// The program will determine the actual and ideal hours of sleep for each night of the last week.
// Finally, it will calculate, in hours, how far you are from your weekly sleep goal.


// 함수 생성
const getSleepHours = day => {
    if (day === 'monday') {
        return 6;
    } else if (day === 'tuesday') {
        return 6;
    } else if (day === 'wends day') {
        return 7;
    } else if (day === 'thursday') {
        return 5;
    } else if (day === 'friday') {
        return 5;
    } else if (day === 'saturday') {
        return 8;
    } else if (day === 'sunday') {
        return 9;
    }
};

// // 함수 테스트
// console.log(getSleepHours('sunday'))


// 함수 생성
const getActualSleepHours = () => {
    const sum = getSleepHours('monday') + getSleepHours('tuesday') + getSleepHours('wends day')
        + getSleepHours('thursday') + getSleepHours('friday') + getSleepHours('saturday') + getSleepHours('sunday');

    return sum;
};

// // 함수 테스트
// console.log(getActualSleepHours())


// 함수 생성
const getIdealSleepHours = idealHours => idealHours * 7;

// // 함수 테스트
// console.log(getIdealSleepHours())


// 함수 생성
const calculateSleepDebt = () => {
    const actualSleepHours = getActualSleepHours();
    const idealSleepHours = getIdealSleepHours();

    if (actualSleepHours === idealSleepHours) {
        console.log("You got the perfect amount of sleep");
    } else if (actualSleepHours > idealSleepHours) {
        console.log("You got more sleep than needed");
    } else {
        console.log("You should get some rest");
    }
}

// 함수 테스트
calculateSleepDebt();