package app.deserted.OurWord.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Person(
   @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name:String
)