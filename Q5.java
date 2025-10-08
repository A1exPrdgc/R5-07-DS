public class Q5
{
    public static void main(String[] args) {
        if(args[0] != null)
        {
            int fin = Integer.parseInt(args[0]);

            String finalStr = "";
            int cpt = fin;
            while (cpt >= 0) 
            {
                String s = "";
                for (int i = 0; i < cpt; i++) 
                {
                    s += "x ";
                }
                s += "\n";
                finalStr += s;
                cpt--;
            }
            System.out.println(finalStr);  
        } 
    }
}

