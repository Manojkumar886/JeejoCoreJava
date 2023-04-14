package FundamentalJava.ArrayImplementation;

import java.util.Arrays;

public class SimpleTask
{

   private int [][] TwodArray={{12,13,14},{56,57,58},{97,98,99}};
    public void Implementaion()
    {
        for(int row=0;row<TwodArray.length;row++)
        {
            for(int col=0;col<TwodArray.length;col++)
            {
                System.out.print(TwodArray[row][col]+" ");
            }
            System.out.println();
        }

        int [] convertingsingle=new int[TwodArray.length*3];
        int row=2,col=0,index=0;
        for(;col<TwodArray.length;col++,index++)
        {
            convertingsingle[index]=TwodArray[row][col];
        }
        row--;col--;//col=2,row=1
        for(;row>=0;row--,index++)
        {
            convertingsingle[index]=TwodArray[row][col];
        }
        col--;row++;
        for(;col>=0;col--,index++)
        {
            convertingsingle[index]=TwodArray[row][col];
        }
        row++;col++;
        for(;col<=1;col++,index++)
        {
            convertingsingle[index]=TwodArray[row][col];
        }
//        [57,58,14,13,12,56,99,98,97]

        System.out.println(Arrays.toString(convertingsingle));

    }
    public static void main(String[] args)
    {

        SimpleTask task1=new SimpleTask();
        task1.Implementaion();

    }
}
