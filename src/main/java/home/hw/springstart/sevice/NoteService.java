package home.hw.springstart.sevice;

import home.hw.springstart.dao.NoteRepository;
import home.hw.springstart.entity.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    public List<Note> listAll(){
        return noteRepository.listAll();
    }
    public Note add(Note note){
        return noteRepository.add(note);
    }
    void deleteById(long id){
        noteRepository.deleteById(id);
    }
    void update(Note note){
        noteRepository.update(note);
    }
    Note getById(long id){
        return noteRepository.getById(id);
    }
}
