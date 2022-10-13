from car import Car 

if __name__=="__main__":
    print("Hola mundo")
    
    car = Car()
    car.license = "DSE548"
    car.driver = "Andres Herrera"
    car.passengers = 4
    
    car2 = Car()
    car2.license = "HYG455"
    car2.driver = "Carlos Perez"
    car2.passengers = 6
    
    print(vars(car))
    print(vars(car2))