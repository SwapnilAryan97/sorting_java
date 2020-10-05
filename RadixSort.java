// *WORKS WITH INEGERS OF ANY LENGTH*
// To use only for same width integers, remove the last two methods : width(int[] radixArray) & digitCount(int num)

// Calling : radixSort(radixArray, 10, width(radixArray)); #
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
    
    // Counting width of largest integer
    public static int width(int[] radixArray)
    {
        int width = 0;
        for(int i = 0; i<radixArray.length; i++) {
            width = Math.max(width, digitCount(radixArray[i]));
        }
        return width;
    }
    
    // Counting digit of every integer in the array (used in width() method)
    public static int digitCount(int num)
    {
        if(num == 0) {
            return 1;
        }
        return (int) (Math.floor(Math.log10(Math.abs(num)))+1);
    }
