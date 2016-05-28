package composite;

/**
 * Created by zero on 28/05/16.
 */
public class File implements Node {
    private final String directory;

    public File(String directory) {
        this.directory = directory;
    }

    @Override
    public void dir() {
        System.out.println(directory);
    }

    @Override
    public void dir(String basedir) {
        String fullDir = String.format("%s/%s", basedir, directory);
        System.out.println(fullDir);
    }

    public String getDirectory() {
        return directory;
    }
}
