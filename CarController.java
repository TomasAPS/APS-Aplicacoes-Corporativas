@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/list")
    public List<Car> listCars() {
        return carService.listAllCars();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addCar(@RequestBody Car car) {
        carService.addCar(car);
        return ResponseEntity.ok("Car added successfully!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return ResponseEntity.ok("Car deleted successfully!");
    }
}
