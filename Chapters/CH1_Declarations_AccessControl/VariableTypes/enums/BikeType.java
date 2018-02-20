enum BikeType {

	/**
	* Notice how MTB has a constant specific class body
	*/
	
	GRAVEL("Gravel", "Great for dirt"),
	ROAD("Road", "Speed baby"),
	MTB("Mountain", "Bumpy bumpy") {
		public String getType() {
			return "B";
		}
	};

	private String name;
	private String description;

	BikeType(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public String getType() {
		return "A";
	}

}
