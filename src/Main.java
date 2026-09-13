//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // Задача № 1
    int[] digitsArr = new int[]{1, 2, 3};
    float[] floatArr = new float[]{1.57f, 7.654f, 9.986f};
    char[] varcharArr = new char[]{'a', 'b', 'c'};

    // Задача № 2
    for (int d = 0; d < digitsArr.length; d++) {
        System.out.print(digitsArr[d]);
        if (d != digitsArr.length - 1) {
            System.out.print(", ");
        }
    }

    System.out.println();

    for (int f = 0; f < floatArr.length; f++) {
        System.out.print(floatArr[f]);
        if (f != digitsArr.length - 1) {
            System.out.print(", ");
        }
    }

    System.out.println();

    for (int c = 0; c < varcharArr.length; c++) {
        System.out.print(varcharArr[c]);
        if (c != digitsArr.length - 1) {
            System.out.print(", ");
        }
    }

    System.out.println();

    // Задача № 3
    for (int d = digitsArr.length - 1; d >= 0; d--) {
        System.out.print(digitsArr[d]);
        if (d > 0) {
            System.out.print(", ");
        }
    }

    System.out.println();

    for (int f = floatArr.length - 1; f >= 0; f--) {
        System.out.print(floatArr[f]);
        if (f > 0) {
            System.out.print(", ");
        }
    }

    System.out.println();

    for (int c = varcharArr.length - 1; c >= 0; c--) {
        System.out.print(varcharArr[c]);
        if (c > 0) {
            System.out.print(", ");
        }
    }

    System.out.println();

    // Задача № 4
    for (int d = 0; d < digitsArr.length; d++) {
        if (digitsArr[d] % 2 != 0) {
            digitsArr[d] += +1;
        }
    }

    System.out.println(Arrays.toString(digitsArr));
}
