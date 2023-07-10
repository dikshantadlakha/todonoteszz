package com.developer.Notesmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import com.developer.Notesmanagement.entity.NoteEntity;

public interface NoteServices {

    List<NoteEntity> findAllNotes();

    Optional<NoteEntity> findById(Long id);

    NoteEntity saveNote(NoteEntity noteEntity);

    void deleteNote(Long id);

    NoteEntity updateNote(NoteEntity noteEntity);

}
