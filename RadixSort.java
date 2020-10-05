// Calling : radixSort(radixArray, 10, <width>);
// 7654 has a width = 4
// 10 is countArray i.e. 0-9

public static void radixSort(int[] input, int radix, int width)
    {
        for (int i = 0; i<width; i++) {
            radixSingleSort(input, i, radix); //radix is the count array
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix)
    {
        int numItems = input.length;
        int[] countArray = new int[radix];

        // Counting the number of values that have a specific digit in their place value
        for(int value : input) {
            //raw count
            countArray[getDigit(position, value, radix)]++;
        }

        //Adjust the count array
        for(int j = 1; j<radix; j++) {
            //no. of values that have that digit or less than that digit in the position we're working with
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];

        for(int tempIndex = numItems-1; tempIndex>=0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for(int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    //Getting the digit of each place value
    public static int getDigit(int position, int value, int radix)
    {
        return (value/(int)Math.pow(radix, position) % radix);
    }
