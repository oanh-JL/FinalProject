package internship.eway.final_project.services

import internship.eway.final_project.models.DailyDay
import internship.eway.final_project.models.SystemResponse
import internship.eway.final_project.models.User
import org.springframework.http.ResponseEntity

interface UserService {
    ResponseEntity<SystemResponse> init(User user)
}
