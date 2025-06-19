package CRT25.OOPS.Inheritance;
public class Main {
    public static void main(String[] args){
        Child c1 = new Child("Sujal",20,20_00_000,"Amravati");
        System.out.println(c1.residency);

        Parent p = new Parent(10_00_000,"Nagpur");
        //! UpCasting in java -- allowed
        Parent p2 = new Child("Sujal",20,20_00_000,"Amravati");
        System.out.println(p2.assets);


        //! DownCasting -- not allowed requires Casting
//?       Child c2 =  new Parent(10_000,"amravati");
}
}
