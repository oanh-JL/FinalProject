package internship.eway.final_project.models

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

import java.time.LocalDate

@Document(collection = "ballot_requests")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
class BallotRequest {
    @Id
    ObjectId _id

    String userId
    LocalDate createAt
    LocalDate dateFrom
    LocalDate dateTo
    int typeDayOff
    String reason
    boolean  status = false
}
