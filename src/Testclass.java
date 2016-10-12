/**
 * Created by Kasper on 12/10/2016.
 */
public class Testclass {

    public Testclass (){

    }

    public void writeMessage(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        Testclass tc = new Testclass();
        tc.writeMessage("This ought to give a merge conflict -development branch");
    }
}
