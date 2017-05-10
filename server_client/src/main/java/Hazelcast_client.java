import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

/**
 * Created by nixon on 5/10/2017.
 */
public class Hazelcast_client {
    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.getGroupConfig().setName("hazelcast_serverclient_topology");
        clientConfig.getGroupConfig().setPassword("dev-pass");
        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        IMap map = client.getMap( "customers" );
        System.out.println( "Map Size:" + map.size() );
        System.out.println("customers: "+ map.values());
    }
}