package ua.lviv.lgs;

public class JavaCoreLesson01 {

	public static void main(String[] args) {
		byte bt = 74;
		short sh;
		int in = 89956555;
		long l = 45788L;
		float f = 12.021F;
		double d = 9562.14587;
		char c = 'w';
		boolean b;

		System.out.println(
				"Мінімальне значення Byte = " + Byte.MIN_VALUE + " Максимальне значення Byte = " + Byte.MAX_VALUE);
		System.out.println(
				"Мінімальне значення Short = " + Short.MIN_VALUE + " Максимальне значення Short = " + Short.MAX_VALUE);
		System.out.println("Мінімальне значення Integer = " + Integer.MIN_VALUE + " Максимальне значення Integer = "
				+ Integer.MAX_VALUE);
		System.out.println(
				"Мінімальне значення Long = " + Long.MIN_VALUE + " Максимальне значення Long = " + Long.MAX_VALUE);
		System.out.println(
				"Мінімальне значення Float = " + Float.MIN_VALUE + " Максимальне значення Float = " + Float.MAX_VALUE);
		System.out.println("Мінімальне значення Double = " + Double.MIN_VALUE + " Максимальне значення Double = "
				+ Double.MAX_VALUE);
		System.out.println("Мінімальне значення Character = " + Character.MIN_CODE_POINT
				+ " Максимальне значення Character = " + Character.MAX_CODE_POINT);
		System.out.println("Значення Boolean за замовчуванням = " + Boolean.getBoolean(null));

		int[] array = { 55, 12, 38, 64, 125, 96, 77, 48, 89, 33 };
		int temp;

		System.out.println("Оригінальний масив ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// sort ++
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		// output console
		System.out.println("\nВідсортований по зростанню ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

		// sort -- 
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		// output console
		System.out.println("\nВідсортований за зменшенням ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

//First commit to gitHub
	}

}
