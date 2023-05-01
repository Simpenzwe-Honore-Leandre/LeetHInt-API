package com.L_Hnr.LeetHintAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin
@RequestMapping("/api/v1/Hints")
public class HintsController {
    @Autowired
    private HintService hintService;
    //grab all data
    @GetMapping
    public ResponseEntity<List<Hint>> getallHints()
    {
        return new ResponseEntity<>(hintService.allHints(), HttpStatus.OK);
    }

    //grab by id data
    @GetMapping("/{leetcodeId}")
    public ResponseEntity<Optional<Hint>> getHintById(@PathVariable Integer leetcodeId)
    {
            return new ResponseEntity<>(hintService.singleHint(leetcodeId), HttpStatus.OK );
    }
    //
    @PostMapping
    public ResponseEntity<Hint> newHint(@RequestBody Hint leetcodehint) {
        Hint createdHint = hintService.createHint(leetcodehint);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHint);
    }
    @DeleteMapping("/delete/{leetcodeId}")
    public void DeleteById (@PathVariable Integer leetcodeId)
    {
        try {
            if(leetcodeId == null) throw new DeleteException();
            hintService.deleteHint(leetcodeId);
        }
        catch (DeleteException de){
            System.out.println(de.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
