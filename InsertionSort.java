public static void insertionSort(int[] intArray){
        for(int i=1; i<intArray.length; i++){
            int newElement = intArray[i];
            int j;
            for(j=i; j>0 && intArray[j-1]>newElement; j--){
                intArray[j] = intArray[j-1];
            }
            intArray[j] = newElement;
        }
    }
