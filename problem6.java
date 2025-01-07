//print hollow recatngle pattern
public class problem6 {
    public static void hollow_Rectangle(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1 | j==1 | i==totRows | j==totCols ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
    public static void inverted_rotated_half_pyramid(int rows){
        for(int i=1;i<=rows;i++){
            //spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid_numbers(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=(rows-i+1);j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void floyds_traingle(int rows){
        int counter=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_traingle(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void butterfly_pattern(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(2*(rows-i));k++){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=(2*(rows-i));k++){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
           

        }

    }
    public static void solid_rhombus(int rows){
        for(int i=1;i<=rows;i++){
            //space
            for(int j=1;j<=(rows-i);j++){
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=rows;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=(rows-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=rows;k++){
                if(i==1 | i==rows | k==1 |k==rows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        hollow_Rectangle(5, 5);
        System.out.println();
        inverted_rotated_half_pyramid(6);
        inverted_half_pyramid_numbers(5);
        System.out.println();
        floyds_traingle(5);
        System.out.println();
        zero_one_traingle(5);
        System.out.println();
        butterfly_pattern(4);
        solid_rhombus(5);
        System.out.println();
        hollow_rhombus(5);
        
    }
    
}
