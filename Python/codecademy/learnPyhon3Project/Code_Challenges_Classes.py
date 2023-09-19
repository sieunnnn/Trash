# Code Challenges: Classes

# Setting Up Our Robot
class DriveBot:
    # Controlling Them All
    all_disabled = False
    latitude = -999999
    longitude = -999999
    robot_count = 0

    # Enhanced Constructor
    # Identifying Robots
    def __init__(self, motor_speen = 0, direction = 180, sensor_range = 10):
        self.motor_speed = motor_speen
        self.direction = direction
        self.sensor_range = sensor_range
        DriveBot.robot_count += 1
        self.id = DriveBot.robot_count

    # Adding Robot Logic
    def control_bot(self, new_speed, new_direction):
        self.motor_speed = new_speed
        self.direction = new_direction

    def adjust_sensor(self, new_sensor_range):
        self.sensor_range = new_sensor_range



robot_1 = DriveBot()
robot_1.motor_speed = 10
robot_1.direction = 180
robot_1.sensor_range = 20


# test class
# print(robot_1.motor_speed)
# print(robot_1.direction)
# print(robot_1.sensor_range)


robot_2 = DriveBot(35, 75, 25)
robot_3 = DriveBot(20, 60, 10)

# test class
# print(robot_2.motor_speed)
# print(robot_2.direction)
# print(robot_2.sensor_range)


DriveBot.longitude = 50.0
DriveBot.latitude = -50.0
DriveBot.all_disabled = True


# test class
# print(robot_1.latitude)
# print(robot_2.longitude)
# print(robot_3.all_disabled)