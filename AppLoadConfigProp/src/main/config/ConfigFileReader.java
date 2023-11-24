package main.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class ConfigFileReader {
    private static Logger logger = Logger.getLogger(ConfigFileReader.class.getName());
    private Properties properties;
    private static String configFilePath = "./conf/config.properties";

    public ConfigFileReader() {
        File configFile = new File(configFilePath);
        properties = new Properties();

        try (FileInputStream configFileReader = new FileInputStream(configFile)){
            properties.load(configFileReader);
            logger.info("Config properties loaded.");
        } catch(IOException ex){
            throw new RuntimeException(ex.getMessage(),ex);
        } 
    }

    public String wsServiceEmployee() {
        String employeeUrl = properties.getProperty("ws_url_service_employee");
        
        if(employeeUrl != null)
            return employeeUrl;
        else
            return errorException("ws_url_service_employee");
    }

    public String wsServiceOrganization() {
        String orgUrl = properties.getProperty("ws_url_service_organization");
        
        if(orgUrl != null)
            return orgUrl;
        else
            return errorException("ws_url_service_organization");
    }

    public String wsServiceToken() {
        String tokenUrl = properties.getProperty("ws_url_service_token");
        
        if(tokenUrl != null)
            return tokenUrl;
        else
            return errorException("ws_url_service_token");
    }

    public String securityCode() {
        String code = properties.getProperty("security_code");
        
        if(code != null)
            return code;
        else
            return errorException("security_code");
    }

    private String errorException(String key){
        throw new RuntimeException(key +" not specified in the config.properties file.");
    }

}
