import java.awt.*;
import java.awt.datatransfer.*;

public class Potato{
    public static void main(String args[]){
        System.out.println("What is this?");
        int code;

        try{
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection data = new StringSelection("never gonna give you up");

            clipboard.setContents(data, data);

            code = 0;
        }catch(Exception e){
            System.out.println(e.getMessage());

            code = 1;
        }

        System.exit(code);
    }
}
