from car import Car
from account import Account

if __name__=="__main__":
    print("Hola mundo")
    
    car = Car("AMH1223", Account ("Andres Herrera", "548484123"))
    print(vars(car))
    print(vars(car.driver))