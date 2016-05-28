package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zero on 28/05/16.
 */
public class Client {
    public static void main(String[] args) {
        Node myImage1 = new File("image1.jpg");
        Node myImage2 = new File("image2.png");
        List<Node> images = new ArrayList<Node>() {{
            add(myImage1);
            add(myImage2);
        }};

        Node myDocument1 = new File("document.pdf");
        List<Node> documents = new ArrayList<Node>() {{
            add(myDocument1);
        }};


        Node documentsDirectory = new Folder("documents", documents);
        Node imagesDirectory = new Folder("images", images);
        List<Node> homeDirectory = new ArrayList<Node>() {{
            add(documentsDirectory);
            add(imagesDirectory);
        }};

        Node home = new Folder("home", homeDirectory);

        home.dir();
    }
}
