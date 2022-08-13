package net.afyer.afybroker.server;

import com.alipay.remoting.rpc.RpcServer;
import net.afyer.afybroker.server.plugin.PluginManager;
import net.afyer.afybroker.server.proxy.BrokerClientProxyManager;
import net.afyer.afybroker.server.proxy.BrokerPlayerManager;
import net.afyer.afybroker.server.scheduler.BrokerScheduler;

import java.io.File;
import java.util.concurrent.Executor;

/**
 * @author Nipuru
 * @since 2022/8/13 9:34
 */
public class Broker {

    private static BrokerServer server;

    private Broker() {}

    public static BrokerServer getServer() {
        return server;
    }

    public static void setServer(BrokerServer brokerServer) {
        if (Broker.server != null) {
            throw new UnsupportedOperationException("Cannot redefine singleton Server");
        }
        Broker.server = brokerServer;
    }

    public static RpcServer getRpcServer() {
        return server.getRpcServer();
    }

    public static int getPort() {
        return server.getPort();
    }

    public static Executor getBizThread() {
        return server.getBizThread();
    }

    public static PluginManager getPluginManager() {
        return server.getPluginManager();
    }

    public static BrokerScheduler getScheduler() {
        return server.getScheduler();
    }

    public static BrokerClientProxyManager getBrokerClientProxyManager() {
        return server.getBrokerClientProxyManager();
    }

    public static BrokerPlayerManager getBrokerPlayerManager() {
        return server.getBrokerPlayerManager();
    }

    public static File getPluginsFolder() {
        return server.getPluginsFolder();
    }
}
