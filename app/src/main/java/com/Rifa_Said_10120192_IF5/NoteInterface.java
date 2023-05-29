package com.Rifa_Said_10120192_IF5;

import android.database.Cursor;

import com.Rifa_Said_10120192_IF5.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

//29 mei 2023 Rifa Said Aqil Hammam 10120192 IF5