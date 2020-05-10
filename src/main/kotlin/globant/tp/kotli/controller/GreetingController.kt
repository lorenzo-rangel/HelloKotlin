package globant.tp.kotli.controller

import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam


@RestController
class GreetingController {
	
	val counter = AtomicLong()
	
	@GetMapping("/hello")
	fun greeting(@RequestParam(value = "name") name : String) =
		GreetingDTO(counter.incrementAndGet(), "Hello, $name")
	
	data class GreetingDTO(val id: Long, val content : String)
}