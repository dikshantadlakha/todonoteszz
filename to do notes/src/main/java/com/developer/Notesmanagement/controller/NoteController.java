package com.developer.Notesmanagement.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.Notesmanagement.entity.NoteEntity;
import com.developer.Notesmanagement.service.NoteServices;
import com.developer.Notesmanagement.service.impl.NoteServices;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteServices noteServices;
    

    public NoteController(NoteServices noteServices) {
        this.noteServices = noteServices;
    }
    @GetMapping
    public List<NoteEntity> findAllNotes(){
        return noteServices.findAllNotes();
    }
    @GetMapping("/{id}")
public Optional<NoteEntity> findNoteById(@PathVariable("id") Long id){
return noteServices.findById(id);
}
@PostMapping
public NoteEntity saveNote(@RequestBody NoteEntity noteEntity){
    return noteServices.saveNote(noteEntity);
}
@PutMapping
public NoteEntity updateNote(@RequestBody NoteEntity noteEntity){
    return noteServices.updateNote(noteEntity);

}
@DeleteMapping("/{id}")
public void deleteNote(@PathVariable("id") Long id){
noteServices.deleteNote(id);
}

}
