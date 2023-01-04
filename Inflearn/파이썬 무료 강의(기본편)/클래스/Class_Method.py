# 일반 유닛
class Unit:
    # __init__ : 생성자
    def __init__(self, name, hp, damage):
        # 멤버 변수 : 클래스 내에서 정의된 변수
        self.name = name
        self.hp = hp
        self.damage = damage

        print("{0} 유닛이 생성 되었습니다.".format(self.name))
        print("체력 {0}, 공격력 {1}".format(self.hp, self.damage))


class AttackUnit:
    def __init__(self, name, hp, damage):
        # 멤버 변수 : 클래스 내에서 정의된 변수
        self.name = name
        self.hp = hp
        self.damage = damage

    #  self = 자기 자신을 의미 한다. 자기 자신의 변수에 접근할 수 있음을 의미
    #  self.name 과 self.damage 는 자기 자신의 멤버 변수 값을 출력 한다.
    #  location 은 전달 받은 값을 사용 한다.
    def attack(self, location):
        print("{0} : {1} 방향 으로 적군을 공격 합니다. [공격력 {2}]"
              .format(self.name, location, self.damage))

    def damaged(self, damage):
        print("{0} : {1} 데미지 를 입었습니다.".format(self.name, damage))
        self.hp -= damage
        print("{0} : 현재 체력은 {1} 입니다.".format(self.name, self.hp))
        if self.hp <= 0:
            print("{0} : 파괴 되었습니다.".format(self.name))


# firebat : 공격 유닛, 화염 방사기.
firebat1 = AttackUnit("파이어벳", 50, 16)
firebat1.attack("5시")


# 공격 2번 받는 다고 가정
firebat1.damaged(25)
firebat1.damaged(25)