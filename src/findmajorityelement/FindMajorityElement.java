public class FindMajorityElement {


    public int findMajorityElement(int[] nums) {

        // Intailizes the values
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            // If count is 0, start tracking a new candidate
            if (count == 0) {
                candidate = num;
            }

            // 2. Voting: Check the current element against the candidate
            if (num == candidate) { // CORRECT LOGIC
                count++;
            } else {
                count--;
            }
        }


        int actualCount = 0;

        for (int num : nums) {
            if (num == candidate) {
                actualCount++;
            }
        }

        /* here actually condition (n/2 ) checks  is satisfying or not
        n= size of element and it has 6 elements ⇒ 6/2 =3
        Here  given condition was majority of occurrence  more than n/2 times means , it should occurs more than 3 or equal to
                */
        int n = nums.length;

        // Final Check: greater than n/2
        if (actualCount > n / 2) {
            return candidate;
        } else {
            // No  element exists
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2}; // Input array (n=6)

        // Create an object of the class
        FindMajorityElement obj = new FindMajorityElement();

        // Correctly call the instance method using the object 'obj'
        int result = obj.findMajorityElement(arr);

        System.out.println(result);
    }
}


