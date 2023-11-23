public class Lab10_5 {
    public static void main(String[] args) {
        final int MAX_SIZE = 15;
        
        int[] values = new int[MAX_SIZE];
        System.out.print("List is :");
        for(int i = 0; i < values.length; i++){
            values[i] = (int)(Math.random() * 99 + 1);
            System.out.printf("%d ", values[i]);
        }

        int longestSeq = 0;
        int longestSeqIndex = 0;
        int seq = 0;
        int seqIndex = 0;
        for(int i = 0; i < values.length - 1; i++){
            if(values[i] < values[i + 1]){
                seq++;
            } else {
                seq = 1;
                seqIndex = i + 1;
            }

            if(seq > longestSeq){
                longestSeq = seq;
                longestSeqIndex = seqIndex;
            }
        }
        System.out.printf("\nLongest sequence is : %d\n", longestSeq);
        System.out.printf("Location is.        : %d\n", longestSeqIndex);

        System.out.printf("sequence values are :");
        for(int i = 0; i < longestSeq; i++){
            System.out.printf("%d ", values[i + longestSeqIndex]);
        }
        System.out.println();
    }   
}
