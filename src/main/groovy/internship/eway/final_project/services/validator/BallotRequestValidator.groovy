package internship.eway.final_project.services.validator

import internship.eway.final_project.models.BallotRequest
import org.springframework.stereotype.Component

@Component
class BallotRequestValidator {
    void init(BallotRequest ballotRequest) {
        if(!(ballotRequest.userId || ballotRequest.typeDayOff)) {
            throw new Exception("userId and typeDayOff were required!")
        }
    }
}
