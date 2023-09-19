class Unit:
    # __init__ : 생성자
    def __init__(self, name, hp, damage):
        # 멤버변수 : class 내에서 정의된 변수
        self.name = name
        self.hp = hp
        self.damage = damage

        print("{0} 유닛이 생성 되었습니다.".format(self.name))
        print("체력 {0}, 공격력 {1}".format(self.hp, self.damage))


# 마린과 탱크는 객체 이자 class 의 인스턴스
marine1 = Unit("마린", 40, 5)
marine2 = Unit("마린", 40, 5)
tank = Unit("탱크", 150, 35)


# 레이스 : 공중 유닛, 비행기. 클로킹 (상대방 에게 보이지 않음)
wraith1 = Unit("레이스", 80, 5)
# 멤버 변수에 . 으로 접근이 가능 하다.
print("유닛 이름 : {0}, 공격력 : {1}".format(wraith1.name, wraith1.damage))


# 마인드 컨트롤 : 상대방 유닛을 내 것으로 만드는 것 (빼앗음)
wraith2 = Unit("빼앗은 레이스", 80, 5)
# 외부 에서 clocking 이란 변수를 추가로 할당 확장한 객체에 대해서 만 적용이 된다.
wraith2.clocking = True

if wraith2.clocking == True:
    print("{0} 는 현재 클로킹 상태 입니다.".format(wraith2.name))