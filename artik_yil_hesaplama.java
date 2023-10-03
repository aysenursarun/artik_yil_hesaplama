package artik_yil_hesaplama;

import java.util.Scanner;

public class artik_yil_hesaplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Yılı girin: ");
		int yıl = scan.nextInt();

		if (yıl % 4 == 0) {
			int yil2 = yıl;

			if (yil2 % 100 != 0) {
				System.out.print(yil2 + " artık yıldır.");
			}

			else if (yil2 % 100 == 0 && yil2 % 400 == 0) {

				System.out.print(yil2 + " artık yıldır.");

			} else {
				System.out.print(yıl + " artık yıl değildir.");
			}

		} else {
			System.out.print(yıl + " artık yıl değildir.");
		}

	}

}
