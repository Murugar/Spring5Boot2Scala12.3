package com.iqmsoft.controllers

import java.util.UUID
import com.iqmsoft.module.Greeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMethod.GET

@RestController
class MainController {
  private val id = UUID.randomUUID().toString

  @RequestMapping(method = Array(GET), value = Array("/greeting"))
  def greeting(@RequestParam(value = "content", required = false, defaultValue = "Spring Boot Scala") content: String): Greeting =
    Greeting(id, s"Content is $content")
}
