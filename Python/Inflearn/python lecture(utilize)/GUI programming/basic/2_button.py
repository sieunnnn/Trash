from tkinter import *

root = Tk()
root.title("시니의 GUI")
root.geometry("640x480")

btn1 = Button(root, text="버튼1")
btn1.pack()

# padx, pady 는 여백의 개념으로 이해하자
btn2 = Button(root, padx=5, pady=10, text='버튼2')
btn2.pack()

btn3 = Button(root, padx=10, pady=5, text='버튼3')
btn3.pack()

# 고정 크기여서 text 가 길어져도 길어지거나 넓어지지 않는다.
btn4 = Button(root, width=10, height=3, text='버튼4')
btn4.pack()

btn5 = Button(root, fg="red", bg="yellow", text="버튼5")
btn5.pack()

photo = PhotoImage(file="./img1.png")
btn6 = Button(root, image=photo)
btn6.pack()

def btncmd():
    print("버튼이 클릭되었어요") # 콘솔창에 출력된다.

btn7 = Button(root, text="동작하는 버튼", command=btncmd)
btn7.pack()

root.mainloop()
