package internship.eway.final_project.services.validator

import internship.eway.final_project.models.User
import internship.eway.final_project.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserValidator {
    @Autowired
    UserRepository repository

    void init(User user) {
        List<User> users = repository.findAll()
        if (!(user.userId || user.leaderId || user.password || user.email || user.role)) {
            throw new Exception("some fields were required")
        } else {
            users.forEach({
                userExist ->
                    if (userExist.email == user.email) {
                        throw new Exception("email was registered")
                    }
                    if (user.userId == userExist.userId) {
                        throw new Exception("this account was exist")
                    }
            })
        }
    }
}
