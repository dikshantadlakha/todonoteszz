package com.developer.Notesmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.developer.Notesmanagement.entity.NoteEntity;
import com.developer.Notesmanagement.repository.NoteRepository;
import com.developer.Notesmanagement.service.NoteServices;

@Service
public class NoteServiceImpl implements NoteServices{

    private final NoteRepository noteRepository;
    
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public void deleteNote(Long id) {
        // TODO Auto-generated method stub
        noteRepository.deleteById(id);;
    }

    @Override
    public List<NoteEntity> findAllNotes() {
        // TODO Auto-generated method stub
        return noteRepository.findAll();
    }

    @Override
    public Optional<NoteEntity> findById(Long id) {
        // TODO Auto-generated method stub
        return noteRepository.findById(id);
        
    }

    @Override
    public NoteEntity saveNote(NoteEntity noteEntity) {
        // TODO Auto-generated method stub
        return noteRepository.save(noteEntity);
    }

    @Override
    public NoteEntity updateNote(NoteEntity noteEntity) {
        // TODO Auto-generated method stub
        return noteRepository.save(noteEntity);
    }
    
}
