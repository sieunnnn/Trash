# 일반 유닛
class Unit:
    # __init__ : 생성자
    def __init__(self, name, hp, speed):
        # 멤버 변수 : 클래스 내에서 정의된 변수
        self.name = name
        self.hp = hp
        self.speed = speed

    def move(self, location):
        print("[지상 유닛 이동]")
        print("{0} : {1} 방향으로 이동 합니다. [속도 {2}]".format(
            self.name, location, self.speed))


# 상속 받으려는 클래스를 () 안에 넣어 준다.
class AttackUnit(Unit):
    def __init__(self, name, hp, speed, damage):
        Unit.__init__(self, name, hp, speed)
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


# 메딕 : 의무병. 공격력이 0 이다.
# 드랍쉽 : 공중 유닛, 수송기. 마린 / 파이어뱃 / 탱크 등을 수송. 공격 불가


# 날 수 있는 기능을 가진 클래스
class Flyable:
    def __init__(self, flying_speed):
        self.flying_speed = flying_speed

    def fly(self, name, location):
        print("{0} : {1} 방향으로 날아간다. [속도 {2}]".format(
            name, location, self.flying_speed))


# 공중 공격 유닛 클래스 (다중 상속)
class FlyableAttackUnit(AttackUnit, Flyable):
    def __init__(self, name, hp, damage, flying_speed):
        # 지상 speed 는 0 으로 처리
        AttackUnit.__init__(self, name, hp, 0, damage)
        Flyable.__init__(self, flying_speed)

    # move() 재정의
    def move(self, location):
        print("[공중 유닛 이동]")
        self.fly(self.name, location)


# 벌쳐 : 지상 유닛, 기동성이 좋음
vulture = AttackUnit("벌쳐", 80, 10, 20)

# 배틀 크루져 : 공중 유닛, 체력도 굉장히 좋고, 공격력도 좋다.
battlecruiser = FlyableAttackUnit("배틀크루저", 500, 25, 3)

vulture.move("11시")
# battlecruiser.fly(battlecruiser.name, "9시")
battlecruiser.move("9시")