class ArraySumAndAverage
{
public static void main(String args[])
{
int[]numbers={12,-23,5,7,23,-1,0,8};
int sum=0;
double average;
for(int number:numbers)
{
sum+=number;
}
int arrLength=numbers.length;
average=((double)sum/(double)arrLength);
System.out.println("Sum="+sum);
System.out.println("Avarage="+average);
}
}
