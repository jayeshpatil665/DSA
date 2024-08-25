public class Patterns {
    
    public static void patternOne(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternTwo(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternThree(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void patternFour(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void patternFourOne(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void patternFourTwo(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternFive(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }

    public static void patternSix(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){ //printing spaces
                System.out.print(" _ ");
            }
            for(int j=1;j<=i;j++){ //printing fist set of starts
                System.out.print(" * ");
            }
            for(int j=1;j<i;j++){ //printing second set of stars
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void patternSeven(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" _ ");
            }

            //if(i==1)
            //    continue;

            for(int j=0;j<=2*n-i-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void patternEleven(int n){
        boolean bit = true;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                bit = !bit;
                System.out.print(bit?0:1);
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {

        for(int i=1;i<=n;i++){
            int j=1;
            for(;j<=n-i;j++){
                System.out.print(" ");
            }
            for(;j<=n;j++){
                System.out.print("*");
            }
            
            for(j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            int j=1;
            for(;j<i;j++){
                System.out.print(" ");
            }
            for(;j<=n;j++){
                System.out.print("*");
            }
            
            for(j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern10(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11(int n) {
        for(int i=1;i<=n;i++){
            boolean bit = (i%2==0?false:true);
            for(int j=1;j<=i;j++){
                System.out.print(((bit)?1:0)+" ");
                bit = !bit;
            }
            System.out.println();
        }
    }

    public void pattern12(int n) {

        int spaceSize = n;
        for(int i=1;i<=n;i++){
            int j=1;
            for(;j<=i;j++){
                System.out.print(j);
            }

            for(int l=spaceSize;l>1;l--)
                System.out.print("  ");

            for(int k=i;k>=1;k--){
                 System.out.print(k);
            }

            System.out.println();
            spaceSize--;
        }

    }

    public void pattern13(int n) {

        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public void pattern14(int n) {

        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public void pattern15(int n) {
        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=i;j<=n;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public void pattern16(int n) {

        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }

}
