/* output :

================================

java           100
python         200
c++            080
================================

*/

import java.util.*;

public class Formattng {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
                //System.out.printf("%s \n"+s1,x);
                //Complete this line
            }
            sc.close();
            System.out.println("================================");

    }
}
