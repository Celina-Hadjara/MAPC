package TD2.fileSystem;

import java.util.List;

public interface Composite<T> extends Component {
    List<T> getChildren();

    void addChild(T t);

    boolean removeChild(T t);

    boolean removeChildren(List<T> t);
}
