public class InnerEnum2 {

	public static void main(String[] args) {
		for (Cookie.Size s : Cookie.Size.values()) {
			System.out.println(s);
		}
	}

}

class Cookie {

	enum Size { LARGE, SMALL };

}
