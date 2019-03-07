package labs_examples.arrays.examples;

// Use length variable to help copy an array.
class ACopy {
    public static void main(String args[]) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for(i=0; i < nums1.length; i++)
            nums1[i] = i;

        // copy nums1 to nums2
        if(nums2.length >= nums1.length)
            for(i = 0; i < nums2.length; i++)
                nums2[i] = nums1[i];
        System.out.println(nums1[0]);
        for(i=0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
        nums2[0] = 10;
        System.out.println(nums1[0]);
        System.out.println(nums2[0]);
        nums2[0] = 0;
        System.out.println(nums1[0]);
        nums2 = nums1;
        nums2[0] = 10;
        System.out.println(nums1[0]);
        // nums2 = nums1 was treated as reference while nums2[0] = nums1[0] was treated as copy

    }
}