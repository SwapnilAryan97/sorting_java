// to find min and max in an array use...
// int min = Arrays.stream(<array_name>).min().getAsInt();
// int max = Arrays.stream(<array_name>).max().getAsInt();

public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max-min)+1];

        for(int i=0; i<input.length; i++){
            // making index of countArray from 0 to input.length
            countArray[input[i]-min]++; //counting phase
        }
        int j=0;
        for(int i=min; i<=max; i++){
            while(countArray[i-min]>0){
                // placing all integers into input[] from countArray[]
                input[j++] = i;
                countArray[i-min]--;
            }
        }
    }
