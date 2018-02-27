interface DefaultMethodInterface {
	//default void process();
	//DefaultMethodInterface.java:2: error: missing method body, or declare abstract

	default void process() {
		System.out.println("Processing");
	}

	// Invalid
	// DefaultMethodInterface.java:#: error: method process() is already defined in interface DefaultMethodInterface

	// Above method is already a public implied method.. you can't create another one like below.

	// public default void process() {
	// 	System.out.println("Processing");
	// }

}
