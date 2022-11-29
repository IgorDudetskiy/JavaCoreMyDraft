package samples_17_10;

public class Array {
    public static void main(String[] args) {
        int x = 1;
        int i = 0;
        int[] nums = new int[8];

        while (i < nums.length) {
            int randomNum = i;
            //int randomNum = (int) (Math.random()*9);
            nums[i] = randomNum;
            System.out.print(nums[i]);
            i++;
        }

        System.out.println("");

        int max = nums[0];
        int min = nums[0];
        int imax = 0;
        int imin = 0;
        i = 0;

        while (i < nums.length) {
            if (nums[i] < max) {
                max = nums[i];
                imax = i;
            }
            if (nums[i] > min) {
                min = nums[i];
                imin = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");
        System.out.print("Minimum = " + min);
        System.out.println(" is in " + (imin + 1) + " place");

        i = 0;
        while (i < nums.length) {
            if (i >= nums.length / 2) {
                int sum = 0;
                while (i < nums.length) {
                    sum += nums[i];
                    i++;
                }
                System.out.println("Sum = " + sum);
            }
            i++;
        }

        int tmp;
        for (i = 0; i < nums.length ; i++) {
            for (int j = 0 ; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                if (( i < nums.length * 0.25) && (j >= nums.length * 0.5 && j < nums.length * 0.75)) {
                tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        }
                }
            }
        }
        for (i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");

        i = 0;
        int[] numsA = new int[nums.length];
        int[] numsB = new int[nums.length];

        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int a = nums[i];
                numsA[i] = a;
                //System.out.print(numsA[i]);
            }
            if (nums[i] % 2 != 0) {
                int b = nums[i];
                numsB[i] = b;
                System.out.print(numsB[i]);
            }
        }
    }
}

