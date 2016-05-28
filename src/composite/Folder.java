package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zero on 28/05/16.
 */
public class Folder implements Node {
    private final String directory;
    private final List<Node> nodes = new ArrayList<>();

    public Folder(String directory, List<Node> nodeChildDirectories) {
        this.directory = directory;
        nodes.addAll(nodeChildDirectories);
    }

    @Override
    public void dir() {
        dir(null);
    }

    public void dir(String basedir) {
        String fullDir = basedir == null ? directory : String.format("%s/%s", basedir, directory);
        for (Node node: nodes) {
            node.dir(fullDir);
        }
    }

    public String getDirectory() {
        return directory;
    }
}
