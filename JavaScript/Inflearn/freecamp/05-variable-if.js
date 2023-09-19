// 데이터 타입, 연산자 실습

1 + 1
// 2
1 + "만원"
// '1만원'
1 + "11"
// '111'
1 - "1"
// 0

"123" == 123
// true
"123" === 123
// false

true && true
// true
true && false
// false
false || true
// true
!false
// true


// 조건문 실습
// if문 적용
if(1+1 === 2) {
    console.log("정답입니다!")     // 정답입니다!
}

// if ... else문 적용
if(1+1 === 3) {
    console.log("정답입니다!")
} else {
    console.log("틀렸습니다!")     // 틀렸습니다!
}

// 퀴즈
const profile = {
    name : "철수"
    , age : 12
    , school : "다람쥐초등학교"
}

if (profile.age >= 20) {
    console.log("성인입니다.")
} else if (profile.age >= 8) {
    console.log("학생입니다.")
} else if (profile.age > 0){
    console.log("어린이입니다.")
} else {
    console.log("잘못 입력하셨습니다")
}
// 학생입니다.

