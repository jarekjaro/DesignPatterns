package Factory;
// This is a factory thats only job is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications

public class EnemyShipFactory {

    // This could be used as a static method if we
    // are willing to give up subclassing it

    private EnemyShip newShip;

	public EnemyShip makeEnemyShip(String newShipType) {

        setNewShip(null);

        if (newShipType.equals("U")) {

            return new UFOEnemyShip();

        } else if (newShipType.equals("R")) {

            return new RocketEnemyShip();

        } else if (newShipType.equals("B")) {

            return new BigUFOEnemyShip();

        } else return null;

    }

	public EnemyShip getNewShip() {
		return newShip;
	}

	public void setNewShip(EnemyShip newShip) {
		this.newShip = newShip;
	}

}
