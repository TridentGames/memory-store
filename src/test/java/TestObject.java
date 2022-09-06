import java.util.Set;

public class TestObject {
    private String name;
    private int value;
    private int chunk;
    private Set<String> tags;

    public TestObject(final String name, final int value, final int chunk, Set<String> tags) {
        this.name = name;
        this.value = value;
        this.chunk = chunk;
        this.tags = tags;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }

    public int getChunk() {
        return this.chunk;
    }

    public Set<String> getTags() {
        return this.tags;
    }
}
