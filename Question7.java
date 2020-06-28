public class Question7
{
    public static void main(String name, int roll, int a, int b, int c, int d, int e)
    {
        System.out.println("90% or above"+"\t"+"Science with Computers"+"\n"+"80% — 89%"+"\t"+"Science without Computers"+"\n"+"70% — 79%"+"\t"+"Commerce with Math"+"\n"+"60% — 69%"+"\t"+"Commerce without Maths");
        int avg= (a+b+c+d+e)/5;
        System.out.println("Name:"+name+"\n"+"Roll no:"+roll+"\n"+"Avg:"+avg);
        if(avg>=90)
        {
            System.out.println("Science with Computers");
        }
        else if(avg>=80 && avg<=89)
        {
            System.out.println("Science without Computers");
        }
        else if(avg>=70 && avg<=79)
        {
            System.out.println("Commerce with Maths");
        }
        else if(avg>=60 && avg<=69)
        {
            System.out.println("Commerce without Maths");
        }
        else
        {
            System.out.println("Sorry! No streams are available for you!");
        }
    }
}