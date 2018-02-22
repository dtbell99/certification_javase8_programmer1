import static java.lang.System.*;

class _ {
	static public void main(String[] ___A_V_) {
		System.out.println("Length:"+ ___A_V_.length);
		String $ = "";
		int cntr = 0;
		for (int x=0 ; ++x < ___A_V_.length ; ) {
			$+= ___A_V_[x];
			System.out.println(++cntr+" : x->"+x+"  $->"+$);
		}
		out.println($);
	}
}
