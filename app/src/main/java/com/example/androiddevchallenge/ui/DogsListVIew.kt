package com.example.androiddevchallenge.ui
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.DogBean
import com.example.androiddevchallenge.ui.theme.MyTheme
@Composable
fun DogList(dogs: List<DogBean>, onDogClick: (DogBean) -> Unit = {}) {
    LazyColumn(
        Modifier.background(MaterialTheme.colors.secondary),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dogs) { dog ->
            DogItem(
                dog,
                Modifier.clickable {
                    onDogClick(dog)
                }.fillMaxWidth()
            )
        }
    }
}

@Composable
fun DogItem(dog: DogBean, modifier: Modifier = Modifier) {
    Card(modifier) {
        Row {
            Image(
                painterResource(dog.picture),
                "Picture of dog: ${dog.name}",
                Modifier.size(120.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(8.dp)) {
                Text(dog.name, style = MaterialTheme.typography.h4)
                Text(dog.breed)
                Text(dog.location)
            }
        }
    }
}

@Preview
@Composable
fun DogListPreview() {
    val dogs = listOf(
        DogBean(
            "NaoNao", "Pit Bull Terrier Mix", "Sunnyvale, CA",
            "Adult", "Female", "Large", R.drawable.pyppy1
        ),
        DogBean(
            "xiaoA", "Terrier Mix", "Sunnyvale, CA",
            "Young", "Female", "Medium", R.drawable.pyppy2
        ),
        DogBean(
            "Blue", "American Staffordshire Terrier Mix", "Sunnyvale, CA",
            "Adult", "Male", "Large", R.drawable.pyppy3
        )
    )
    MyTheme {
        DogList(dogs)
    }
}

@Preview
@Composable
fun DogListPreviewDark() {
    val dogs = listOf(
        DogBean(
            "Nala", "Pit Bull Terrier Mix", "Sunnyvale, CA",
            "Adult", "Female", "Large", R.drawable.pyppy1
        ),
        DogBean(
            "Lulu", "Terrier Mix", "Sunnyvale, CA",
            "Young", "Female", "Medium", R.drawable.pyppy2
        ),
        DogBean(
            "Billy", "American Staffordshire Terrier Mix", "Sunnyvale, CA",
            "Adult", "Male", "Large", R.drawable.pyppy3
        )
    )
    MyTheme(darkTheme = true) {
        DogList(dogs)
    }
}

@Preview
@Composable
fun DogItemPreview() {
    MyTheme {
        DogItem(
            DogBean(
                "Nala", "Pit Bull Terrier Mix", "Sunnyvale, CA",
                "Adult", "Female", "Large", R.drawable.pyppy1
            )
        )
    }
}

@Preview
@Composable
fun DogItemPreviewDark() {
    MyTheme(darkTheme = true) {
        DogItem(
            DogBean(
                "Nala", "Pit Bull Terrier Mix", "Sunnyvale, CA",
                "Adult", "Female", "Large", R.drawable.pyppy1
            )
        )
    }
}