package internship.eway.final_project.controllers

import internship.eway.final_project.models.DailyDay
import internship.eway.final_project.models.SystemResponse
import internship.eway.final_project.repositories.DailyDayRepository
import internship.eway.final_project.services.DailyDayService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/daily_days")
class DailyDayController {

    @Autowired
    DailyDayRepository repository
    @Autowired
    DailyDayService service

    @PostMapping
    ResponseEntity<SystemResponse> init(
            @RequestBody DailyDay dailyDay) {
        repository.save(dailyDay)
        return new ResponseEntity<SystemResponse>(new SystemResponse(200,"create!","daily day track working was created"), HttpStatus.OK)
    }
    @GetMapping("/{user_id}")
    ResponseEntity<List<DailyDay>> showAllWorkingDay(
            @PathVariable("user_id") String userId,
            @RequestParam("date_from") String dateFrom,
            @RequestParam("date_to") String dateTo) {
        return service.showAllWorkingDay(userId, dateFrom, dateTo)
    }

}
