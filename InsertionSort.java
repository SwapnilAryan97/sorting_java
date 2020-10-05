public static void insertionSort(int[] intArray){
        for(int i=1; i< intArray.length; i++){
            int newElement = intArray[i];
            int j;
            for(j=i; j>0 && intArray[j-1]>newElement; j--){
                // shifting values larger than newElement to the right
                intArray[j] = intArray[j-1];
            }
            // inserting newElement to the left of larger elements
            intArray[j] = newElement;
        }
    }
