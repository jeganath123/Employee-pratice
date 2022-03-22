public class Employee {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 5,11, 5, 2, 1, 6};
        int []c;
        int mid;
        for (int m = 0; m <arr.length ; m++)
        {
            int i = 0;
            int temp=arr.length;
            while (temp > 1)
            {
                if (arr[i] > arr[i + 1])
                {
                    mid = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = mid;
                }
                i++;
                temp--;

            }
        }

        for (int j = 0; j <arr.length; j++) {
           // c= new int[]{arr[j]};
            System.out.print(arr[j]+" ");
        }

    }

}
