import com.zoominfo.drive.FileServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder
                .forPort(9090)
                .addService(new FileServiceImpl())
                .build();

        server.start();
        server.awaitTermination();
    }
}
