# 팰린드롬이란, 앞에서 읽었을 때와 뒤에서 읽었을 때가 같은 문자열을 말한다.
# 팰린드롬이면 1, 아니면 0 을 반환한다.
# 재귀 함수를 몇 번 호출하는지 센다.


import sys

T = int(input())

def recursion(S, l, r):
    global count
    count += 1
    if l >= r : return 1
    elif S[l] != S[r] : return 0
    else: return recursion(S, l + 1, r -1)

def isPallindrome(S):
    return recursion(S, 0, len(S)-1)

for i in range(T):
    count = 0
    print(isPallindrome(sys.stdin.readline().rstrip()), count)