class Catalog {
	public static void main(String args []) {
		Catalog catalog = new Catalog();
		System.out.println("Gravel desc :"+catalog.getBikeTypeDescription("Gravel"));			
		System.out.println("---");
		
		for (BikeType bt : BikeType.values()) {
			System.out.println(bt.getName() + " : " + bt.getType());
		}
	}

	

	public String getBikeTypeDescription(String name) {
		for (BikeType bikeType : BikeType.values()) {

			System.out.println(bikeType.getName() + " type->"+bikeType.getType());

			if (bikeType.getName().equals(name)) {
				return bikeType.getDescription();
			}
			System.out.println(bikeType.getName());
		}		
		return "Unknown??";
	}	
}
