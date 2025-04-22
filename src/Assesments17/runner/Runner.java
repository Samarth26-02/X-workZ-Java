package Assesments17.runner;

import Assesments17.implement.*;
import Assesments17.interfacecs.*;
import Assesments17.useclasses.*;

public class Runner {
    public static void main(String[] args) {
        //1
        IndianCricketTeamIccImpl indianCricketTeamIccImpl =new IndianCricketTeamIccImpl();

        BCCI bcci=new BCCI(indianCricketTeamIccImpl);
        bcci.execute();

        //2
        CitizenConstitutionImpl citizenConstitutionImpl=new CitizenConstitutionImpl();

        Government government=new Government(citizenConstitutionImpl);
        government.execute();
        //3
        Laptop laptop=new LaptopImpl();

        OperatingSystem operatingSystem=new OperatingSystem(laptop);
        operatingSystem.execute();
        //4
        Engine engine=new EngineImpl();

        Vehicle vehicle=new Vehicle(engine);
        vehicle.execute();
        //5
        Student student=new StudentImpl();

        School school=new School(student);
        student.study();
        //6
        Employee employee=new EmployeeImpl();

        Company company=new Company(employee);
        company.execute();
        //7
        Book book=new BookImpl();

        Library library=new Library(book);
        library.execute();
        //8
        Appliance appliance=new ApplianceImpl();

        Kitchen kitchen=new Kitchen(appliance);
        kitchen.execute();
        //9
        Professor professor=new ProfessorImpl();

        University university=new University(professor);
        university.execute();
        //10
        Doctor doctor=new DoctorImpl();

        Hospital hospital=new Hospital(doctor);
        hospital.execute();
        //11
        Player player=new PlayerImpl();

        Stadium stadium=new Stadium(player);
        stadium.execute();
        //12
        Policy policy=new PolicyImpl();

        Government2 government2=new Government2(policy);
        government2.execute();
        //13
        Satellite satellite=new SatelliteImpl();

        Planet planet=new Planet(satellite);
        planet.execute();
        //14
        Animal animal=new AnimalImpl();

        Farm farm=new Farm(animal);
        farm.execute();
        //15
        Chef chef=new ChefImpl();

        Restaurant restaurant=new Restaurant(chef);
        restaurant.execute();
        //16
        Performer performer=new PerformerImpl();

        Theater theater=new Theater(performer);
        theater.execute();
        //17
        Tree tree=new TreeImpl();

        Forest forest=new Forest(tree);
        forest.execute();
        //18
        Exhibit exhibit=new ExihibitImpl();

        Museum museum=new Museum(exhibit);
        museum.execute();
        //19
        Fish fish=new FishImpl();

        Ocean ocean=new Ocean(fish);
        ocean.execute();
        //20
        Machine machine=new MachineImpl();

        Factory factory=new Factory(machine);
        factory.execute();
        //21
        Aircraft aircraft=new AircraftImpl();

        Airport airport=new Airport(aircraft);
        airport.execute();
        //22
        Account account=new AccountImpl();

        Bank bank=new Bank(account);
        bank.execute();
        //23
        Instrument instrument=new InstrumentImpl();

        Music music=new Music(instrument);
        music.execute();
        //24
        Tool tool=new ToolImpl();

        Workshop workshop=new Workshop(tool);
        workshop.execute();
        //25
        Artist artist=new ArtistImpl();

        Studio studio=new Studio(artist);
        studio.execute();
        //26
        Mechanic mechanic=new MechanicImpl();

        Garage garage=new Garage(mechanic);
        garage.execute();
        //27
        Climber climber=new ClimberImpl();

        Mountain mountain=new Mountain(climber);
        mountain.execute();
        //28
        Lawyer lawyer=new LawyerImpl();

        Court court=new Court(lawyer);
        court.execute();
        //29
        VehicleType vehicleType=new VehicleTypeImpl();

        Road road=new Road(vehicleType);
        road.execute();
        //30
        Pet pet=new PetImpl();

        Farmhouse farmhouse=new Farmhouse(pet);
        farmhouse.execute();
        //31
        Peripheral peripheral=new PeripheralImpl();

        Computer computer=new Computer(peripheral);
        computer.execute();
        //32
        Film film=new FilmImpl();

        Cinema cinema=new Cinema(film);
        cinema.execute();
        //33
        WildAnimal wildAnimal=new WildAnimalImpl();

        Zoo zoo=new Zoo(wildAnimal);
        zoo.execute();
        //34
        Flower flower=new FlowerImpl();

        Garden garden=new Garden(flower);
        garden.execute();
        //35
        Product product=new ProductImpl();

        Shop shop=new Shop(product);
        shop.execute();
        //36
    }
}
