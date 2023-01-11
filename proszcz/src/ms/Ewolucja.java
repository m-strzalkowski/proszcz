package ms;

import ms.gp.ewolucja.Ewolutor;

public class Ewolucja {
    public static void main(String[] args) {
        System.out.println("ProszczGP\n");
        if(args.length>0 && args[0]!=null && args[0].length()>0)
        {
            System.out.println("working directory:"+args[0]);
            Ewolutor ewolutor = new Ewolutor(System.out, args[0]);
        }
        else{
            System.out.println("Please, supply as an argument name of catalog to work in (ending in / or \\. Create a genet.txt file inside it if You want it to be interpreted according to grammar ProszczGP.)");
        }
    }
}
