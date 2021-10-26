package TD2.fileSystem;

import java.util.Objects;

public abstract class ComponentImpl implements Component {
    protected final String name;

    protected ComponentImpl(String name, Owner owner) {
        this.name = name;
        this.setOwner(owner, false);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Owner getOwner() {
        return this.getOwner();
    }

    @Override
    public void setOwner(Owner owner, boolean recursive) throws NullPointerException {
        this.setOwner(owner, recursive);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComponentImpl)) return false;
        ComponentImpl component = (ComponentImpl) o;
        return getName().equals(component.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
