public class Recursion {
    static int count8(int n){
        if(n%100 == 88) return 2+count8(n/10);
        if(n == 8);
        if(n<10) return 0;
        return count8(n/10) + count8(n%10);
    }

    static int powerN(int n, int x){
        if(x == 1) return n;
        return n*powerN(n,x-1);
    }

    static int countX(String str){
        if(str.length()==0) return 0;
        if(str.charAt(0) == 'x') return 1+countX(str.substring(1));
        return countX(str.substring(1));
     }

     static int countHi(String str){
        if(str.length()<=1) return 0;
        if(str.substring(0,2).equals("hi")) return 1+countHi(str.substring(2));
        return countHi(str.substring(1));
     }

     static String changeXY(String str){
        if(str.length()==0) return "";
        if(str.substring(0,1).equals("x")) return "y" + changeXY(str.substring(1));
        return str.substring(0,1)+changeXY(str.substring(1));
     }

     static String changePi(String str) {
        if(str.length()<=1) return str;
        if(str.substring(0,2).equals("pi")) return "3.14"+changePi(str.substring(2));
        return str.substring(0,1)+changePi(str.substring(1));
    }

     static String noX(String str) {
        if(str.length()==0) return "";
        if(str.charAt(0)!='x') return str.substring(0,1) + noX(str.substring(1));
        return noX(str.substring(1));
    }

     static boolean array6(int[] nums, int index) {
        if(index==nums.length) return false;
        if(nums[index]==6) return true;
        return array6(nums,index+1);
     }

      static int array11(int[] nums, int index) {
        if(index == nums.length) return 0;
        if(nums[index] == 11) return 1+array11(nums, index+1);
        return array11(nums,index+1);
    }

       static boolean array220(int[] nums, int index) {
        if (index == nums.length-1 || nums.length==0) return false;
        if(nums[index]*10==nums[index+1]) return true;
        return array220(nums, index+1);
       }

       static String allStar(String str) {
        if(str.length()<=1) return str;
        return str.substring(0,1)+"*"+allStar(str.substring(1));
       }

       static String pairStar(String str) {
        if(str.length()<=1) return str;
        if(str.charAt(0)==str.charAt(1)) return str.substring(0,1)+"*"+pairStar(str.substring(1));
        return str.substring(0,1)+pairStar(str.substring(1));
       }

       static String endX(String str) {
        if(str.length()==0) return "";
        if(str.charAt(0)=='x') return endX(str.substring(1))+"x";
        return str.substring(0,1)+endX(str.substring(1));
       }

       static int countPairs(String str) {
        if(str.length()<3) return 0;
        if(str.charAt(0) == str.charAt(2)) return 1+countPairs(str.substring(1));
        return countPairs(str.substring(1));
       }

       static int countAbc(String str) {
        if(str.length()<3) return 0;
        if(str.substring(0,3).equals("abc")||str.substring(0,3).equals("aba")) return 1+countAbc(str.substring(1));
        return countAbc(str.substring(1));
       }

       static int count11(String str) {
        if(str.length()<=1) return 0;
        if(str.substring(0,2).equals("11")) return 1+count11(str.substring(2));
        return count11(str.substring(1));
       }

       static String stringClean(String str) {
        if(str.length()<=1) return str;
        if(str.charAt(0)==str.charAt(1)) return stringClean(str.substring(1));
        return str.substring(0,1)+stringClean(str.substring(1));
       }

       static int countHi2(String str) {
        if(str.length()<=1) return 0;
        if(str.length()>2 && str.substring(0,3).equals("xhi")) return countHi2(str.substring(3));
        if(str.substring(0,2).equals("hi")) return 1+countHi2(str.substring(2));
        return countHi2(str.substring(1));
       }

       static String parenBit(String str){
        if(str.length() == 0) return "";
        if(str.charAt(0)=='(') {
            if (str.charAt(str.length()-1)==')') return str;
            else return parenBit(str.substring(0,str.length()-1));
        }
        else return parenBit(str.substring(1));
       }

       static public boolean nestParen(String str) {
        if(str.length()==0) return true;
        if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')') return nestParen(str.substring(1,str.length()-1));
        else return false;
       }
       static int strCount(String str, String sub) {
        if(str.length()<sub.length()) return 0;
        if(str.substring(0,sub.length()).equals(sub)) return 1+strCount(str.substring(sub.length()),sub);
        return strCount(str.substring(1),sub);
        }

        static boolean strCopies(String str, String sub, int n) {
        if (str.length()<sub.length()) return (n<=0);
        if(str.substring(0,sub.length()).equals(sub)) return strCopies(str.substring(1),sub,n-1);
        return strCopies(str.substring(1),sub,n);
        }

        static int strDist(String str, String sub) {
            if(str.length()<sub.length()) return 0;
            if(str.substring(0,sub.length()).equals(sub)) {
                if (str.substring(str.length()-sub.length()).equals(sub))return str.length();
                return strDist(str.substring(0,str.length()-1), sub);
            }
            return strDist(str.substring(1), sub);
        }



    public static void main(String[] args) {
        System.out.println(strDist("abccatcowcatcatxyz", "cat") );

    }
}
