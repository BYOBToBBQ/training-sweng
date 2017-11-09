package ch.epfl.sweng;

/**
 * Represents a Matrix as a collection of Vector instances.
 * <p>
 * The height is the dimension of the vector space, and the width is the number
 * of vectors in the matrix.
 * 
 * <p>
 * e.g. a Matrix of height 4 and width 3 would look like this (example values):
 * <code>
 * 1   2   3
 * 4   5   6
 * 7   8   9
 * 10  11  12
 * </code>
 * 
 */
public final class Matrix {

	private int width=0;
	private int height=0;
	private double[][] coefficients;

	public Matrix(int height, int width) {

		double [][]coefficients= new double[width][height];

		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				coefficients[i][j]=0;
			}
		}

		this.width=width;
		this.height=height;
		this.coefficients=coefficients;
	}

	public Matrix(double[][] elements) {

		this.width=elements[0].length;
		this.height=elements.length;
		this.coefficients=elements.clone();
	}

	public int getHeight() {

		return height;
	}

	public int getWidth() {

		return width;
	}

	public double getElement(int height, int width) {

		return coefficients[height][width];
	}

	public void setElement(int height, int width, double value) {

		coefficients[height][width]=value;
	}

	public void normalizeColumns() {
		for(int i=0; i<width;i++){
			scaleColumnBy(width,getColumnNorm(width));
		}
	}

	private double getColumnNorm(int columnIndex){

		Vector v = new Vector(height);

		for(int i=0; i < v.dimension(); i++){
			v.setElement(i,coefficients[i][columnIndex]);
		}

		return v.norm();
	}

	private void scaleColumnBy(int columnIndex, double parameter){

		for(int i=0; i<height;i++){
			setElement(i,columnIndex,getElement(i,columnIndex)*parameter);
		}
	}

	public Vector multiply(Vector vector) {
		Vector result=new Vector(height);

		for(int i=0; i<height; i++){
			double coeff=0;
			for(int j=0; j<width; j++){
				coeff+=getElement(i,j)*vector.getElement(width);
			}
			result.setElement(i,coeff);
		}
		return result;
	}
}
