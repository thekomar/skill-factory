package abstractclass.webinarscode;

public interface MyInterface {
    String CONSTANT = "CONSTANT";
    int INTEGER_CONSTANT = 1;

    void action(String s);

    void actions(String[] s);

    String action(int i);

    static String defaultAction(String s){
        return "default Actions" + s;
    }
    static String defaultAction(){
        return "default Actions without Params";
    }

}
