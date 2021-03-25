package com.robin.simple.practice;

import java.io.Serializable;

public class PureSingelton implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	private static PureSingelton instance = null;

	private PureSingelton() {
		if (instance != null) {
			throw new IllegalStateException("Object cant be instantiated again.");
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//throw new CloneNotSupportedException();
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	public static PureSingelton getInstance() {
		if (instance == null) {
			synchronized (PureSingelton.class) {
				if (instance == null) {
					instance = new PureSingelton();
				}
			}
		}
		return instance;
	}
	
}
