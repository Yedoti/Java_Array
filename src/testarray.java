/**
 * Created by SUDHEER YEDOTI on 6/10/2017.
 **/
public class testarray
{
    public static void main(String[] args)

    {
        double[] mylist={1.9,2.9,3.4,3.5};
        for(int i=0;i<mylist.length;i++)
        {
            System.out.println(mylist[i]+" ");
        }
        double total=0;
        for(int i=0;i<mylist.length;i++)
        {
            total+=mylist[i];
        }
        System.out.println("total is "+total);
        double max= mylist[0];
        for(int i=1;i<mylist.length;i++)
        {
            if(mylist[i]>max)
                max=mylist[i];
        }
        System.out.println("max is"+max);
    }
}