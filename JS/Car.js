function Car(lisence, driver) {
  this.id;
  this.lisence = lisence;
  this.driver = driver;
  this.passengers;
}
Car.prototype.printDateCar = function (){
  
  console.log(this.driver)
  console.log(this.driver.name)
  console.log(this.driver.document)
  
}