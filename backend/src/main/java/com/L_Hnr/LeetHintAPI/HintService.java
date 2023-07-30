package com.L_Hnr.LeetHintAPI;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Hint createHint(Hint hint)
    {
        return hintRepository.save(hint);
    }
    public void deleteHint(Integer id)
    {
        hintRepository.deleteById(id);
    }

}
