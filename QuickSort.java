    public static void quickSort(int[] input, int start, int end){
        if(end-start<2)
            return;

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1, end);
    }

    public static int partition(int[] input, int start, int end){
        // Using first element as pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i<j) {
            //empty loop
            // decrementing j till we find a value smaller than pivot
            while(i < j && input[--j] >= pivot);
            if(i<j)
                input[i] = input[j];

            // empty loop
            while(i<j && input[++i] <= pivot);
            if(i<j)
                input[j] = input[i];
        }
        input[j] = pivot;
        return j;
    }
