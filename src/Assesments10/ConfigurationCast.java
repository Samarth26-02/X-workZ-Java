package Assesments10;

public class ConfigurationCast {
    public void castConfig(Configuration configuration) {
        configuration.load();
        configuration.validate();
        configuration.apply();
        configuration.save();
        configuration.reset();

        if (configuration instanceof ConfigurationDetails) {
            System.out.println("Casting to ConfigurationDetails...");
            ConfigurationDetails details = (ConfigurationDetails) configuration;
            details.showConfigMetadata();
        }
    }
}
