class I implements I2 {

	// I must implement I1's doAction1 method too because I2 extends I1
	public void doAction1() {
		System.out.println("Doing Action1");
	}

	public void doAction2() {
		System.out.println("Doing Action2");
	}	


	public static void main(String[] args) {
		I i = new I();
		i.doAction1();
		i.doAction2();
	}
}
