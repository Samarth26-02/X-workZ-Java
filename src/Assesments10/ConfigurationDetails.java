package Assesments10;

public class ConfigurationDetails extends Configuration{
    @Override
    public void load() {
        System.out.println("Loading detailed configuration");
    }

    @Override
    public void validate() {
        System.out.println("Validating detailed configuration");
    }

    @Override
    public void apply() {
        System.out.println("Applying detailed configuration");
    }

    @Override
    public void save() {
        System.out.println("Saving detailed configuration");
    }

    @Override
    public void reset() {
        System.out.println("Resetting detailed configuration");
    }
}
