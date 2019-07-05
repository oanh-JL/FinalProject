package internship.eway.final_project.repositories

import internship.eway.final_project.models.BallotRequest
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface BallotRequestRepository extends MongoRepository<BallotRequest, ObjectId> {
}
