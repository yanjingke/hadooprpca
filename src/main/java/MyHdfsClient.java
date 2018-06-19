import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MyHdfsClient {
    public static void main(String[] args) throws IOException {
        ClientNamenodeProtocol namenode = RPC.getProxy(ClientNamenodeProtocol.class, 1L, new InetSocketAddress("localhost", 8888), new Configuration());
        String meteData= namenode.getMetaData("adadasad");
        System.out.println(meteData);
    }
}
