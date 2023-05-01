package com.L_Hnr.LeetHintAPI;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HintService {
    @Autowired
    private IHintRepository hintRepository;
    public List<Hint> allHints()
    {
        return hintRepository.findAll();
    }
    public Optional<Hint> singleHint(Integer id)
    {
        return hintRepository.findById(id);
    }

    public void createHint(Hint hint)
    {
        hintRepository.save(hint);
    }


}
