public static void selectionSort(int[] intArray){
        // starting from enf of array
        for(int i=intArray.length-1; i>0; i--){
            int largest = 0;
            // traversing from start to end of array    
            for(int j=1; j<=i; j++){
                if (intArray[j] > intArray[largest]) {
                    largest = j;
                }
            } 
            // placing largest value at the end of the array
            int temp = intArray[i];
            intArray[i] = intArray[largest];
            intArray[largest] = temp;
        }
    }
