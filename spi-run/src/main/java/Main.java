import com.cj.interfac.IInterface;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) throws IOException {

        final ServiceLoader<IInterface> load = ServiceLoader.load(IInterface.class);
        for (IInterface iInterface : load) {
            iInterface.hello();
        }

        final Enumeration<URL> systemResources = ClassLoader.getSystemResources("META-INF/services/com.cj.interfac.IInterface");
        while(systemResources.hasMoreElements()){
            System.out.println(systemResources.nextElement());
        }
    }
}
