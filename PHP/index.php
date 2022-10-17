<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");
require_once("uberVan.php");

$uberVan = new UberVan("LKJ554", new Account("Manuel Martinez", "52469214"), "Chevrolet", "Sail");
$uberVan->setPassengers(6);
$uberVan->printDataCar();

echo "<br>";

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->setPassengers(4);
$uberX->printDataCar();
