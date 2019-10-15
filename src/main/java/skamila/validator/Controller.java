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

    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public ResponseEntity rev(@RequestParam String s) {

        int upperLetterCounter = 0;
        int loweLetterCounter = 0;
        int digitCounter = 0;
        int specialCharactersCounter = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                upperLetterCounter++;
            } else if (Character.isLowerCase(c)) {
                loweLetterCounter++;
            } else if (Character.isDigit(c)) {
                digitCounter++;
            } else {
                specialCharactersCounter++;
            }

        }

        String result = "Przekazany ciąg " + s + " zawiera: " +
                upperLetterCounter + " wielkich liter " +
                loweLetterCounter + " małych liter " +
                digitCounter + " cyfr i " +
                specialCharactersCounter + " znaków specjalnych.";

        return new ResponseEntity(result, new HttpHeaders(), HttpStatus.OK);
    }
}
