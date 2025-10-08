public class Q4 
{
    public static void main(String[] args) {
        if(args[0] != null)
        {
            int fin = Integer.parseInt(args[0]);

            String finalStr = "";
            int cpt = 0;
            while (cpt <= fin) 
            {
                String s = "";
                for (int i = 1; i < cpt + 1; i++) 
                {
                    s += i + " ";
                }
                s += "\n";
                finalStr += s;
                cpt++;
            }
            System.out.println(finalStr);  
        } 
    }
}
