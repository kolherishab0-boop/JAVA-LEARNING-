import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {




        Scanner sc =new Scanner(System.in);

        System.out.println("ENTER NUMBER : ");


        int n=sc.nextInt();

        int fact=n;

        if (n==0 || n==1)
        {

            System.out.println("FACTORIAL IS = 1");
        }
    else{

    for(int i=n-1;i>=1;i--)

    {
        int previous=fact;
        fact*=i;

        System.out.println(previous + "x"+i+"="+fact);
    }


    System.out.println("FACTORIAL Of NUMBER "+n+"="+fact);
    }






    }
}
