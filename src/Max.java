public class Max {
        static void max(int array[], int n)
        {
            int firstmin = array[0];
            int secmin = array[0];
            int thirdmin = array[0];
            for (int i = 0; i < n; i++)
            {
                if (array[i] > firstmin)
                {
                    thirdmin = secmin;
                    secmin = firstmin;
                    firstmin = array[i];
                }

                else if (array[i] > secmin)
                {
                    thirdmin = secmin;
                    secmin = array[i];
                }

                else if (array[i] > thirdmin)
                    thirdmin = array[i];
            }

            System.out.println("First max = " + firstmin );
            System.out.println("Second max = " + secmin );
            System.out.println("Third max = " + thirdmin );
        }
}
