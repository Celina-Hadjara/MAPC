package TD2;


import java.util.List;

public class File extends ComponentImp implements Component {

    private final List<String> content;

    protected File(List<String> content) {
        this.content = content;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public List<String> getContent() {
        return null;
    }

    @Override
    public void setContent(List<String> content) {

    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public boolean isFile() {
        return false;
    }

    @Override
    public Composite<Component> asComposite() {
        return null;
    }
}
