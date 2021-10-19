package TD2;

import java.util.List;

public interface Component {

    String getName();

    long getSize();

    List<String> getContent();

    void setContent(List<String> content);

    boolean isDirectory();

    boolean isFile();

    Composite<Component> asComposite();
}
