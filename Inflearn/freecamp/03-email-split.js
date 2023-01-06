const email = "codecamp@gamil.com"

// 이메일 인지 아닌지 확인
email.includes("@")

email.split("@")
// (2) ['codecamp', 'gamil.com']

let userMail = email.split("@")[0]
let company = email.split("@")[1]

let maskingMail = []

// 아이디 앞 네글자
maskingMail.push(userMail[0])
maskingMail.push(userMail[1])
maskingMail.push(userMail[2])
maskingMail.push(userMail[3])

// 마스킹 뒤 네글자
maskingMail.push("*")
maskingMail.push("*")
maskingMail.push("*")
maskingMail.push("*")

// 합치기
maskingMail.join("") + "@" + company