package day_2;

public class Pattern_AtoZ {

	public static void main(String[] args) {
		// A
				for (int i = 0; i < 5; i++) {
				    for (int j = 0; j < 5; j++) {
				        if (j == 0 || j == 4 || i == 0 || i == 2)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// B
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    for (int j = 0; j < 4; j++) {
				        if ((i == 0 || i == 2 || i == 4) && j < 3)
				            System.out.print("* ");
				        else if (j == 3 && !(i == 0 || i == 2 || i == 4))
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// C
				for (int i = 0; i < 5; i++) {
				    for (int j = 0; j < 5; j++) {
				        if (i == 0 || i == 4 || j == 0)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// D
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    for (int j = 0; j < 4; j++) {
				        if (i == 0 || i == 4 || j == 3)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// E
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    if (i == 0 || i == 2 || i == 4) {
				        for (int j = 1; j < 5; j++)
				            System.out.print("* ");
				    }
				    System.out.println();
				}

				// F
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    if (i == 0 || i == 2) {
				        for (int j = 1; j < 5; j++)
				            System.out.print("* ");
				    }
				    System.out.println();
				}

				// G
				for (int i = 0; i < 5; i++) {
				    for (int j = 0; j < 5; j++) {
				        if (i == 0 || i == 4 || j == 0 || (i == 3 && j >= 2) || (j == 4 && i >= 2))
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// H
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    for (int j = 1; j < 4; j++) {
				        if (i == 2)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println("* ");
				}

				// I
				for (int i = 0; i < 5; i++) {
				    if (i == 0 || i == 4)
				        for (int j = 0; j < 5; j++) System.out.print("* ");
				    else
				        System.out.print("    *");
				    System.out.println();
				}

				// J
				for (int i = 0; i < 5; i++) {
				    if (i == 0)
				        for (int j = 0; j < 5; j++) System.out.print("* ");
				    else if (i < 4)
				        System.out.print("    *");
				    else {
				        System.out.print("* * * ");
				    }
				    System.out.println();
				}

				// K
				int n = 5;
				for (int i = 0; i < n; i++) {
				    System.out.print("* ");
				    for (int j = 0; j < n; j++) {
				        if (j == n - i - 1 || j == i - 1)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// L
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    if (i == 4)
				        for (int j = 1; j < 5; j++) System.out.print("* ");
				    System.out.println();
				}

				// M
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    for (int j = 0; j < 5; j++) {
				        if ((j == i && j < 3) || (i + j == 4 && j > 1))
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println("* ");
				}

				// N
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    for (int j = 0; j < 5; j++) {
				        if (j == i)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println("* ");
				}

				// O
				for (int i = 0; i < 5; i++) {
				    for (int j = 0; j < 5; j++) {
				        if ((i == 0 || i == 4) && j > 0 && j < 4 || (j == 0 || j == 4) && i > 0 && i < 4)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// P
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    for (int j = 0; j < 4; j++) {
				        if (i == 0 || i == 2)
				            System.out.print("* ");
				        else if (j == 3 && i < 2)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// Q
				for (int i = 0; i < 5; i++) {
				    for (int j = 0; j < 5; j++) {
				        if ((i == 0 || i == 3) && j > 0 && j < 4 || (j == 0 || j == 4) && i > 0 && i < 3 || (i == 4 && j == 4))
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// R
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    for (int j = 0; j < 4; j++) {
				        if (i == 0 || i == 2)
				            System.out.print("* ");
				        else if (j == 3 && i < 2)
				            System.out.print("* ");
				        else if (j == i - 1 && i > 2)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// S
				for (int i = 0; i < 5; i++) {
				    for (int j = 0; j < 5; j++) {
				        if (i == 0 || i == 2 || i == 4 || (j == 0 && i < 3) || (j == 4 && i > 2))
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// T
				for (int i = 0; i < 5; i++) {
				    if (i == 0)
				        for (int j = 0; j < 5; j++) System.out.print("* ");
				    else
				        System.out.print("    *");
				    System.out.println();
				}

				// U
				for (int i = 0; i < 5; i++) {
				    if (i < 4)
				        System.out.println("*       *");
				    else
				        System.out.println("  * * *  ");
				}

				// V
				for (int i = 0; i < 5; i++) {
				    for (int j = 0; j < 9; j++) {
				        if (j == i || j == 8 - i)
				            System.out.print("*");
				        else
				            System.out.print(" ");
				    }
				    System.out.println();
				}

				// W
				for (int i = 0; i < 5; i++) {
				    System.out.print("* ");
				    for (int j = 0; j < 5; j++) {
				        if ((i == 4 && (j == 1 || j == 3)) || (i == 3 && j == 2))
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println("* ");
				}

				// X
				for (int i = 0; i < 5; i++) {
				    for (int j = 0; j < 5; j++) {
				        if (i == j || i + j == 4)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}
				
				//Y
				for (int i = 0; i < 5; i++) {
				    for (int j = 0; j < 5; j++) {
				        if ((i == j && i < 3) || (i + j == 4 && i < 3) || (j == 2 && i > 2))
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}

				// Z
				for (int i = 0; i < 5; i++) {
				    for (int j = 0; j < 5; j++) {
				        if (i == 0 || i == 4 || i + j == 4)
				            System.out.print("* ");
				        else
				            System.out.print("  ");
				    }
				    System.out.println();
				}
	}
}
