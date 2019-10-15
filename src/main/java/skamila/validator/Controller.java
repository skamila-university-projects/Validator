package skamila.validator;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value ="/validate", method = RequestMethod.GET)
    public ResponseEntity rev(@RequestParam String s) {

        return new ResponseEntity(s, new HttpHeaders(), HttpStatus.OK);
    }
}
