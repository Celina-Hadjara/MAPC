package TD2.fileSystem;


import java.util.List;

public final class File extends ComponentImpl implements Component {

    protected List<String> content;

    protected File(String name, Owner owner) {
        super(name, owner);
    }


    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public List<String> getContent() {
        return this.content;
    }

    @Override
    public void appendContent(List<String> content) {
        this.content.addAll(content);
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public String toString() {
        return "File{" +
                "content=" + content +
                '}';
    }
}
