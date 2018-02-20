class Bar {
	final private String name;
	private int age;

	public Bar(String name) {
		this.age = 0;
		this.name = name;
	}

	public Bar(int age) {
		this.name = "Unknown";
		this.age = age;
	}

	public static void main(String[] args) {
		Bar b = new Bar("Fred");
		// You can't do this if name is final.
		//b.name = "tom";

		
		final Bar b2 = new Bar(52);
		b2.age = 21;

		System.out.println("b2.age->"+b2.age+" b2.name:"+b2.name);	

	}
}
