let classmates = ["철수","영희","훈이"]
// undefined

classmates
// (3) ['철수', '영희', '훈이']

classmates[0]
// '철수'
classmates[1]
// '영희'
classmates[2]
// '훈이'

classmates.includes("훈이")
// true
classmates.includes("맹구")
// false

classmates.length
// 3

classmates.push("맹구")
// 4
classmates.includes("맹구")
// true
classmates.length
// 4

classmates.pop()
// '맹구'
classmates.length
// 3
classmates
// (3) ['철수', '영희', '훈이']


// 퀴즈 1
developer = ["반복", "열정", "연봉", "커리어점프", "워라벨"]
//(5) ['반복', '열정', '연봉', '커리어점프', '워라벨']
developer[1]
//'열정'


// 퀴즈 2
let dream = ["커리어점프", "성공", "할수있다"]

dream.concat(developer)
//(8) ['커리어점프', '성공', '할수있다', '반복', '열정', '연봉', '커리어점프', '워라벨']