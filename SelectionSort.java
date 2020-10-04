public static void selectionSort(int[] intArray){
        for(int i=intArray.length-1; i>0; i--){
            int largest = 0;
            for(int j=1; j<=i; j++){
                if (intArray[j] > intArray[largest]) {
                    largest = j;
                }
            }
            int temp = intArray[i];
            intArray[i] = intArray[largest];
            intArray[largest] = temp;
        }
        //return;
    }
