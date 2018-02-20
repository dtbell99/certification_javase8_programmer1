class Declaration {
	int x, y, z = 19;
	byte b;
	boolean myBoolean;

	public static void main(String[] args) {
		Declaration d = new Declaration();
		System.out.println("d.y == " + d.y);
		System.out.println("d.z == " + d.z);
	}
}
