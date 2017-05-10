import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.MultiMap;

/**
 * Created by nixon on 5/10/2017.
 */
public class HazelcastTest {
    public static void main(String[] args) {
        System.out.println("Testing hazelcast multicast config");
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        MultiMap<String, String> customers = hz.getMultiMap("customers");
        customers.put("1", "Nixon");
        customers.put("1", "407-14, camille circle, sanjose");
        customers.put("1", "Cisco");

        customers.put("2", "sudhir");

        MultiMap<String, String> cust = hz.getMultiMap("customers");
        System.out.println("print the multimap value");
        System.out.println(cust.get("1"));
    }

}