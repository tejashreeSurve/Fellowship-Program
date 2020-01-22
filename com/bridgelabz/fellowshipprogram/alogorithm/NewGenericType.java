package com.bridgelabz.fellowshipprogram.alogorithm;

/**
 * @author Tejashree surve
 * @param <T> : Take's any wrapper class type.
 */
public class NewGenericType<T> {
	T tarray[];

	public NewGenericType(T array[]) {
		tarray = array;
	}

	T getArray(int i) {
		return tarray[i];
	}
}
