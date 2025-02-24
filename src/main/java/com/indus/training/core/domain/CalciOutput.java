package com.indus.training.core.domain;

/**
 * Description: Represents Output of the Calci Class
 */
public class CalciOutput {

	public double param1;
	public double param2;
	public double result;
	public String operation;

	@Override
	public String toString() {
		return "CalciOutput [param1=" + param1 + ", param2=" + param2 + ", result=" + result + ", operation="
				+ operation + "]";
	}

}
