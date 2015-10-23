public class CoinFlips extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
    int heads = 0;
    int tails = 0;
    for (int i = 0; i < 100; i++)
        {
            int coinFlip = Randomizer.nextInt(1, 2);
            if(coinFlip==1){
                heads+=1;
                System.out.println("Heads");
            }else{
                tails+=1;
                System.out.println("Tails");
            }

        }
            System.out.println("Heads: "+heads);
            System.out.println("Tails: "+tails);
            System.out.println("% Heads: " +(heads/100));
            System.out.println("% Tails: " +(tails/100));
    }
}
