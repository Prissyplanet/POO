public class Principal {
    public static void main(String[]args){
        Planet x= new Planet("Tierra",1500,"solida",365,50000);
        Planet y= new Planet("Júpiter",15384593,"gaseosa",4329,654867458);
        Planet z= new Planet("Saturno", 12344, "gaseosa",10585,90000);

        Asteroid a=new Asteroid("KPDP","solida",5000,342347832);
        Asteroid b=new Asteroid("AFPA", "solida", 89000, 1010100);
        Asteroid c=new Asteroid("TAAP","solida",234567,87548);
        System.out.println(x.getName());
        System.out.println(a.getSpeed());
        System.out.println(b.getComposition());
        System.out.println(a.getName());

    }

}
