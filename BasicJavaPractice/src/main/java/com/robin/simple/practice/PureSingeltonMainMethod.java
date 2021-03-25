package com.robin.simple.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PureSingeltonMainMethod {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		PureSingelton psInstance1 = PureSingelton.getInstance();
		System.out.println(psInstance1.hashCode());

		try {
			PureSingelton psInstance2 = (PureSingelton) psInstance1.clone();
			System.out.println(psInstance1.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		Constructor<PureSingelton>[] cons = (Constructor<PureSingelton>[]) psInstance1.getClass()
				.getDeclaredConstructors();
		for (Constructor<PureSingelton> c : cons) {
			c.setAccessible(true);
			PureSingelton psInstance3 = c.newInstance();
			System.out.println(psInstance3.hashCode());
		}

		try {
			FileOutputStream fout = new FileOutputStream("F:\\ps.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(psInstance1);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fin = new FileInputStream("F:\\_Java_Study\\ps.ser");
			ObjectInputStream oIn = new ObjectInputStream(fin);
			PureSingelton psInstance4 = (PureSingelton) oIn.readObject();
			System.out.println(psInstance4.hashCode());
			oIn.close();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}
}
