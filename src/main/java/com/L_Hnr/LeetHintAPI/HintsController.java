package com.L_Hnr.LeetHintAPI;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/Hints")
public class HintsController {
    @Autowired
    private HintService hintService;
    @GetMapping
    public ResponseEntity<List<Hint>> getallHints()
    {
        return new ResponseEntity<>(hintService.allHints(), HttpStatus.OK);
    }

    @GetMapping("/{leetcodeId}")
    public ResponseEntity<Optional<Hint>> getHintById(int leetcodeId)
    {
        return new ResponseEntity<>(hintService.singleHint(leetcodeId), HttpStatus.OK );
    }

    @PostMapping
    public void newHint(@RequestBody Hint leetcodehint)
    {
        hintService.createHint(leetcodehint);
    }
}
