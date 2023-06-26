public class Main
{
	public static void main(String[] args) {
	    for (int i=1; i<1000; i++) {
	        int c=0;
	        for (int j=2; j<=i/2; j++) {
	            if (i%j==0) {
	                c++;
	                break;
	            }
	        }
	        if (c==0 && i!=1) {
	            System.out.println(i + " ");
	        }
	    }
	}
}