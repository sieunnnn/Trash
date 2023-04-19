
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

////////////////////////////////////////////////////////////////////////////

let todoInput = document.querySelector('#todo');
let todoListBox = document.querySelector('.wrapper__todoList');

let TODO_LIST = 'todos';

let arrTodo = [];

// localstorage 에 todoList 있는지 check
function init() {

    let todos = localStorage.getItem(TODO_LIST);
    if (todos === null) {

        localStorage.setItem(todos, []);
    }else {

        let parsedTodos = JSON.parse(todos);
        parsedTodos.forEach((todo) => {
            arrTodo.push(todo);
            paintTodos(todo);
        });
    }
}

// todoInput
todoInput.addEventListener('keyup', (e) => {

    if (e.keyCode === 13) {

        e.preventDefault();

        handleSubmit(e);
    }
})

// todoList 추가
function handleSubmit(e) {

    e.preventDefault();

    let todo = {
        id : new Date(),
        isClear : false,
        content  : todoInput.value
    };

    todoInput.value = '';
    arrTodo.push(todo);
    localStorage.setItem(TODO_LIST, JSON.stringify(arrTodo));
    paintTodos(todo);
}

// 그리기 함수
function paintTodos(todo) {

    let todoBox = document.createElement('div');
    todoBox.id = todo.id;
    todoBox.className = 'wrapper__what_todo';
    todoListBox.appendChild(todoBox);

    let todoCheck = document.createElement('button');
    todoCheck.className = 'check__btn';
    todoCheck.id = todo.id;

    let todoTxt = document.createElement('div');
    todoTxt.id = todo.id;
    todoTxt.className = 'txt__todo'
    todoTxt.innerHTML = todo.content;

    todoCheck.addEventListener('click',() => {
        todo.isClear = true;
        todoTxt.style.textDecoration = 'line-through';
    })

    todoBox.appendChild(todoCheck);
    todoBox.appendChild(todoTxt);

    let removeTodo = document.createElement('button');
    removeTodo.id = todo.id;
    removeTodo.className = 'remove__btn';

    removeTodo.addEventListener('click', () => {

        let target = removeTodo.parentNode;
        todoListBox.removeChild(target);

        arrTodo = arrTodo.filter(function(arrTodos) {

            return arrTodos.id !== todo.id;
        });

        localStorage.setItem(TODO_LIST, JSON.stringify(arrTodo));
    })

    todoBox.append(removeTodo);

}

init();


// 메모장 관련 함수
    function showMemo() {

        document.querySelector('.main__img').style.display = 'none';
        document.querySelector('.wrapper__app__btn').style.display = 'none';
        document.querySelector('.modal__memo').style.display = 'block';
        document.querySelector('.wrapper__open__memo').style.display = '';
    }

    function closeMemo() {

        document.querySelector('.modal__memo').style.display = 'none';
        document.querySelector('.main__img').style.display = '';
        document.querySelector('.wrapper__app__btn').style.display = '';
        document.querySelector('.wrapper__open__memo').style.display = 'none';
    }

    let memo = document.querySelector('.memo__btn');
    let memoBtn = document.querySelector('#memoBtn');

    memo.addEventListener('click', showMemo);
    memoBtn.addEventListener('click', showMemo);

    let memoClose = document.querySelector('.memo__close');

    memoClose.addEventListener('click', closeMemo);

    ////////////////////////////////////////////////////////////////////////////

    let memoInput = document.querySelector('#memoTitle');
    let memoTextArea = document.querySelector('#memo');
    let memoListBox = document.querySelector('.wrapper__memoList');

    let MEMO_LIST = 'memos';

    let arrMemo = [];

    // localstorage 에 memo 있는지 check
    function init_memo() {

        let memos = localStorage.getItem(MEMO_LIST);
        if (memos === null) {

            localStorage.setItem(memos, []);
        }else {

            let parsedMemos = JSON.parse(memos);
            parsedMemos.forEach((memo) => {
                arrMemo.push(memo);
                paintMemos(memo);
            });
        }
    }

    // memoInput
    memoInput.addEventListener('keyup', (e) => {

        if (e.keyCode === 13) {

            e.preventDefault();

            handleSubmit_m(e);
        }
    })

    // memoTextArea
    memoTextArea.addEventListener('keyup', (e) => {

        if (e.keyCode === 13) {

            e.preventDefault();

            handleSubmit_m(e);
        }
    })

    // todoList 추가
    function handleSubmit_m(e) {

        e.preventDefault();

        let memo = {
            id : new Date(),
            title : memoInput.value,
            content  : memoTextArea.value
        };

        memoInput.value = '';
        memoTextArea.value = '';
        arrMemo.push(memo);
        localStorage.setItem(MEMO_LIST, JSON.stringify(arrMemo));
        paintMemos(memo);
    }

    // 그리기 함수
    function paintMemos(memo) {

        let memoBox = document.createElement('div');
        memoBox.id = memo.id;
        memoBox.className = 'container__memo';
        memoListBox.appendChild(memoBox);

        let titleBox = document.createElement('div');
        titleBox.id = memo.id;
        titleBox.className = 'wrapper__memo__title';
        memoBox.appendChild(titleBox);

        let titleImg = document.createElement('img');
        titleImg.id = memo.id;
        titleImg.src = 'img/memoTitle.png';
        titleImg.className = 'memo__title__img';
        titleBox.appendChild(titleImg);

        let memoTitle = document.createElement('div');
        memoTitle.id = memo.id;
        memoTitle.innerHTML = memo.title;
        memoTitle.className = 'memo__title';
        titleBox.appendChild(memoTitle);

        let memoContent = document.createElement('div');
        memoContent.id = memo.id;
        memoContent.innerHTML = memo.content;
        memoContent.className = 'memo__content';
        memoBox.appendChild(memoContent);

        let hr = document.createElement('img');
        hr.src = 'img/hr.png';
        hr.className = 'memo__hr';
        memoBox.appendChild(hr);

        let removeMemo = document.createElement('button');
        removeMemo.id = memo.id;
        removeMemo.className = 'remove__btn';

        removeMemo.addEventListener('click', () => {

            let target = removeMemo.parentNode.parentNode;
            memoListBox.removeChild(target);

            arrMemo = arrMemo.filter(function(arrMemos) {

                return arrMemos.id !== memo.id;
            });

            localStorage.setItem(MEMO_LIST, JSON.stringify(arrMemo));
        })

        titleBox.appendChild(removeMemo);

    }

    init_memo();


//////////////////////////////////////////////////////////////////////////////////////////////

let notion = document.querySelector('.notion__btn');

notion.addEventListener('click', () => {

    window.open('https://sieun96.notion.site/chrome-Extension-91b7b3adafa54d4596a59253fdc7cc04');
})

let gitHub = document.querySelector('.github__btn');

gitHub.addEventListener('click', () => {

    window.open('https://github.com/sieunnnn/chrome-extension');
})

////////////////////////////////////////////////////////////////////////////////////////////////////

let timeBox = document.querySelector('#clock');

let time = new Date();

let now = time.toLocaleTimeString();
console.log(now);

timeBox.innerHTML = now;