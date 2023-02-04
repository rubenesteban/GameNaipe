package app.deserted.OurWord.ui

import androidx.lifecycle.ViewModel
import app.deserted.OurWord.data.PersonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject



@HiltViewModel
class MainViewModel  @Inject constructor(
    personRepository: PersonRepository
): ViewModel() {

    val readAll = personRepository.readAll

}

