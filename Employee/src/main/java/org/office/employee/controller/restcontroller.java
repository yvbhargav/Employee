
@RestController
@RequestMapping("/employee")
class restcontroller{

    @GetMapping("/details/seshadri/getmapping")
    String getEmployeeDetails(){
        return "Employee Details";
    }

    @PostMapping("/add")
    String addEmployee(@RequestBody String employeeData){
        return "Employee Added: " + employeeData;
}