package Assesments10;

public class ConfigurationRunner {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.load();
        configuration.validate();
        configuration.apply();
        configuration.save();
        configuration.reset();

        System.out.println("----------------------");

        Configuration configuration1 = new ConfigurationDetails();
        configuration1.reset();
        configuration1.save();
        configuration1.apply();
        configuration1.validate();
        configuration1.load();

        System.out.println("----------------------");

        ConfigurationDetails configurationDetails = new ConfigurationDetails();
        configurationDetails.load();
        configurationDetails.reset();
        configurationDetails.save();
        configurationDetails.apply();
        configurationDetails.validate();
    }
}
