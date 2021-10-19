package TD2.fileSystem;

import java.util.List;

public interface Component {

    String getName();

    Owner getOwner();

    void setOwner(Owner owner, boolean recursive);

    int getSize();

    List<String> getContent();

    void appendContent(List<String> content);

    boolean isComposite();

}
