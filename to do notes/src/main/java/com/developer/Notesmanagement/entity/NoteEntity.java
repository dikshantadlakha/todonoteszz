package com.developer.Notesmanagement.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="note_table")
public class NoteEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="note_id")
    private Long id;

    @Column(name="name")
    private String name;

   

 

    @Column(name="note")
    private String note;
    public NoteEntity() {
    }
    public NoteEntity(Long id, String name,String note) {
        this.id = id;
        this.name = name;
      
        
        this.note = note;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    
    
    public String getnote() {
        return note;
    }
    public void setnote(String note) {
        this.note = note;
    }
    

}
