class ParkingSystem:

    def __init__(self, big: int, medium: int, small: int):
        self.parking_lots = defaultdict(int)
        self.parking_lots[1] = big
        self.parking_lots[2] = medium
        self.parking_lots[3] = small 
        

    def addCar(self, carType: int) -> bool:
        if self.parking_lots[carType]:
            self.parking_lots[carType] -= 1
            return True


# Your ParkingSystem object will be instantiated and called as such:
# obj = ParkingSystem(big, medium, small)
# param_1 = obj.addCar(carType)