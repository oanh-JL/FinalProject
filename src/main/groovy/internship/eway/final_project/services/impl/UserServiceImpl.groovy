package internship.eway.final_project.services.impl

import internship.eway.final_project.models.DailyDay
import internship.eway.final_project.models.SystemResponse
import internship.eway.final_project.models.User
import internship.eway.final_project.repositories.UserRepository
import internship.eway.final_project.services.UserService
import internship.eway.final_project.services.validator.UserValidator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.aggregation.Aggregation
import org.springframework.data.mongodb.core.aggregation.LookupOperation
import org.springframework.data.mongodb.core.aggregation.MatchOperation
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

import java.time.LocalDate

@Service
class UserServiceImpl implements UserService {
    @Autowired
    MongoTemplate template
    @Autowired
    UserValidator validator
    @Autowired
    UserRepository repository



    @Override
    ResponseEntity<SystemResponse> init(User user) {
        validator.init(user)
        repository.save(user)
        return  new ResponseEntity<SystemResponse>(new SystemResponse(200,"init","create new user was successful"), HttpStatus.OK)
    }
}
