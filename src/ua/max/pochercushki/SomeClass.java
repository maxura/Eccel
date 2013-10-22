package ua.max.pochercushki;

public class SomeClass {

    static char[][] array  = new char[11][11];
    static char[]   array2 = new char[11];
    static int      a      = 120;

    public static void main(String[] args) {
        a = a << 1;
        System.out.println(a);
        a = a >> 1;
        System.out.println(a);
//		for (int i = 0; i < 5; i++) {
//
//			for (int j = 0; j < array.length; j++) {
//				if (j == array.length / 2) {
//					array[i][j] = '*';
//					array[i][j + 1] = '*';
//					array[i][j - 1] = '*';
//
//				}
//
//				else {
//					array[i][j] = '|';
//				}
//
//			}
//
//		}
//
//		for (char[] cha : array) {
//			int as = 0;
//			if (as == 11)
//				System.out.println();
//			System.out.print(cha);
//			as++;
//		}
//	}
    }
}