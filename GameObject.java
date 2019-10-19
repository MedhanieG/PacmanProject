
public class GameObject {
	
	//Instance
	private Location coordinate;
	
	//constructor
	
	public GameObject(Location toCopy)
	{
		setCoordinate(toCopy);
	}

	/**
	 * @return the coordinate of the gameobject
	 */
	public Location getCoordinate() {
		return coordinate;
	}

	/**
	 * @param coordinate the coordinate to set of the gamobject
	 */
	public void setCoordinate(Location coordinate) {
		this.coordinate = new Location(coordinate);
	}
	
	
	
}
