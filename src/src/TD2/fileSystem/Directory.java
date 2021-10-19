package TD2.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends ComponentImpl implements Component, Composite<Component> {

    private final List<Component> children;

    protected Directory(String name, Owner owner) {
        super(name, owner);
        this.children = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return this.getContent().size();
    }

    @Override
    public List<String> getContent() {
        List content = new ArrayList<>();
        for (Component i : children
        ) {
            content.add(i.getContent());
        }
        return content;
    }

    @Override
    public void appendContent(List<String> content) {
        for (Component i : children
        ) {
            content.addAll(content);
        }
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public List getChildren() {
        return this.children;
    }


    @Override
    public void addChild(Component component) {
        this.children.add(component);
    }

    @Override
    public boolean removeChild(Component component) {
        return this.children.remove(component);
    }

    @Override
    public boolean removeChildren(List<Component> t) {
        return this.children.removeAll(t);
    }

    @Override
    public String toString() {
        return getContent().toString();
    }
}
