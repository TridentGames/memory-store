import com.oop.memorystore.implementation.index.IndexDefinition;
import com.oop.memorystore.implementation.memory.MemoryStore;
import com.oop.memorystore.implementation.query.Query;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        final MemoryStore<TestObject> objects = new MemoryStore<>();
        objects.index("name", IndexDefinition.withKeyMapping(TestObject::getName));
        objects.index("tags", IndexDefinition.withKeyMapping(TestObject::getTags));

        objects.add(new TestObject("Test 1", 10, 10, Set.of("Testing1", "Testing2")));
        objects.add(new TestObject("Test 2", 20, 20, Set.of("Testing4", "Testing2")));

        for (final TestObject testObject : objects.get(Query.contains("tags", "Testing1"))) {
            System.out.println(testObject.getName());
        }
    }
}
