package internship.eway.final_project.controllers

import internship.eway.final_project.models.BallotRequest
import internship.eway.final_project.models.SystemResponse
import internship.eway.final_project.services.BallotRequestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ballot_request")
class BallotRequestController {

    @Autowired
    BallotRequestService service

    @PostMapping
    ResponseEntity<SystemResponse> init (
            @RequestBody BallotRequest ballotRequest) {
            return  service.create(ballotRequest) }
}
