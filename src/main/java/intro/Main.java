package intro;

public class Main {
    public static void main(String[] args) {
        String s = "SkillFactory";
        String anyName;
        anyName = "new Name";

        int i = 123;

        if (i >= 123) {
            System.out.println(s);
        } else {
            System.out.println(anyName);
        }
        System.out.println("-----");
        for (int k = 2; k <= 5; k++) {
            System.out.println(k);
        }
        System.out.println("-----");
        for (int l = 5; l >= 0; l--) {
            System.out.println(l);
        }
        System.out.println("---");

        int w = 2;
        while (w>3){
            System.out.println(w);
            w++;
        }

        int p = 3;
        do {
            System.out.println("Do =  " + p);
            p++;
        }while (p<10);


    }
}
