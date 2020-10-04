public static void selectionSort(int[] intArray){
        int i, temp = 0;
        for(i=intArray.length; i>0; i--){
            int largest = intArray[i];
            int j = 1;
            while(j>0 && intArray[j-1]>largest){
                intArray[largest] = intArray[j-1];
                j++;
            }
            intArray[i] = intArray[largest];
        }
        //return;
    }
