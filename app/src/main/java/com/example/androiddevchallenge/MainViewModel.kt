package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.DogBean

class MainViewModel : ViewModel() {
    val dogs by mutableStateOf(
        listOf(
            DogBean(
                "XiaoA", "Chihuahua Mix", "ShangHai",
                "Young", "Male", "Large", R.drawable.pyppy1
            ),
            DogBean(
                "SaSa", "Chihuahua Mix", "ShangHai",
                "Adult", "Male", "Medium", R.drawable.pyppy2
            ),
            DogBean(
                "Ming", "Chihuahua Mix", "ShangHai",
                "Adult", "Female", "Large", R.drawable.pyppy3
            ),
            DogBean(
                "Angel", "Chihuahua Mix", "ShangHai",
                "Young", "Female", "Small", R.drawable.pyppy4
            ),
            DogBean(
                "NaoNao", "Mountain DogBean & Shepherd Mix", "GuangZhou",
                "Puppy", "Male", "Medium", R.drawable.pyppy5
            ),
            DogBean(
                "TiaoTiao", "Mountain DogBean & Shepherd Mix", "GuangZhou",
                "Puppy", "Male", "Medium", R.drawable.pyppy6
            ),
            DogBean(
                "AaNi", "Border Collie & German Shepherd DogBean Mix", "GuangZhou",
                "Young", "Male", "Medium", R.drawable.pyppy7
            ),
            DogBean(
                "Lisa", "Chihuahua & Rat Terrier Mix", "GuangZhou",
                "Young", "Female", "Medium", R.drawable.pyppy8
            ),
            DogBean(
                "KiKi", "Chihuahua & Terrier Mix", "GuangZhou",
                "Young", "Female", "Medium", R.drawable.pyppy9
            ),
            DogBean(
                "Aler", "Pit Bull Terrier Mix", "GuangZhou",
                "Adult", "Female", "Large", R.drawable.pyppy10
            ),
            DogBean(
                "Bluae", "Pit Bull Terrier", "GuangZhou",
                "Young", "Female", "Medium", R.drawable.pyppy11
            ),
            DogBean(
                "Sbl", "Pit Bull Terrier", "GuangZhou",
                "Young", "Female", "Medium", R.drawable.pyppy12
            ),
            DogBean(
                "TiTi", "Pit Bull Terrier", "GuangZhou",
                "Young", "Female", "Medium", R.drawable.pyppy13
            ),
            DogBean(
                "LuLu", "Pit Bull Terrier", "GuangZhou",
                "Young", "Female", "Medium", R.drawable.pyppy14
            ),
            DogBean(
                "LuLu", "Pit Bull Terrier", "GuangZhou",
                "Young", "Female", "Medium", R.drawable.pyppy15
            ),
        )
    )

    var currentDog: DogBean? by mutableStateOf(null)

    fun showDog(dog: DogBean) {
        currentDog = dog
    }

    fun closeDog() {
        currentDog = null
    }
}