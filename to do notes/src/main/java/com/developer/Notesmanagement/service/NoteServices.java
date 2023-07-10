package com.developer.Notesmanagement.service;
import java.util.List;
import java.util.Optional;

import com.developer.Notesmanagement.entity.NoteEntity;
public interface NoteServices {
    List<NoteEntity> findAllNotes();
    Optional<NoteEntity> findById(Long id);
    NoteEntity saveNote(NoteEntity NoteEntity);
    NoteEntity updateNote(NoteEntity NoteEntity);
    void deleteNote(Long id);
} 
