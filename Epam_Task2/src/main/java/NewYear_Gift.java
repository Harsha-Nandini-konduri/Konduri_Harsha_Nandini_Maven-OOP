public class NewYear_Gift extends Chocolates implements Sweets
{
    public int total_weight_sweets(int count_of_sweets,int weight_of_sweets)
    {
        int total_weight=0;
        total_weight=count_of_sweets*weight_of_sweets;   //Calculation of Sweets weight
        return total_weight;
    }
    public static void main(String[] args)
    {
        int [] chocolates_weight=new int[4];   //Array to store Chocolate weights
        int gift_weight;

        Sweets kova=new NewYear_Gift();            // Object creation
        Chocolates roast_almond=new Chocolates();
        chocolates_weight[0]=roast_almond.chocolates_weight(15,5);
        gift_weight=chocolates_weight[0]+kova.total_weight_sweets(20,5);
        System.out.println("Total weight of gift1 is :"+gift_weight);

        Sweets halwa=new NewYear_Gift();
        Chocolates snickers=new Chocolates();
        chocolates_weight[1]=snickers.chocolates_weight(20,4);
        gift_weight=chocolates_weight[1]+halwa.total_weight_sweets(10,7);
        System.out.println("Total weight of gift2 is :"+gift_weight);

        Sweets malpuri=new NewYear_Gift();
        Chocolates kitkat=new Chocolates();
        chocolates_weight[2]=kitkat.chocolates_weight(10,3);
        gift_weight=chocolates_weight[2]+malpuri.total_weight_sweets(10,5);
        System.out.println("Total weight of gift3 is :"+gift_weight);

        Sweets Rasagulla=new NewYear_Gift();
        Chocolates munch=new Chocolates();
        chocolates_weight[3]=munch.chocolates_weight(13,3);
        gift_weight=chocolates_weight[3]+Rasagulla.total_weight_sweets(17,4);
        System.out.println("Total weight of gift4 is :"+gift_weight);

        // Sorting according to chocolate weights

        for(int i=0;i<chocolates_weight.length;i++)
        {
            for(int j=i+1;j<chocolates_weight.length;j++)
            {
                if(chocolates_weight[i]>chocolates_weight[j])
                {
                    int var=chocolates_weight[i];
                    chocolates_weight[i]=chocolates_weight[j];
                    chocolates_weight[j]=var;
                }
            }
        }
        System.out.println("Order of chocolates in the gifts:");
        for(int i=0;i<chocolates_weight.length;i++)
        {
            System.out.println(chocolates_weight[i]);
        }
        System.out.println();
    }

}
