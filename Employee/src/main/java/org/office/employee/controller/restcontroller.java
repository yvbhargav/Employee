
@RestController
@RequestMapping("/employee")
class restcontroller{

    @GetMapping("/details")
    String getEmployeeDetails(){
        return "Employee Details";
    }
}