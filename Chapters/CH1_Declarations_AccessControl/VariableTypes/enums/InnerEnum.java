class InnerEnum {

	enum ShoeSize { LARGE, SMALL };

	public static void main(String[] args) {
		for (ShoeSize sz : ShoeSize.values()) {
			System.out.println(sz);	
		}
	}

}
