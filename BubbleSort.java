public static void bubbleSort(int[] intArray) {

        int i, j, temp = 0;

        // traversing through the array
        for (i = intArray.length - 1; i > 0; i--) {
            for (j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    // swapping values
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    return ;
    }
