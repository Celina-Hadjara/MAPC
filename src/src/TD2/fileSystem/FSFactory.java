package TD2.fileSystem;

public final class FSFactory {
    private static final FSFactory INSTANCE = new FSFactory();

    public FSFactory() {
    }

    public static FSFactory getInstance() {
        return INSTANCE;
    }

    Component createComponent(ComponentType type, String name, Owner owner) {
        if (type == ComponentType.DIRECTORY) return new Directory(name, owner);
        return new File(name, owner);
    }
}
