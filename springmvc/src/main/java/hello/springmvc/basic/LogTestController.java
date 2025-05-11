package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

  @RequestMapping("/log-test")
  public String logTest() {
    String name = Thread.currentThread().getName();

    log.trace("trace log={}", name);
    log.info("info log={}", name);

    return "ok";
  }
}
