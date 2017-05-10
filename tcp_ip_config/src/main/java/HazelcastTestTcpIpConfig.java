import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

/**
 * Created by nixon on 5/10/2017.
 */
public class HazelcastTestTcpIpConfig {
    public static void main(String[] args) {
        System.out.println("starting the hazelcast");
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
    }
}
