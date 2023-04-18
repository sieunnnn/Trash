
    window.onload = function () {
    document.querySelector('.container').style.display = "block";
}


// 투두리스트 관련 함수
function showTodo() {

    document.querySelector('.main__img').style.display = 'none';

    document.querySelector('.wrapper__app__btn').style.display = 'none';
    document.querySelector('.modal__todo').style.display = 'block';
    document.querySelector('.wrapper__open__todo').style.display = '';
}

function closeTodo() {

    document.querySelector('.modal__todo').style.display = 'none';
    document.querySelector('.main__img').style.display = '';
    document.querySelector('.wrapper__app__btn').style.display = '';
    document.querySelector('.wrapper__open__todo').style.display = 'none';
}

let todo = document.querySelector('.todo__btn');
let todoBtn = document.querySelector('#todoBtn');

todo.addEventListener('click', showTodo);
todoBtn.addEventListener('click', showTodo);

let todoClose = document.querySelector('.todo__close');

todoClose.addEventListener('click', closeTodo);


// 메모장 관련 함수