package internship.eway.final_project.repositories

import internship.eway.final_project.models.User
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository extends MongoRepository<User, ObjectId> {
}
