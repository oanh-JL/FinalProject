package internship.eway.final_project.controllers

import internship.eway.final_project.models.DailyDay
import internship.eway.final_project.models.SystemResponse
import internship.eway.final_project.models.User
import internship.eway.final_project.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {
    @Autowired
    UserService service

    @PostMapping
    ResponseEntity<SystemResponse> init(
            @RequestBody User user) {
        service.init(user)
    }
}
