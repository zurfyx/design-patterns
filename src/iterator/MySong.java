package iterator;

/**
 * Created by zero on 28/05/16.
 */
public class MySong implements Song {
    private final String content;

    public MySong(String content) {
        this.content = content;
    }

    @Override
    public void play() {
        System.out.println(content);
    }

    public String getContent() {
        return content;
    }
}
