package internship.eway.final_project.services

import internship.eway.final_project.models.BallotRequest
import internship.eway.final_project.models.SystemResponse
import org.springframework.http.ResponseEntity

interface BallotRequestService {
    ResponseEntity<SystemResponse> create(BallotRequest ballotRequest)
}
