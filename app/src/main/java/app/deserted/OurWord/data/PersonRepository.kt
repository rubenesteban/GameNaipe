package app.deserted.OurWord.data

import javax.inject.Inject

class PersonRepository @Inject constructor(

    private val personDao: PersonDao
) {
    val readAll = personDao.readAll()
}