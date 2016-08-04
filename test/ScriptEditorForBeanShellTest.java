import org.junit.Assert;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * Created by Nadith on 8/4/2016.
 */
public class ScriptEditorForBeanShellTest {

    @org.junit.Test
    public void testGetimage() throws Exception {

        ScriptEditorForBeanShell obj = new ScriptEditorForBeanShell();

        String[] labels = {"Run", "Clear", "Save", "Close", "Undo", "Redo"};

        for (String label : labels) {
            String pathToImages = label + ".png";

            ImageIcon testz = obj.getimage(pathToImages);

            if (testz.equals(null)) {
                Assert.fail();
            } else {


            }


        }
    }
}