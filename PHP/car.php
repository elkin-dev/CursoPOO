<?php
require_once('account.php');
class Car
{
    public $id;
    public $license;
    public $driver;
    protected $passenger;

    public function __construct($license, $driver)
    {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar()
    {
        echo "
        Licencia: $this->license 
        Driver:{$this->driver->name}
        Numero de pasajeros: $this->passenger
        ";
    }

    public function getPassegers()
    {
        return $this->passenger;
    }

    public function setPassengers($passenger)
    {
        if ($passenger == 4) {
            $this->passenger = $passenger;
        } else {
            echo " ";
            echo "Necesitas asignar 4 pasajeros";
        }
    }
}
