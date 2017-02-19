package edu.ashish.OS.MMU;

/**
 * Created by admin on 11-Nov-16.
 */
public class Memory {

    static int addressSpace[] = new int[1000];

    public static int[] getAddressSpace() {
        return addressSpace;
    }

    public static void setAddressSpace(int[] addressSpace) {
        Memory.addressSpace = addressSpace;
    }
    //allocate processID(int) in the above memory where a process is to be allocated
    //allocate 0 where there is a hole

    static void allocateMemory(int processID, int start, int size) {
        int end = start + size - 1;

        for (int x = start; x <= end; x++) {
            addressSpace[x] = processID;
        }

    }


    public static void main(String[] args) {

        int processesSize[] = new int[]{200, 100, 50, 400, 250};

        int[] start = new int[7];

        for (int j = 0; j < processesSize.length; j++) {
            start[j] = firstFitAllocate(900 + j, processesSize[j]);
        }


        System.out.println();


        for (int i = 0; i < getAddressSpace().length; i++) {

            int x = getAddressSpace()[i];
            System.out.print(x + "-" + i + "\t");
            //System.out.println(start[i] +  "\t" + (i) +  "\t" + +(processesSize[i]) );
        }

    }


    static int bestFitAllocate(int processID, int size) {

        int toReturn = -9999;
        for (int i = 0; i < 1000; i++) {
            if (addressSpace[i] == 0) {

                int start = i;

                //CHECK IF SPACE IS THERE
                int end = start + size;
                boolean isSpaceEmpty = true;
                for (int j = start; j < end; j++) {
                    if (addressSpace[j] != 0) isSpaceEmpty = false;
                }


                if (isSpaceEmpty) {
                    allocateMemory(processID, start, size);
                    toReturn = start;
                    break;
                }
            }
        }


        return toReturn;

    }

    static int firstFitAllocate(int processID, int size) {

        int toReturn = -9999;
        for (int i = 0; i < 1000; i++) {
            if (addressSpace[i] == 0) {

                int start = i;

                //CHECK IF SPACE IS THERE
                int end = start + size;
                boolean isSpaceEmpty = true;
                for (int j = start; j < end; j++) {
                    if (addressSpace[j] != 0) isSpaceEmpty = false;
                }


                if (isSpaceEmpty) {
                    allocateMemory(processID, start, size);
                    toReturn = start;
                    break;
                }

            }
        }


        return toReturn;

    }


}
