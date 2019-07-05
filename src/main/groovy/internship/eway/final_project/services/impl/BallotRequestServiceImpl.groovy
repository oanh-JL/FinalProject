package internship.eway.final_project.services.impl

import internship.eway.final_project.models.BallotRequest
import internship.eway.final_project.models.SystemResponse
import internship.eway.final_project.repositories.BallotRequestRepository
import internship.eway.final_project.services.BallotRequestService
import internship.eway.final_project.services.validator.BallotRequestValidator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.RequestEntity
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

import java.time.LocalDate

@Service
class BallotRequestServiceImpl implements BallotRequestService {

    @Autowired
    BallotRequestValidator validator
    @Autowired
    BallotRequestRepository repository

    @Override
    ResponseEntity<SystemResponse> create(BallotRequest ballotRequest) {
        validator.init(ballotRequest)
        ballotRequest.with {
            setCreateAt(LocalDate.now())
        }
        repository.save(ballotRequest)
        return new ResponseEntity<SystemResponse>(new SystemResponse(200, "create!", "your ballot 's standing by acceptation's leader"), HttpStatus.OK)
    }
}
