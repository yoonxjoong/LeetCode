public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int n1 = 1;
        int n2 = n;
        int diff = n;

        while(n2 - n1 > 1) {
            diff = (n2 - n1) / 2 + n1;
            boolean badVersion = isBadVersion(diff);
            System.out.println("verions : " + badVersion + ", n1 : "+ n1 +", n2 :" + n2 + ", diff :"  + diff);
            if(!badVersion) {
                n1 = diff;
            } else{
                n2 = diff;
            }
        }

        if(n2 - n1 == 1) {
            boolean badVersion1 = isBadVersion(n1);
            boolean badVersion2 = isBadVersion(n2);

            if(badVersion1){
                return n1;
            }

            if(badVersion2) {
                return n2;
            }
        }

        return diff;
    }
}