
import java.util.logging.Logger;

import main.config.ConfigFileReader;

public class LoadConfigPropApplication {
    static ConfigFileReader configFileReader;
    static Logger logger = Logger.getLogger(LoadConfigPropApplication.class.getName());

    public static void main(String[] args) {
        configFileReader = new ConfigFileReader();
        
        System.out.println(configFileReader.wsServiceEmployee());
        System.out.println(configFileReader.wsServiceOrganization());
        System.out.println(configFileReader.wsServiceToken());
        System.out.println(configFileReader.securityCode());
    }
}
