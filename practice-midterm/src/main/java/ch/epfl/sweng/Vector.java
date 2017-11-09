package ch.epfl.sweng;

import java.lang.Math;

/**
 * A vector of scalar values
 */
public final class Vector {

	private int dimension;
	private double[] coefficients;

	public Vector(int dimension) {

		double []coefficients= new double[dimension];
		for(int i=0; i<dimension; i++){
			coefficients[i]=0;
		}

		this.coefficients=coefficients;
		this.dimension=dimension;
	}

	public double getElement(int index) {

		return coefficients[index];
	}

	public void setElement(int index, double value) {

		coefficients[index]=value;
	}

	public int dimension() {

		return dimension;
	}

	public double norm() {

		double norm=0;

		for(int i=0; i<dimension; i++){
			norm=coefficients[i]*coefficients[i];
		}
		return Math.sqrt(norm);
	}
}
