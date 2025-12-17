@RestController
public class    LocationController{
    @Autowired
    LocationService locationController;
    @PostMapping("/addstudent")
    public LocationService add(@RequestBody )
}