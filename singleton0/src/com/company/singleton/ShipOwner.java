package com.company.singleton;

public class ShipOwner {
    private int itsNumOwnedShips;
    private ShipMarket shipMarket;

    public void shipOwner(int itsNumOwnedShips){
        this.shipMarket = ShipMarket.getInstance(itsNumOwnedShips);

    }

    public void sellShipOnMarket(){
        this.shipMarket.sellShip();
    }

    public void buyShipOnMarket(){
        this.shipMarket.buyShip();
    }

    public int  getNumOwnedShips(){
        return this.itsNumOwnedShips - this.shipMarket.getNumShipsToSell();
    }

    public int getNumShipsOnMarket(){
        return this.shipMarket.getNumShipsToSell();
    }
}
