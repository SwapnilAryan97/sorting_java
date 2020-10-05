public static void shellSort(int[] intArray){
        for(int gap= intArray.length/2; gap>0; gap/=2){
            // insertion sort using gap
            for(int i=gap; i< intArray.length; i++) {
                int newElement = intArray[i];
                int j=i;
                //comparing at every gap
                while(j>=gap && intArray[j-gap]>newElement) {
                    intArray[j] = intArray[j - gap];
                    j-=gap;
                }
                intArray[j] = newElement;
            }
        }
    }
