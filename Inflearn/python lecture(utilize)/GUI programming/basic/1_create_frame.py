from tkinter import *

root = Tk()
root.title("시니의 GUI")

# root.geometry("640x480") # 가로 * 세로
# 가로 * 세로 + x 좌표 + y 좌표
root.geometry("640x480+300+100")

# x , y  값 변경 불가 (창크기 변경 불가)
root.resizable(False, False)

root.mainloop()
