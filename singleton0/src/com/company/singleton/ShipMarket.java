package com.company.singleton;

public class ShipMarket
{   // singleton

    private int itsNumShipsInStock;
    private static ShipMarket itsInstance;

    public static synchronized ShipMarket getInstance(int itsNumShipsInStock)
    {
        if( itsInstance == null )
            itsInstance = new ShipMarket(itsNumShipsInStock); //nawset jak pozniej bedzie chcial cos ktos zmieniac to wartosc zostaje ta sama
        return itsInstance;
    }

    private ShipMarket()
    {

    }

    private ShipMarket(int itsNumShipsInStock) {
        this.itsNumShipsInStock = itsNumShipsInStock;
    }

    public Boolean sellShip(){
        return true;
    }

    public void buyShip(){
        System.out.println("Kupiono statek");
        this.itsNumShipsInStock = 1;

    }

    public int getNumShipsToSell(){
        System.out.println("Liczba kupionych statków");
        return this.itsNumShipsInStock;
    }

}