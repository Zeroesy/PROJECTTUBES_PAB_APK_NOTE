package com.example.aplikasinote

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp

@Entity(tableName = "notestable")
class Note (
    @ColumnInfo(name = "tittle")val noteTitle:String,
    @ColumnInfo(name = "description")val noteDescription:String,
    @ColumnInfo(name = "timestamp")val timestamp: String)
    {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}