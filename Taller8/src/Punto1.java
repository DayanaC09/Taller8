
public class Punto1 {
	 private int numSides;
	    private boolean regular;

	    public Punto1 (int numSides, boolean regular) {
	        this.numSides = numSides;
	        this.regular = regular;
	    }

	    public Punto1 (int numSides) {
	        this.numSides = numSides;
	        this.regular = false;
	    }

	    public int getNumSides() {
	        return numSides;
	    }

	    public void setNumSides(int numSides) {
	        this.numSides = numSides;
	    }

	    public boolean isRegular() {
	        return regular;
	    }

	    public void setRegular(boolean regular) {
	        this.regular = regular;
	    }
}
