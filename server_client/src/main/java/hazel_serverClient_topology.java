import com.hazelcast.config.ClasspathXmlConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;
import java.util.Queue;

/**
 * Created by nixon on 5/10/2017.
 */
public class hazel_serverClient_topology {
    public static void main(String[] args) {
        System.out.println("starting with server-client topology");
        Config config = new ClasspathXmlConfig("hazelcast.xml");
        HazelcastInstance hz = Hazelcast.newHazelcastInstance(config);
        System.out.println(hz.getName());

        Map<Integer, String> mapCustomers = hz.getMap("customers");
        mapCustomers.put(1, "Joe");
        mapCustomers.put(2, "Ali");
        mapCustomers.put(3, "Avi");

        System.out.println("Customer with key 1: "+ mapCustomers.get(1));
        System.out.println("Map Size:" + mapCustomers.size());

        Queue<String> queueCustomers = hz.getQueue("customers");
        queueCustomers.offer("Tom");
        queueCustomers.offer("Mary");
        queueCustomers.offer("Jane");
        System.out.println("First customer: " + queueCustomers.poll());
        System.out.println("Second customer: "+ queueCustomers.peek());
        System.out.println("Queue size: " + queueCustomers.size());
    }
}
