let friend = {
    name:"시은",
    age:28,
    camp:"코드캠프"
}

friend
// {name: '시은', age: 28, camp: '코드캠프'}
friend.name
// '시은'
friend.age
// 28
friend.camp
// '코드캠프'


// 객체와 배열 같이 사용하기
let classmates = [
    { name : "철수", age : 13, school : "다람쥐 초등학교"},
    { name : "영희", age : 8, school : "공룡 초등학교"},
    { name : "훈이", age : 11, school : "거북이 초등학교"}
]

classmates
// (3) [{…}, {…}, {…}]
classmates.length
// 3
classmates[0].shcool
// '다람쥐 초등학교'
classmates[2].age
// 11


// 퀴즈
const fruits = [
    { number : 1, title : "레드향" },
    { number : 2, title : "샤인머스캣" },
    { number : 3, title : "산청딸기" },
    { number : 4, title : "한라봉" },
    { number : 5, title : "사과" },
    { number : 6, title : "애플망고" },
    { number : 7, title : "딸기" },
    { number : 8, title : "천혜향" },
    { number : 9, title : "과일선물세트" },
    { number : 10, title : "귤" },
];

fruits[0].number + " " + fruits[0].title
// '1 레드향'
fruits[1].number + " " + fruits[1].title
// '2 샤인머스캣'
fruits[2].number + " " + fruits[2].title
// '3 산청딸기'
fruits[3].number + " " + fruits[3].title
// '4 한라봉'
fruits[4].number + " " + fruits[4].title
// '5 사과'