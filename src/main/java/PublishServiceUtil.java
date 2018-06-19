import com.itcast.login.service.UserLoginService;
import com.itcast.login.service.UserLoginServiceImpl;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

public class PublishServiceUtil {
    public static void main(String[] args) throws Exception {
        RPC.Builder builder = new RPC.Builder(new Configuration());
        builder.setBindAddress("localhost")
                .setPort(8888)
                .setProtocol(ClientNamenodeProtocol.class)
                .setInstance(new Mynamenode());
        RPC.Server server = builder.build();
        server.start();
        //DSAAAAAAAAAAAAAAAAAAAAAAAAAAAA
        RPC.Builder builder2= new RPC.Builder(new Configuration());
        builder2.setBindAddress("localhost")
                .setPort(9999)
                .setProtocol(UserLoginService.class)
                .setInstance(new UserLoginServiceImpl());
        RPC.Server server2 = builder2.build();
        server2.start();
    }
}
