import javax.swing.*;

/**
 * Created by Nadith on 8/4/2016.
 */
public class ScriptEditorForBeanShell {
    public ScriptEditorForBeanShell() {
    }

    public ImageIcon getimage(String temp){


        //System.out.println((getClass().getClassLoader().getResource(temp)));

        return  new ImageIcon(getClass().getClassLoader().getResource(temp));

    }



}
