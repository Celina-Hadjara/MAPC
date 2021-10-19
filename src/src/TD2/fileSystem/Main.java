package TD2.fileSystem;

import java.util.Collections;

public class Main {
    public static class main {
        public static void main(String[] args) {
            FSFactory fsFactory = FSFactory.getInstance();
            Owner owner1 = new Owner("Sarah");
            Component f1 = fsFactory.createComponent(ComponentType.FILE, "Fichier 1", owner1);
            Component r1 = fsFactory.createComponent(ComponentType.DIRECTORY, "Repertoire 1", owner1);
            //(Composite<Component>)r1.addChild(f1);
            f1.appendContent(Collections.singletonList("Hello World\n"));
            f1.appendContent(Collections.singletonList("How are you doing?"));
            System.out.println(r1);
            System.out.println(f1);
        }
    }
}
