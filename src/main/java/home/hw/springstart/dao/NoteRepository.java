package home.hw.springstart.dao;

import home.hw.springstart.entity.Note;

import java.util.List;

public interface NoteRepository {
    List<Note> listAll();
    Note add(Note note);
    void deleteById(long id);
    void update(Note note);
    Note getById(long id);
}
